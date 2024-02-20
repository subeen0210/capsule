package com.capsule.main.memo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jakarta.servlet.http.HttpSession;


@Mapper
public interface MemoMapper {

    @Select("SELECT * FROM memo WHERE b_no = #{no}")
	List<MemoDTO> getMemoList(@Param("no") int no);

//    @Insert("insert into memo VALUES(memo_seq.NEXTVAL, sysdate, #{}, 'testtesttesttest', 'aa.jpg', 13)")
//	int insertMemo(MemoMultiDTO multiDTO, HttpSession hs);

}
