class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] countS = s.toCharArray();
        char[] countT = t.toCharArray();

        Arrays.sort(countS);
        Arrays.sort(countT);

        return Arrays.equals(countS, countT);

    }
}