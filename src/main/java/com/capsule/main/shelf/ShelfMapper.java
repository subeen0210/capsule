package com.capsule.main.shelf;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ShelfMapper {
	
	@Select("select * from bottle left join shelf on bottle.s_no = shelf.s_no WHERE shelf.u_id = #{id} ORDER BY bottle.b_no ASC")
	List<ShelfDTO> getShelfList(String id);
}
