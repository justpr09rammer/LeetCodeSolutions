
class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder();
        boolean camelCase = true;
        for (Character ch : caption.toCharArray()){
            if (ch == ' '){
                camelCase = true;
            }
            else {
                if (camelCase){
                    sb.append(Character.toUpperCase(ch));
                    camelCase = false;
                }
                else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            System.out.println(sb);
        }
        if (!sb.isEmpty()) {
            sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
        }
        sb.insert(0, '#');
        return sb.length() > 100 ? sb.substring(0, 100) : sb.toString();    }
}
