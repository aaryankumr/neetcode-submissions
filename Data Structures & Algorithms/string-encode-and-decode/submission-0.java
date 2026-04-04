class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String s: strs){
            encodedString.append(s.length()).append("#").append(s);

        }
        return encodedString.toString();


    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int deliminator = str.indexOf("#", i);
            String stringLen = str.substring(i, deliminator);
            int wordLen = Integer.parseInt(stringLen);
            int startWord = deliminator +1;
            int endWord = startWord + wordLen;
            String result = str.substring(startWord, endWord);
            decodedString.add(result);
            i = endWord;
        }
        return decodedString;
    }
}
