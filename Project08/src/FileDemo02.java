import java.io.File;

/**
 * 构建File对象
 * 相对路径和绝对路径
 * 1）、存在盘符：绝对路径
 * 2）、不存在盘符：相对路径 user.dir
 *
 */
public class FileDemo02
{
    public static void main(String[] args)
    {
        String path = "C:/Users/32035/Desktop";
        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        //相对路径
        src = new File("IO.png");
        System.out.println(src.getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        //构建一个不存在的文件
        File src1 = new File("aaa/IO.png");
        System.out.println(src1.getAbsolutePath());
    }
}
