
class OrderedStream {
    String[] list;
    int pointer;
    int size;
    public OrderedStream(int n) {
        this.list = new String[n + 1];
        this.pointer = 1;
        size = n;
    }
    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        list[idKey] = value;
        if (idKey == pointer){
            while (pointer <= this.size && list[pointer] != null){
                  result.add(list[pointer]);
                pointer ++;
            }
        }
        return result;
    }

}
