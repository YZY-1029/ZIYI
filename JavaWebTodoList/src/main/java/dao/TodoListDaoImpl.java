package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Todo;

public class TodoListDaoImpl extends BaseDao implements TodoListDao {

	@Override
	public List<Todo> findAllTodos() {
		List<Todo> todos = new ArrayList<>();
		
		String sql = "select id, text, completed from todo order by id";
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
			
			// 逐一尋訪 rs 中的每一筆紀錄, 
			// 並將每一筆紀錄轉乘 Todo 物件並加入到 todos 集合中
			// 最後加入到 todos 集合中
			while(rs.next()){
				Todo todo = new Todo();
				todo.setId(rs.getInt("id"));
				todo.setText(rs.getString("text"));
				todo.setCompleted(rs.getBoolean("completed"));
				
				todos.add(todo);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return todos;
	}

	@Override
	public Todo getTodo(Integer id) {
		String sql = "select id, text, completed from todo where id=?";  // 寫成where id=" +id;會被sql injection攻擊
		// 因為有問號所以不使用Statement 要用PreparedStatement 
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, id);
			// 得到 rs 中的紀錄(1或0比) 所以用if
			// 再將該筆紀錄轉乘 Todo 物件並回傳
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					Todo todo = new Todo();
					todo.setId(rs.getInt("id"));
					todo.setText(rs.getString("text"));
					todo.setCompleted(rs.getBoolean("completed"));
					
					return todo;
				}
				
			}
		}catch (SQLException e) {   // 裡面兩個try共用catch
			e.printStackTrace();   
		}	
		return null;
	}

	@Override
	public void addTodo(Todo todo) {
		String sql = "insert into todo(text, completed) value(?,?)";
		try( PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, todo.getText());
			pstmt.setBoolean(2, todo.getCompleted());
			
			int rowcount = pstmt.executeUpdate();  //執行修改/新增
			System.out.println("新增 todo 比數:" + rowcount);
			
		}catch (SQLException e) {   
			e.printStackTrace();   
		}	
	}

	@Override
	public void updateTodoComplete(Integer id, Boolean completed) {
		String sql = "update todo set completed=? where id=?";
		try( PreparedStatement pstmt = conn.prepareStatement(sql)) {
		
			pstmt.setBoolean(1, completed);
			pstmt.setInt(2, id);
			
			int rowcount = pstmt.executeUpdate();
			System.out.println("修改 todo 比數" + rowcount);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateTodoText(Integer id, String text) {
		String sql = "update todo set text=? where id=?";
		try( PreparedStatement pstmt = conn.prepareStatement(sql)) {
		
			pstmt.setString(1, text);
			pstmt.setInt(2, id);
			
			int rowcount = pstmt.executeUpdate();
			System.out.println("修改 todo 筆數" + rowcount);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteTodo(Integer id) {
		String sql = "delete form todo where value=?";
		try( PreparedStatement pstmt = conn.prepareStatement(sql)) {
		
			pstmt.setInt(1, id);
		
			int rowcount = pstmt.executeUpdate();
			System.out.println("刪除 todo 筆數: " + rowcount);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}

}
