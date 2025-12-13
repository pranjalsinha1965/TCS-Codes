package DSA.src.search;
// import DSA.src.search.*;
public class binarySearch {
       public static int binarySearchCode(int[] nums, int target, int left, int right)
       {
        if(left <= right)
        {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] < target)
            return binarySearchCode(nums, target, mid + 1, right);
            else 
            return binarySearchCode(nums, target, left, mid - 1);
        }
        return -1;
       }
       public static void main(String args[])
       {
        int[] nums = {10, 20, 30, 40, 55};
        int target = 20;
        int result = binarySearchCode(nums, target, 0, -1);
        System.out.println(result);
       }
}
