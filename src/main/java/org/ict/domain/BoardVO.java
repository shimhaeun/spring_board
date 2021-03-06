package org.ict.domain;

import java.sql.Date;
import lombok.Data;

@Data 
public class BoardVO {
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate; //db- 무조건 sql !! date
	private Date updateDate;
}
