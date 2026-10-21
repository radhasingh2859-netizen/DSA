
class solution2 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        java.util.Arrays.sort(nums);
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;

            } else {
                i++;

                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 5, 2, 1};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

}
