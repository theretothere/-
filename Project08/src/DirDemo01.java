import java.io.File;

/**
 * 创建目录 mkdir():确保上级目录存在，不存在则创建失败
 * mkdirs():上级目录可以不存在，不存在一同创建
 */
public class DirDemo01
{
    public static void main(String[] args)
    {
        File f = new File("E:/Program/Project08/test/01/02");

        boolean b= f.mkdirs();
        System.out.println(b);
    }
}
