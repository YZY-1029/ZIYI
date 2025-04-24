package service;


import java.util.ArrayList;
import java.util.List;

import dao.OrderDAO;
import dao.ProductDAO;
import model.dto.OrderDTO;
import model.entity.Order;

public class OrderService  {
	//創造物件呼叫DAO
	private OrderDAO orderDAO = new OrderDAO();
	private ProductDAO productDAO = new ProductDAO();
	//新增一筆訂單 根據訂單項目(item)新稱一筆訂單並回傳訂單顯示資訊給(OrderDTO)
	public OrderDTO addOrder(String item) {
		Order order = new Order();
		order.setItem(item);
		order.setPrice(productDAO.getProduct(item).getPrice());
		//傳給orderDAO儲存訂單
		orderDAO.save(order);
		//-----------------------
		// 2:回傳訂單顯示資訊(OrderDTO)
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage("您點ㄌ" + order.getItem() + " 價格 "+order.getPrice() + "元");
		
		return orderDTO;
	}
	
	//取得所有資料
	public List<OrderDTO> getOrderHistory() {
		List<Order> orders = orderDAO.findAll();//取得所有資料
		//將 List<Order> 轉 List<OrderDTO>
		List<OrderDTO> orderDTOs = new ArrayList<>();
		//一筆一筆轉
		for(Order order : orders) {
			OrderDTO dto = new OrderDTO();
			dto.setMessage("您點了" + order.getItem() + " 價格 " + order.getPrice() + "元");
			orderDTOs.add(dto);  //逐筆加入道集合中
		}
		return orderDTOs;
	}
	
	//刪除一筆訂單根據 index
	public OrderDTO removeOrder(String index) {
		return removeOrder(Integer.parseInt(index));
	}
	public OrderDTO removeOrder(int index) {
	
		String box = orderDAO.getOrder(index).getItem();
		orderDAO.remove(index);
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage( box + ".移除成功");
		return orderDTO;
	}
	
	//修改單筆
	public OrderDTO updateOrder(int index, String newItem) {
		Order order = orderDAO.getOrder(index);
		String old = order.getItem();
		order.setItem(newItem);
		order.setPrice(productDAO.getProduct(newItem).getPrice());
		orderDAO.update(index, order);
		// 回報結果
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage(old + " 成功修改成 " + newItem);
		return orderDTO;
	}

	
}
