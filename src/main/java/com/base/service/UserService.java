package com.base.service;

import com.base.model.UserVO;

import java.util.List;
public interface UserService {
	
	public void insert(UserVO userVO);
	
	public void delete(String userId);
	
	public void update(UserVO userVO);
	
	public List<UserVO> selectList(UserVO userVO);

}
