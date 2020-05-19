package es.uco.pw.display.javabean;

import java.io.Serializable;

public class ComentariosBean implements Serializable
{
	private String Texto = "";
	private int commentID = 0;
	private int userID = 0;
	
	public ComentariosBean() {}

	public String getText() {
		return Texto;
	}

	public void setText(String text) {
		this.Texto = text;
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
}
