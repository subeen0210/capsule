package com.capsule.main.bottle;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BottleMapper {

    


    
    
        
    @Select("select * from bottle left join shelf on bottle.s_no = shelf.s_no WHERE shelf.u_id = #{id} ORDER BY bottle.b_no ASC")
	BottleDTO getBottle(int no);

}
