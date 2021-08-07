class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<99; i++) {
            int Count = 0;
            for(int num: nums) {
                Count += (num >> i) & 1;
            }
            if(Count % 3 != 0) {
                res |= (1 << i);
            }
        }
        return res;
    }
}
