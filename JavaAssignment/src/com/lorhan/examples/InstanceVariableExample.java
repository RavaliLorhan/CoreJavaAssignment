package com.lorhan.examples;

public class InstanceVariableExample {

	public static void main(String[] args) {

		Author author1 = new Author(100,"J.K.Rowling");
		System.out.println(author1);
		Author author2 = new Author(101,"Sidney Sheldon");
		System.out.println(author2);

		
	}

}

class Author
{
	
	//Instance variables : These variables vary for each instance of a class 
	//Here authorId and authorName vary for every author object hence these are instance variables
	private int authorId;
	private String authorName;
	
	
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}
	
	
	
	
}