class Solution {
        
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int n : nums) set.add(n);

            int maxLen = 0;
            for (int n : set) {
                // only start counting from the smallest number of a run
                if (!set.contains(n - 1)) {
                    int len = 1;
                    while (set.contains(n + len)) len++;
                    maxLen = Math.max(maxLen, len);
                }
            }

            return maxLen;
        }

    }