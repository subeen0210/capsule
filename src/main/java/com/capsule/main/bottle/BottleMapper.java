package com.capsule.main.bottle;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BottleMapper {

    


    
    
        
    @Select("select * from happy_bottle where b_no=#{no}")
	BottleDTO getBottle(int no);

    @Insert("insert into happy_bottle values(happy_bottle_seq.nextval, #{u_id}, sysdate")
	int createBottle(String u_id);
    
    @Select("SELECT happy_bottle_seq.currval as b_no FROM dual")
    int curBottleNo();
    
 
}
