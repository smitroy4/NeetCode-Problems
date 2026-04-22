class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] countS = s.toCharArray();
        char[] countT = t.toCharArray();

        Arrays.sort(countS);
        Arrays.sort(countT);

        if(Arrays.equals(countS, countT)){
            return true;
        }
        

        return false;

    }
}
