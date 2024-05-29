// Java program to Find the repeating
// and missing element

public class RepeatMissingNumber {

	static void printTwoElements(int arr[], int size)
	{
		int i;
		System.out.print("The repeating element is ");

		for (i = 0; i < size; i++) {
			int index = Math.abs(arr[i])-1;
			if (arr[index] > 0) // positve-> first time vist
				arr[index] = -arr[index];
			else
				System.out.println(index+1); // negetive-> already visited
		}

		System.out.print("and the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0)
				System.out.println(i + 1);
				break;
		}
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		int n = arr.length;
		printTwoElements(arr, n);
	}
}


