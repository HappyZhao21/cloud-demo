package xq.example.xqcommon.sp01.service;


import xq.example.xqcommon.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}