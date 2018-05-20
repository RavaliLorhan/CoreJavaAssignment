package com.lorhan.examples;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		String str="abc";
		int[] d=new int[3];
		d[0]=15;
		d[1]=26;
		d[2]=96;
		try {
			
			int i=Integer.parseInt(str);//Here, there is a chance of exception
			System.out.println(i);
			}
		//specific catch block to catch the exception
		catch(ArithmeticException | ArrayIndexOutOfBoundsException |NumberFormatException  e)
		{
			e.printStackTrace();
		}
		//generic catch block
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*unreachable code*/
		/*catch(ArithmeticException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
		System.out.println("Clean up code performed");
		}

	}

}
