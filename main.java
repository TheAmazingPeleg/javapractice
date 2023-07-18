package Ben;

import java.util.Scanner;

public class Ben {
	/*
	 * Bubble Sort - מיון איברים צמודים (גורם לדחיפת האיבר הגדול לסוף המערך)
	 * Insertion Sort - מיון כלל האיברים עד האינדקס הנדרש
	 * Selection Sort - שליפת המקס וזריקתו לסוף
	 */
	public static void BubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i ++) {
			for(int j = 0; j < arr.length - i - 1; j ++) {
				if(arr[j] > arr[j + 1]) { //Swap numbers
					arr[j] += arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] -= arr[j + 1];
				}
			}
		}
	}
	public static void InsertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i ++) {
			int value = arr[i];
			int j;
			for(j = i - 1; j >= 0 && (arr[j] > value); j --) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = value;
		}
	}
	public static void SelectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i ++) {
			int maxValue = arr[0], maxIndex = 0;
			for(int j = 1; j < arr.length - i; j ++) {
				if(arr[j] > maxValue) {
					maxValue = arr[j];
					maxIndex = j;
				}
			}
			arr[maxIndex] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = maxValue;
		}
	}
	public static void main(String[] args) {
		int[] test = {10, 13, 16, -9, 43};
		System.out.println("The numbers that are > 15: ");
		for(int i = 0; i < test.length; i ++) {
			if(test[i] > 15)
				System.out.print(test[i] + ", ");
		}
		System.out.println();
		System.out.println("The sorted array: ");
		SelectionSort(test);
		for(int item : test) {
			System.out.print(item + ", ");
		}
	}
}