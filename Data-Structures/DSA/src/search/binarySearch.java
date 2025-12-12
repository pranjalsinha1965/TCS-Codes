package DSA.src.search;
import DSA.src.search.binarySearch;
public class binarySearch extends BinaryLinearCombined {
       public static int binarySearchCode(int[] nums, int target, int left, int right)
       {
        if(left <= right)
        {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] < target)
            return binarySearch(nums, target, mid + 1, right);
            else 
            return binarySearch(nums, target, left, mid - 1);
        }
        return -1;
       }
}
