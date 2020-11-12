package cn.hsq.异常;

public class Test
{
    public static void main(String[] args)
    {
        TestManager tm = new TestManager();
        tm.eat();
        Student st = new Student();
        st.setID(123123123);
        System.out.println(st.getID());
    }
}

