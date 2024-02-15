package com.capsule.main.bottle;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BottleMapper {

    


    
    
        
    @Select("select * from bottle where b_no={no}")
	BottleDTO getBottle(int no);

}
