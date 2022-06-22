package com.rbrt.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;

	public CommentDTO() {

	}

	public CommentDTO(String txt, Date date, AuthorDTO author) {
		super();
		this.text = txt;
		this.date = date;
		this.author = author;
	}

	public String getTxt() {
		return text;
	}

	public void setTxt(String txt) {
		this.text = txt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
