package com.capsule.main.memo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MemoMapper {

    @Select("SELECT * FROM memo WHERE b_no = #{no}")
	List<MemoDTO> getMemoList(@Param("no") int no);
}
