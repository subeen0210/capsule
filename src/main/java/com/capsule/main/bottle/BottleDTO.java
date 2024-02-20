package com.capsule.main.bottle;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BottleDTO {
    private int b_no;
	private String u_id; 
	private Date b_date;
}
