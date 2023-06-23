package com.citi.demo.railway;

public class RailwayDemo { // 3rd AC 72

	public static void main(String[] args) {

		// 1 to 72
		int berthNumber = 78; // input here
		// lower, middle, upper, side-lower, side-upper
		String berthType = "";

		if (berthNumber >= 1 && berthNumber <= 72) {

			if (berthNumber % 8 == 1 || berthNumber % 8 == 4) {
				berthType = "lower";
			} else if (berthNumber % 8 == 2 || berthNumber % 8 == 5) {
				berthType = "middle";
			} else if (berthNumber % 8 == 3 || berthNumber % 8 == 6) {
				berthType = "upper";
			} else if (berthNumber % 8 == 7) {
				berthType = "side-lower";
			} else {
				berthType = "side-upper";
			}

		} else {
			System.out.println("Invalid berth number!");
		}

		System.out.println("berthNumber: " + berthNumber);
		System.out.println("berthType: " + berthType);

	}
}
