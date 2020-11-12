package cn.hsq;

public class TestDeleteArray {
    public static void main(String[] args) {
        String[] str = {"百度","京东","鹅肠"};
        Delete(str,0);
        System.out.println("###############");
        extendRange(str);
    }
    public static String[] Delete(String[] s ,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1] = null;
        for(int i = 0; i<s.length ; i++){
            System.out.println(i+"--"+s[i]);
        }
        return s;
    }
    //数组的扩容
    public static String[] extendRange(String[] s1){
//        String[] s1 = {"aa","bb","cc"};
        String[] s2 = new String[s1.length*2+10];
        System.arraycopy(s1,0,s2,0,s1.length);
        for(String a:s2){
            System.out.println(a);
        }
        return s2;
    }
}
