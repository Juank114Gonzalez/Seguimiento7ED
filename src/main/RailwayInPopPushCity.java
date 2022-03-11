package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RailwayInPopPushCity {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> carril = new ArrayList<>();

		int n = sc.nextInt();

		do {
			do {
				for (int i = 0; i < n; i++) {
					carril.add(new ArrayList<Integer>(sc.nextInt()));
				}
			}while (carril.get(carril.size() - 1).get(0) == 0);
			n =sc.nextInt();
		}while(n != 0);
		

		for (ArrayList<Integer> a : carril) {
			for(int b : a) {
				System.out.println(b);
			}
		}

	}
}
