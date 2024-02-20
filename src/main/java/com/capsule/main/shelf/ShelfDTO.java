package com.capsule.main.shelf;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShelfDTO {
	private String u_id;
	private int b_no;
	private Date b_date;
}
