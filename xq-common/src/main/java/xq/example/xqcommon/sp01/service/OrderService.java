package xq.example.xqcommon.sp01.service;


import xq.example.xqcommon.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}
