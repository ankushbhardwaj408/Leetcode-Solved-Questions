class Solution {

    public List<List<Integer>> permute(int[] nums) {
        String s = "";
        for (int x : nums) {
           
                switch (x) {
                    case -1:
                        s = s + "A";
                        break;
                    case -2:
                        s = s + "B";
                        break;
                    case -3:
                        s = s + "C";
                        break;
                    case -4:
                        s = s + "D";
                        break;
                    case -5:
                        s = s + "E";
                        break;
                    case -6:
                        s = s + "F";
                        break;
                    case -7:
                        s = s + "G";
                        break;
                    case -8:
                        s = s + "H";
                        break;
                    case -9:
                        s = s + "I";
                        break;
                    case -10:
                        s = s + "J";
                        break;
                    case 10:
                        s = s + "K";
                        break;
                    default: s = s + x;
                }
           
        }
        List<List<Integer>> ans = new ArrayList<>();
        fun("", s, ans);
        return ans;
    }

    public void fun(String s, String up, List<List<Integer>> ans) {
        if (up.length() == 0) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                String l = Character.toString(c);
                int x = 0;
                switch (l) {
                    case "A":
                        x = -1;
                        break;
                    case "B":
                        x = -2;
                        break;
                    case "C":
                        x = -3;
                        break;
                    case "D":
                        x = -4;
                        break;
                    case "E":
                        x = -5;
                        break;
                    case "F":
                        x = -6;
                        break;
                    case "G":
                        x = -7;
                        break;
                    case "H":
                        x = -8;
                        break;
                    case "I":
                        x = -9;
                        break;
                    case "J":
                        x = -10;
                        break;
                    case "K":
                        x = 10;
                        break;
                    default:
                        x = Integer.parseInt(l);
                }

                list.add(x);
            }
            ans.add(list);
            return;
        }

        char ch = up.charAt(0);
        int size = s.length();
        for (int i = 0; i <= size; i++) {
            String l = s.substring(0, i);
            String r = s.substring(i, size);
            fun(l + ch + r, up.substring(1), ans);
        }
    }
}
