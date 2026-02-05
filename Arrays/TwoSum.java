package Arrays;




class FindTwoSum
{
    void toSum(int[] arr, int sum)
    {
       for(int i = 0; i < arr.length; i++)
       {
        for(int j = i+1; j < arr.length; j++)
        {
            if(arr[i] + arr[j] == sum )
            {
                System.out.println("the elements that give the sum are:" + arr[i] +" "+ arr[j]);
            }
            
        }
       }
    }
}

class TwoSum
{
    public static void main(String[] args) {
        
        int sum = 20;
        int arr[] = {11,4,5,9,1,8,3,0,15};

        FindTwoSum obj1 = new FindTwoSum();
        obj1.toSum(arr, sum);
    }
}