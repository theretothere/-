import java.io.File;

/**
 *  \ / 名称分隔符
 */
public class PathDemo01
{
    public static void main(String[] args)
    {
        String path = "C:\\Users\\32035\\Desktop";
        System.out.println(File.separatorChar);

        //建议
        //1./
        String path2 = "C:/Users/32035/Desktop";
        //2.字符拼接
        path2 = "C:"+File.separator;
    }
}
