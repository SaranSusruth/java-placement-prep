package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 45, 18, 69, 100, 27, 33};

        int largest = arr[0];
        int secondLargest = arr[0];

        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element is: " + secondLargest);
    }
}
