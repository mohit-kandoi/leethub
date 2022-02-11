class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> matchingmap = new HashMap<>();
        HashMap<Character, Integer> variablemap = new HashMap<>();
        
        if(s1.length() > s2.length()) return false;
        
        //Inserting s1 string in map.
        for(int i=0; i<s1.length(); i++){
            matchingmap.put(s1.charAt(i), matchingmap.getOrDefault(s1.charAt(i),0)+1);
        }
        
        // inserting s2 string in map for checking.
        int index=0;
        for(int i=0; i<s1.length(); i++){
            variablemap.put(s2.charAt(i), variablemap.getOrDefault(s2.charAt(i),0)+1);
            
        }
        
        if(matchingmap.equals(variablemap)){
            return true;
        }
        
        for(int i=s1.length(); i<s2.length();i++){
            
            if(variablemap.get(s2.charAt(i-s1.length())) == 1){
                variablemap.remove(s2.charAt(i-s1.length()));
            }else{
                variablemap.put(s2.charAt(i-s1.length()), variablemap.getOrDefault(s2.charAt(i-s1.length()),0)-1);
            }
            
             variablemap.put(s2.charAt(i), variablemap.getOrDefault(s2.charAt(i),0)+1);
                             
             if(matchingmap.equals(variablemap)){
                return true;
             }
            
        }
            return false;
        
    }
}