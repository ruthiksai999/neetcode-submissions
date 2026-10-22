class Solution {
    public boolean isAnagram(String s, String t) {
 Map<Character,Integer> h1map = new HashMap<>();
 Map<Character,Integer>h2map = new HashMap<>();
  

  for(char x:s.toCharArray()){
    h1map.put(x,h1map.getOrDefault(x,0)+1);
  }
for(char x:t.toCharArray()){
   h2map.put(x,h2map.getOrDefault(x,0)+1);
}  
if(h1map.equals(h2map))
return true;
else
return false;
    }
}
