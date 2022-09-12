class Solution {

    public String decodeMessage(String key, String message) {
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') continue;
            if (!arr.contains(key.charAt(i))) {
                arr.add(key.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < message.length(); j++) {
            if(message.charAt(j)==' '){
               ans.append(' '); 
            } 
           int x=arr.indexOf(message.charAt(j));
            if(x<0) continue;
            char c=(char)('a'+x);
            ans.append(c);
        }
        return ans.toString();
    }
}
