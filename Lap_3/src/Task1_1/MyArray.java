package Task1_1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}
	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
	// TODO
		for (int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				return i;
			}
		}
	return -1;
	}
	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
	// TODO
		for (int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				return i;
			}
		}
	return -1;
	}
	public static void main(String[] args) {
		int[] array = {12, 10, 9, 45, 2, 10, 10, 45, 45};
		MyArray myArray = new MyArray(array);
		System.out.println(myArray.iterativeLinearSearch(45));
		
		System.out.println("--------");
		
		int[] array1 = {12, 10, 9, 45, 2, 10, 10, 45};
		MyArray myArray1 = new MyArray(array1);
		System.out.println(myArray.recursiveLinearSearch(15));
	}

}
