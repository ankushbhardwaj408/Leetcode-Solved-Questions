class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String,List<Character>> map=new HashMap<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')continue;
                String key1="R"+i;
                String key2="C"+j;
                String key3="R"+(i/3)+"C"+(j/3);
                if(!map.containsKey(key1))map.put(key1,new ArrayList<>());
                if(!map.containsKey(key2))map.put(key2,new ArrayList<>());
                if(!map.containsKey(key3))map.put(key3,new ArrayList<>());
                if(map.get(key1).contains(board[i][j]))return false;
                  if(map.get(key2).contains(board[i][j]))return false;
                  if(map.get(key3).contains(board[i][j]))return false;
                map.get(key1).add(board[i][j]);
                map.get(key2).add(board[i][j]);
                map.get(key3).add(board[i][j]);
            }
        }
        return true;
    }
}