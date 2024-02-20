package com.capsule.main.memo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemoMultiDTO {
	
	private MultipartFile file;
	private int m_no;
	private Date m_date;
	private String m_keyword;
	private String m_text;
	private String m_pic;
	
}
