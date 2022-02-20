public class Sorting_An_Array {
    public static void main(String[] args) {
        int arr[]={4,3,5,2,6,2,7,4,8,};
        int length= arr.length;
        for (int i=0;i<length;i++)
        {
            for (int j=i+1;j<length;j++)
            {
               if(arr[i]>arr[j])
               {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        for (int i=0;i<length;i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }
}
