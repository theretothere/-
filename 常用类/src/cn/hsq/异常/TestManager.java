package cn.hsq.异常;

public class TestManager
{
    public String name;
    public int ID;

    public TestManager()
    {
        System.out.println("这是构造方法");
    }

    public TestManager(int i)
    {
        System.out.println("这是有参数的构造方法");
    }

    public void eat()
    {
        this.sleep();
        System.out.println("人类的吃饭方法");
    }

    public void sleep()
    {
        System.out.println("这是人类睡觉方法");
    }

    public void run()
    {

    }
}
class Student
{
    private String name;
    private int ID;
    private String sex;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
}
