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
	private int s_no;
	private Date b_date;
	private int m_no;
}
