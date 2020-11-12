import java.io.File;

/**
 * 列出下一级
 * 1、list()列出下级名称
 * 2、listFiles()列出下级File对象
 * 3、列出所有路径
 * listRoots()
 */
public class DirDemo02
{
    public static void main(String[] args)
    {
        File dir = new File("E:/Program/Project08");
        //列出下级名称 list
        String[] subNames = dir.list();
        for(String s:subNames){
            System.out.println(s);
        }
        System.out.println("-------------------------");
        //列出下级File文件 listFiles()
        File[] subFiles = dir.listFiles();
        for(File f:subFiles){
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("########################");
        //列出所有路径
        File[] roots = dir.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }
    }
}
