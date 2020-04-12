package xq.example.xq01service.item.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import xq.example.xqcommon.sp01.pojo.Item;
import xq.example.xqcommon.sp01.service.ItemService;
import xq.example.xqcommon.util.JsonResult;

import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/{orderId}")
	public JsonResult<List<Item>> getItems(@PathVariable String orderId) throws Exception {
		log.info("server.port="+port+", orderId="+orderId);

		///--设置随机延迟
		if(Math.random()<0.6) { 
			long t = new Random().nextInt(5000);
			log.info("item-service-"+port+" - 暂停 "+t);
			Thread.sleep(t);
		}
		///~~
		
		List<Item> items = itemService.getItems(orderId);
		return JsonResult.ok(items).msg("port="+port);
	}
	
	@PostMapping("/decreaseNumber")
	public JsonResult decreaseNumber(@RequestBody List<Item> items) {
		itemService.decreaseNumbers(items);
		return JsonResult.ok();
	}
}