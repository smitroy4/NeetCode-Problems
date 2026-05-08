class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>(); //created hashmap to store string as keys and list of strings as values

        for(String str : strs){
            
            char[] charArray = str.toCharArray(); //created array of string
            
            Arrays.sort(charArray); //sorted the char array
            
            String sortedStr = new String(charArray);   //created a string to contain the elements of charArray as chars
            
            map.putIfAbsent(sortedStr, new ArrayList<>());  //adding to map if absent - the strings(k) and bew arrayList(v)
            map.get(sortedStr).add(str);    //get the strings(k) from map and add the iterating element

        }

        return new ArrayList<>(map.values());   //return new arrayList with maps' values only
        
    }
}
