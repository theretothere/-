import java.io.File;

public class FileDemo01
{
    public static void main(String[] args)
    {
        String path = "C:/Users/32035/Desktop";
        //1.构建File对象
        File src = new File(path);
        System.out.println(src.length());
        //2.构建file对象 父子对象
        src = new File("C:/Users/32035/Desktop","Desktop");
        src = new File("C:/Users/32035/","Desktop");
        System.out.println(src.length());
        //3.构建File对象 父对象 子进程
        src = new File(new File("C:/Users/32035/"),"Desktop");
    }
}
