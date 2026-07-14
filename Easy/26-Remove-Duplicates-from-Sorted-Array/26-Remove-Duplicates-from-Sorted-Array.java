class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0){
        return 0;
    }
    int writePointer = 0;

    for (int readPointer = 1; readPointer < nums.length; readPointer++){
        if (nums[readPointer] != nums[writePointer]){
           writePointer++;
           nums[writePointer] = nums[readPointer];
        }
    }

    return writePointer + 1;
    }
}