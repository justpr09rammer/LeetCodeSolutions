class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Integer> validIndices = new ArrayList<>();
        int n = isActive.length;
        for (int i = 0; i < n; i++) {
            if (validCode(code[i]) && validBusiness(businessLine[i]) && isActive[i]) {
                validIndices.add(i);
            }
        }

        Map<String, Integer> businessOrder = new HashMap<>();
        businessOrder.put("electronics", 0);
        businessOrder.put("grocery", 1);
        businessOrder.put("pharmacy", 2);
        businessOrder.put("restaurant", 3);

        validIndices.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String bA = businessLine[a];
                String bB = businessLine[b];
                int orderA = businessOrder.get(bA);
                int orderB = businessOrder.get(bB);
                if (orderA != orderB) {
                    return Integer.compare(orderA, orderB);
                } else {
                    return code[a].compareTo(code[b]);
                }
            }
        });
        List<String> result = new ArrayList<>();
        for (int index : validIndices) {
            result.add(code[index]);
        }
        return result;
    }
    public boolean validCode(String code){
        if (code.isEmpty()){
            return false;
        }
        for (Character ch : code.toCharArray()){
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_'){
                return false;
            }
        }
        return true;
    }
    public boolean validBusiness(String business){
        return Objects.equals(business, "electronics") || Objects.equals(business, "grocery") || Objects.equals(business, "pharmacy") || Objects.equals(business, "restaurant");
    }
}
