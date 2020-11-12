

import java.io.File;
import java.io.IOException;

/**
 * 其他信息
 * length():字节数
 *
 * src.createNewFile();不存在才创建，存在创建成功
 *
 * delete()删除已经存在的文件
 *
 */
public class FileDemo05
{
    public static void main(String[] args)
    {
        File src = new File("C:/Users/32035/Desktop/四大快递.jpg");
        boolean flag = false;
        try
        {
            flag = src.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(flag);
    }
    //补充:con com3... 操作系统的设备名，不能正确创建
}
