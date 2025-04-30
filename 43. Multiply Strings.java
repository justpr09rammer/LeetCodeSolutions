class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int rightPointer = num2.length() - 1;
        List<StringBuilder> list = new ArrayList<>();
        while (rightPointer >= 0){
            int leftPointer = num1.length() - 1;
            int remainder = 0;
            int x2 = num2.charAt(rightPointer) - '0';
            StringBuilder sb = new StringBuilder();
            while (leftPointer >= 0){
                int x1 = num1.charAt(leftPointer) - '0';
                //System.out.println("x1 = " + x1);
                //System.out.println("x2 = "+ x2);
                int y = x1 * x2 + remainder;
                //System.out.println("y = " + y);
                //System.out.println("y % 10 = " + y % 10);
                sb.insert(0,y % 10);
                //System.out.println(sb.toString());
                remainder = y / 10;
                //System.out.println("remainder = " + remainder);
                leftPointer--;
            }
            if (remainder != 0){
                sb.insert(0,remainder);
            }
            list.add(sb);
            rightPointer--;
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            sb.append("0".repeat(i));
            StringBuilder temp = new StringBuilder();
            int carry = 0;
            int p1 = result.length() - 1;
            int p2 = sb.length() - 1;
            while (p1 >= 0 || p2 >= 0) {
                int d1 = (p1 >= 0) ? result.charAt(p1 --) - '0' : 0;
                int d2 = (p2 >= 0) ? sb.charAt(p2 --) - '0' : 0;
                int sum = d1 + d2 + carry;
                temp.insert(0, sum % 10);
                carry = sum / 10;
            }
            if (carry != 0){
                temp.insert(0, 1);
            }
            result = temp;
        }
        int k = 0;
        while (k < result.length() - 1 && result.charAt(k) == '0') {
            k++;
        }
        result = new StringBuilder(result.substring(k));

        //System.out.println(list);
        return result.toString();
    }
}
