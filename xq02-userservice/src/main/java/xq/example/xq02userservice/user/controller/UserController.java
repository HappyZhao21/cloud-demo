package xq.example.xq02userservice.user.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xq.example.xqcommon.sp01.pojo.User;
import xq.example.xqcommon.sp01.service.UserService;
import xq.example.xqcommon.util.JsonResult;

@Slf4j
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userId}")
	public JsonResult<User> getUser(@PathVariable Integer userId) {
		log.info("get user, userId="+userId);
		User u = userService.getUser(userId);
		return JsonResult.ok(u);
	}
	
	@GetMapping("/{userId}/score")
	public JsonResult addScore(
            @PathVariable Integer userId, Integer score) {
		userService.addScore(userId, score);
		return JsonResult.ok();
	}
}
