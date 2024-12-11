package riza;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] array = {10, 30, 20, 40};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second Largest Element: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int value : array) {
            
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element in the array.");
        }

        return secondLargest;

	}

}
