package xq.example.xqcommon.sp01.service;


import xq.example.xqcommon.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
