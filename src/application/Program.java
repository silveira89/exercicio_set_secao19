package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Set<Students> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("How many students for course A? ");
			int numberA = sc.nextInt();
			for (int i = 0; i < numberA; i++) {
				int code = sc.nextInt();
				set.add(new Students(code));
			}
			System.out.print("How many students for course B? ");
			int numberB = sc.nextInt();
			for (int i = 0; i < numberB; i++) {
				int code = sc.nextInt();
				set.add(new Students(code));
			}
			System.out.print("How many students for course C? ");
			int numberC = sc.nextInt();
			for (int i = 0; i < numberC; i++) {
				int code = sc.nextInt();
				set.add(new Students(code));
			}
			System.out.println("Total students: " + set.size());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		
		sc.close();
	}

}
