package com.bridgelabz.generics;

public class TestCaseAllGenricsConditions<E>{
	
	E e1;
	E e2;
	E e3;
	
	public<T extends Comparable<T>> void findmaximum(T t1,T t2, T t3) {
		
		if(t1.compareTo(t2)>0 && t1.compareTo(t3)>0) {
			System.out.println("T1 is Maximum = "+t1);
		}else if(t2.compareTo(t1)>0 && t2.compareTo(t3)>0) {
			System.out.println("T2 is Maximum ="+t2);
		}
		else{
		System.out.println("T3 is Maximum = "+t3);
		}	
	}
	
	public static void main(String[] args) {
		
		TestCaseAllGenricsConditions genericsClass= new TestCaseAllGenricsConditions();
		genericsClass.findmaximum("Apple","Peach","Banana");
		genericsClass.findmaximum(10,210,58);
		genericsClass.findmaximum(20.2,50.2,231.0);
	}
}
//all statements are pass like int , float, String allso Apple Peach Banana