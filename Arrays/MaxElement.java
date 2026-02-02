package Arrays;

class MaxFinder
{
     
    int max(int arr[])
    {
        int maxEl = arr[0];
        for(int i = 1; i < arr.length; i++ )
        {
            if (arr[i] > maxEl)
            {
                maxEl = arr[i];

            }

        }

        return maxEl;
    }
}

class MaxElement
{
    public static void main(String[] args) 
    {
        int arr[] = {11,4,5,9,1,8,3,0,15};

        MaxFinder obj1 = new MaxFinder();
        
        System.out.println(obj1.max(arr));

    }
}