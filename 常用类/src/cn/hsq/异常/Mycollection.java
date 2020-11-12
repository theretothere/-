package cn.hsq.异常;

public class Mycollection {
    private Object[] elementDate;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public Mycollection(int size){
        elementDate = new Object[size];
    }
    public Mycollection(){
        elementDate = new Object[DEFAULT_CAPACITY];
    }
    public void add(Object obj){
        elementDate[size++] = obj;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int i = 0;i<size;i++){
            sb.append(elementDate[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {
        Mycollection mc = new Mycollection();
        mc.add("aa");
        mc.add("bb");
        System.out.println(mc);
    }
}
