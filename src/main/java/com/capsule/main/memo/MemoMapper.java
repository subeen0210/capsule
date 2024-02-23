package com.capsule.main.memo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jakarta.servlet.http.HttpSession;


@Mapper
public interface MemoMapper {

    @Select("SELECT * FROM happy_memo WHERE b_no = #{no}")
	List<MemoDTO> getMemoList(@Param("no") int no);

    @Select("Select * from happy_memo where m_no=#{no}")
    MemoDTO openMemo(@Param("no") int no);

    
    @Insert("insert into happy_memo values(happy_memo_seq.nextval, #{b_no},sysdate, #{m_keyword},#{m_text},#{m_pic})")
	int insertMemo(MemoDTO memoDTO);

    @Select("select count(m_no) as num_m_no from happy_memo where b_no = #{no}")
	int countMemo(int no);
    
//    @Insert("insert into memo VALUES(memo_seq.NEXTVAL, sysdate, #{}, 'testtesttesttest', 'aa.jpg', 13)")
//	int insertMemo(MemoMultiDTO multiDTO, HttpSession hs);

}
