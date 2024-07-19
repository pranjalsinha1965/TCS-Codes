public class NonRepeatingElements {
    // Function to find non-repeating elements in the array
    static void findNonRepeatingElement(int nums[]) {
        boolean chk;
        for (int i = 0; i < nums.length; i++) {
            chk = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    chk = true;
                    break;
                }
            }
            if (!chk) System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, -1, 1, 3, 1};
        System.out.println("Non-repeating numbers are: ");
        findNonRepeatingElement(nums);
    }
}
