package Arrays;

class ReverseOfArray
{
    void reverseArr(int arr[])
    {
        int temp;
        int f = 0;
        int l = arr.length-1;
        System.out.println("original order of array elements is");
        for(int i = 0; i < arr.length; i++ )
        {
            System.out.println(arr[i]);
        }
        System.out.println("after reversing the array");

        
        while(f<l)
        {

                temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                f++;
                l--;
        }
        for(int i = 0; i < arr.length; i++ )
        {
            System.out.println(arr[i]);
        }
    }
}

public class ReverseArr 

    {
        public static void main(String[] args) 
        {
            int arr[] = {11,4,5,9,1,8,3,0,15};

            ReverseOfArray obj1 = new ReverseOfArray();

            obj1.reverseArr(arr);
            
            
        }
    
    }
