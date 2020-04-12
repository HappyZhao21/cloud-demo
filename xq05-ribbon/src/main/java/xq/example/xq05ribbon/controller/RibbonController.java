package xq.example.xq05ribbon.controller;/*
 * @author  Zhao XiQing
 * @date  2020/4/12 17:39
 * @Email:zxqzxq0224@163.com
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import xq.example.xqcommon.sp01.pojo.Item;
import xq.example.xqcommon.sp01.pojo.Order;
import xq.example.xqcommon.sp01.pojo.User;
import xq.example.xqcommon.util.JsonResult;

import java.util.List;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate rt;

    @GetMapping("/item-service/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        //这里服务器路径用 service-id 代替，ribbon 会向服务的多台集群服务器分发请求
        return rt.getForObject("http://item-service/{1}", JsonResult.class, orderId);
    }

    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        return rt.postForObject("http://item-service/decreaseNumber", items, JsonResult.class);
    }

    /////////////////////////////////////////

    @GetMapping("/user-service/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        return rt.getForObject("http://user-service/{1}", JsonResult.class, userId);
    }

    @GetMapping("/user-service/{userId}/score")
    public JsonResult addScore(
            @PathVariable Integer userId, Integer score) {
        return rt.getForObject("http://user-service/{1}/score?score={2}", JsonResult.class, userId, score);
    }

    /////////////////////////////////////////

    @GetMapping("/order-service/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId) {
        return rt.getForObject("http://order-service/{1}", JsonResult.class, orderId);
    }

    @GetMapping("/order-service")
    public JsonResult addOrder() {
        return rt.getForObject("http://order-service/", JsonResult.class);
    }
}