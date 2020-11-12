package cn.hsq;

public class TestPromitiveDateType3 {
    public static void main(String[] args){
        char c = '\u0061';
        System.out.println(c);

        //转义字符
        System.out.println('a'+'b');
        System.out.println(""+'a'+'\n'+'b');

        //String就是字符序列
        //char a = "sdf";
        String a = "sdf";
        boolean man = true;
        if(man){
            System.out.println("男性");
        }
        if(man==true){//极端不推荐：man==ture
            System.out.println("男性");
        }
    }
}
