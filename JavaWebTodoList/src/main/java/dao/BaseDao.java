package dao;


import java.sql.Connection;
import java.sql.DriverManager;
// 用來讓不同的 xxxDao 透過 extends BaseDao 可以連接 MySQL
public class BaseDao {
	protected static Connection conn;
	
	static {
	    // 連線參數
	    String username = "root";
	    String password = "abc123";
	    String dbUrl = "jdbc:mysql://localhost:3306/todolist?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true&useSSL=false";
	    			 //驅動類型       host(mysql是3306) 名字        時區                     &          字元集         &useUnicode=true&useSSL=false"
	
		    // 建立連線     
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // 註冊 MySQL Driver  // 動態建立實體  // jdbc4.0以上的時候從libraries>Maven>mysql-connext>META-INF>service>Drive找
	      conn = DriverManager.getConnection(dbUrl, username, password); // 連線建立
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	}
}
