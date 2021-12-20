package com.dgsl.java.interview;

public class PrintWordRowColumnFromTable {

	public static int printRowColumn(String[][] inputArray, String inputWord) {

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[i][j] == inputWord) {
					System.out.println("Element found at " + i + " row and " + j + " column");
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		String[][] inputArray = { { "", "", "", "" }, { "", "", "Baker Hughes", "" }, { "", "", "", "" },
				{ "", "", "", "" } };

		printRowColumn(inputArray, "Baker Hughes");

	}

}
