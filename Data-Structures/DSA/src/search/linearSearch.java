package DSA.src.search;
public class linearSearch extends BinaryLinearCombined{
    public static int linearSearchCode(int nums[], int target)
    {
        int steps=0;
		for(int i=0;i<nums.length;i++)
		{
			steps++;
			if(nums[i] == target) {
				System.out.println("Steps taken by Linear: "+steps);
				return i;
			}
		}	
		System.out.println("Steps taken by Linear: "+steps);
		return -1;
    }
}
