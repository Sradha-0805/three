import java.util.*;
class Sorty {
    public void wiggleSort(int[] nums) {
    if (nums == null || nums.length <= 1) {
        return;
    }
 
    for (int i = 1; i < nums.length; i++) {
        if (i % 2 == 1) {
            if (nums[i - 1] > nums[i]) {
                swap(nums, i - 1, i);
            }
        } else {
            if (nums[i - 1] < nums[i]) {
                swap(nums, i - 1, i);
            }
        }
    }
}
 
private void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
}
    public static void main(String arg[])
    {
       Sorty obj=new Sorty();
        System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       int[] arr = new int[k]; 
        for(int i=0;i<k;i++)
        {
            System.out.println("Enter the array elements:");
            arr[i]=sc.nextInt();
            
        }
 
        obj.wiggleSort(arr);
        for (int i : arr) 
            System.out.print(i + " "); 
    }
}
