package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ThrowingCardsAway {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 1;

		while (x != 0) {
			if(x!=0) {
				x= sc.nextInt();
			}
			ArrayList<Integer> cards = new ArrayList<>();
			if (x != 0) {
				for (int i = 1; i <= x; i++) {
					cards.add(i);
				}
				String acumulate = "Discarder cards: ";
				String comma = ",";
				for (int i = 0; cards.size() >= 2; i++) {
					cards.add(cards.get(1));
					int discarder = cards.get(0);
					cards.remove(0);
					cards.remove(0);
					if(cards.size() >= 2) {
						acumulate += discarder + comma;
					}
					else {
						acumulate += discarder;
					}
				}
				System.out.println(acumulate);
				System.out.println("Remaining cards: " + cards.get(0));
				if(x==0) {
					break;
				}
			}
			
		}

	}
}