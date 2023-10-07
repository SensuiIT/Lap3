package Task1_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray {

	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {

		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				return left = mid + 1;
			} else {
				return right = mid - 1;
			}
		}
		return -1;
	}

	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
		// TODO
	public int recursiveBinarySearch(int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;

			} else if (array[mid] < target) {
				return left = mid + 1;
			} else {
				return right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array ={12, 10, 9, 45, 2, 10, 10, 45};
		MyArray myArray = new MyArray(array);
		System.out.println(myArray.iterativeBinarySearch(10));
		System.out.println(myArray.recursiveBinarySearch(4));
	}
}
