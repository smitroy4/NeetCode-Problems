class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>(); //1. created hashmap to store string as keys and list of strings as values

        for(String str : strs){ //2. iterate over the string array with a string
            
            char[] charArray = str.toCharArray(); //3. created array of chars to contain the chars of the string array
            
            Arrays.sort(charArray); //4. sorted the char array
            
            String sortedStr = new String(charArray);   //5. created a string to contain the elements of charArray as chars
            
            map.putIfAbsent(sortedStr, new ArrayList<>());  //6. adding to map if absent - the strings(k) and bew arrayList(v)
            map.get(sortedStr).add(str);    //7. get the strings(k) from map and the iterating element

        }

        return new ArrayList<>(map.values());   //8. return new arrayList with maps' values only
        
    }
}
