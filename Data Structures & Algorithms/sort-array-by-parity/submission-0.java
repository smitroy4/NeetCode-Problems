public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] A = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(A, (a, b) -> (a & 1) - (b & 1));
        return Arrays.stream(A).mapToInt(Integer::intValue).toArray();
    }
}