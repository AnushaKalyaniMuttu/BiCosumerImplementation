package com.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerImplementation {

	static BiConsumer<String,List<String>> biConsumer=(name,activities)->System.out.println(name+" "+activities);
	public static void nameAndActivities() {
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(student->biConsumer.accept(student.getName(), student.getActivities() ));
		}
	public static void main (String[] args) {
		BiConsumer<String,String> biConsumer=(a,b)->System.out.println("a:"+a+" b:"+b);
		biConsumer.accept("java7", "java8");
		BiConsumer<Integer,Integer> multiply=(a,b)->System.out.println(a*b);		
		BiConsumer<Integer,Integer> division=(a,b)->System.out.println(a/b);		
		multiply.andThen(division).accept(15, 2);
		nameAndActivities();
	}
}
