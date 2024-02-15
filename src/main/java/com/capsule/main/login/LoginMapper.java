package com.capsule.main.login;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

	@Select("select * from happy_user where")
	void checkLogin();

	
	@Insert("insert into happy_user values(#{u_id}, #{u_pw}, #{u_email}, #{u_name})")
	int signUp(UserDTO userDTO);

}
