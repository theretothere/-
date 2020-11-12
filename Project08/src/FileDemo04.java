import java.io.File;

public class FileDemo04
{
    public static void main(String[] args)
    {
        File src = new File("C:\\Users\\32035\\Desktop\\四大快递.jpg");

        System.out.println("是否存在:"+src.exists());
        System.out.println("是否文件:"+src.isFile());
        System.out.println("是否文件夹:"+src.isDirectory());
//文件状态
        src = new File("C:\\\\Users\\\\32035\\\\Desktop\\\\四大快递.jpg");
        if(null == src||!src.exists()){
            System.out.println("文件不存在");
        }else{
            if(src.isFile()){
                System.out.println("是文件操作");
            }else{
                System.out.println("是文件夹操作");
            }
        }
    }
}
