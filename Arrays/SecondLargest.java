package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {55, 451, 18, 69, 100, 27, 33};

        int max = arr[0];
        int smax = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i]> max)
            {
                smax = max;
                max = arr[i];
            }
            else if(arr[i]< max && arr[i] > smax )
            {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    
    }
}
