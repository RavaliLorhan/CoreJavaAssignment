package com.lorhan.examples;

//this keyword always refers to current object.It is used to access variables and methods of the current object
public class ThisKeywordExample {

	public static void main(String[] args) {

		Author1 author1 = new Author1(125,"J.K Rowling");
		System.out.println(author1);
	}

}

class Author1
{
	private int authId;
	private String authName;
	
	
	public Author1(int authId, String authName) {
		//Here this.authId refers to authId in current instance of Author1 class
		this.authId = authId;
		this.authName = authName;
	}
	
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}

	@Override
	public String toString() {
		return "Author1 [authId=" + authId + ", authName=" + authName + "]";
	}
	
	
	
}