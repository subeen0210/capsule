package com.capsule.main.login;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

	@Select("select * from happy_user where u_id = #{u_id}")
	void checkLogin(String u_id);
	
	@Insert("insert into happy_user values(#{u_id}, #{u_pw}, #{u_email}, #{u_name})")
	int signUp(UserDTO userDTO);

	@Select("select * from happy_user where u_id = #{u_id}")
	UserDTO checkID(String u_id);

	@Select("select * from happy_user where u_email = #{u_email}")
	UserDTO checkMail(String u_email);

}
