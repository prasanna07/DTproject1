package com.niit.shoppingcart;

public class TestProduct1 {
	private static Product1 p1;
	private static Product1 p2;

	public static void main(String[] args) {
		p1=new Product1();
	    p2=new Product1();
		p1.setId(101);
		p1.setName("iphone");
		p1.setPrice(65000);
		p2.setId(102);
		p2.setName("sony");
		p2.setPrice(75000);
		System.out.println("id:" +p1.getId());
	System.out.println("name:"+p1.getName());
	System.out.println("price"+p1.getPrice());
	System.out.println("id:" +p2.getId());
	System.out.println("name:"+p2.getName());
	System.out.println("price"+p2.getPrice());
	}
	}


