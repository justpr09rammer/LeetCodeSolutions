
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int leftPointer = 0;
        int n = s.length();
        List<StringBuilder> list = new ArrayList<>();
        while (leftPointer < n) {
            // this is kinda we are skipping the leading spaces
            while (leftPointer < n && s.charAt(leftPointer) == ' ') {
                leftPointer ++;
            }
            StringBuilder temp = new StringBuilder();
            while (leftPointer < n && s.charAt(leftPointer) != ' ') {
                temp.append(s.charAt(leftPointer));
                leftPointer ++;
            }
            System.out.println(temp);
            if (!temp.isEmpty()) {
                list.add(temp);
            }
        }
        for (int i = list.size() - 1; i >= 0; i --) {
            sb.append(list.get(i));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
