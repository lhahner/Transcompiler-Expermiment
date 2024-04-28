package com.env.transexp;

class NotAllowedException extends Exception {
	public static final long serialVersionUID = 1;
	public NotAllowedException() {
		super("This kind of Expression is not allowed, please provide something ohter");
	}
}
public class Sorting {
	/**
	 * @param arr
	 * @param a
	 * @param b
	 * @return arr
	 */
	int[] swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		return arr;
	}
	/**
	 * @todo
	 * @param arr
	 * @return arr
	 */
	int[] sortArray(int[] arr) {
		try {
			for (int i = 0; i < length(arr); i++) {

			}
			return arr;
		} catch (NotAllowedException nae) {
			System.out.println(nae);
			return null;
		}
	}
	/**
	 * 
	 * @param arr
	 * @return coutner
	 */
	int length(int[] arr) throws NotAllowedException {
		if(arr.length > 5) {
			throw new NotAllowedException(); 
		}
		else {
			int counter = 0;
			for (int items : arr) {
				print(counter + ": " + items + "\n");
				counter++;
			}
			return counter;
		}
	}
	void print(String p){
		System.out.println(p);
	}
}

