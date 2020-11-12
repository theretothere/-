package cn;

public class hsq {
    //这个文件是在计算机内 画的一张图纸
    //描述计算机里的人类长成什么样子

    //属性--静态描述特点
    //必要组成的部分
    //修饰符 数据类型 属性名字 [= 值]；
    //权限修饰符 [特征修饰符] 数据类型 数据类型 属性名字 [= 值]；
    public String name;//全局变量
    public int age;
    public char sex;//‘男’  ‘女’
    //方法--描述可以做什么事情（动作)
    public void eat(){
        System.out.println("吃了一碗大米饭");
    }
    //设计一个方法  用来告诉别人我的名字
    //若方法的设计规定了返回值的类型  方法内必须通过return关键字返回一个值
    public String tellName(){
        System.out.println("大发慈悲告诉你，我的名字");
        return "胡苏秦";
    }
    //设计一个新的吃饭方法
    public void chiFan(int count,String somnething ){
        System.out.println("吃了"+count+"碗"+somnething);
    }
    //设计一个方法 买饮料 1.需不需要提供条件 2. 需不需要给别人留下什么结果
    //需要提供条件  钱
    //需要干回执 买到的饮料 名字
    public String buyDrink(int money){
        if(money>5){
            return "红牛";
        }else{
            return "矿泉水";
        }
    }
    public void drawStar(int line,boolean f){
        //f表示方向 f==true 偏左没有空格 f==false 偏右 带空格
        for(int i =1;i<=line;i++){
            if(!f){
                for(int j=1;j<=line-i;j++){
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
