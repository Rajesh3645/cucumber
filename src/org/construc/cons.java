package org.construc;

public class cons {
	public cons() {
		System.out.println("constructor");
		}
	public cons(int a) {
		System.out.println("argument int");
	}
	private void cons(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		cons c=new cons();
		cons c1=new cons(6);
		
		
	}

}
