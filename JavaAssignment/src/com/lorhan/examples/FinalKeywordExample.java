package com.lorhan.examples;

public class FinalKeywordExample {

// final variable cannot be modified
	final int i = 10;
	public static void main(String[] args) {

		FinalKeywordExample fk = new FinalKeywordExample();
		fk.printiValue();
		Message m = new Message("Java Programming Language");
		m.display();
		
	}
	// final method cannot be overridden
	final void printiValue()
	{
		System.out.println("i value is "+i);
	}
}

// final class cannot be extended
final class Message {
	private String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	void display() {
		System.out.println(msg);
	}
}