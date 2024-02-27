package com.capsule.main.shelf;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.capsule.main.memo.MemoDTO;

@Mapper
public interface ShelfMapper {
	
	@Select("SELECT * FROM happy_bottle WHERE u_id = (SELECT u_id FROM happy_user WHERE u_id = #{id}) ORDER BY b_no DESC")
	List<ShelfDTO> getShelfList(@Param("id") String id);
	
	@Select("Select * from happy_memo where b_no=#{no}")
	List<MemoDTO> getBottleMemo(@Param("no") int no);
	
}
