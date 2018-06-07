package Demo;


import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;

public class demo {
    /**
     * 有鸡兔共50只，
     * 有脚一共120只
     * 求鸡和兔各有几只？
     */
    @Test
    public void demo01() {
        System.out.println("第一题");
        int head = 50;
        int foot = 120;
        int chookNum, rabbitNum;
        for (int i = 0; i <= head; i++) {
            rabbitNum = i;
            chookNum = 50 - rabbitNum;
            if (rabbitNum * 2 + chookNum * 4 == foot) {
                System.out.println("有" + rabbitNum + "只兔子");
                System.out.println("有" + chookNum + "只鸡");
                continue;
            }
        }
    }

    /**
     * 有1000多人的士兵
     * 1排5人，剩1人；1排7人，剩2人；1排8人，剩3人；
     * 求一共有多少士兵？
     */
    @Test
    public void demo02(){
        System.out.println("第二题");
        for (int i=1000;i<2000;i++){
            if (i%5==1&&i%7==2&&i%8==3){
                System.out.println("有" + i + "名士兵");
            }
        }
    }

    /**
     * 需要找零8元
     * 现在有5元的、2元的、1元的、5角的
     * 问一共有多少种方案？   30种睫毛
     */
    @Test
    public void demo03(){
        System.out.println("第三题");
        int perice=80;
        int perice1=50;
        int perice2=20;
        int perice3=10;
        int perice4=5;
            for (int i=0;i<=perice/perice1;i++) {
                    for (int j = 0; j <= perice/perice2; j++) {
                            for (int a = 0; a <=perice/perice3; a++) {
                                    /*for (int b = 0; b <=perice/perice4; b++) {*/
                                    /*    if (i * perice1 + j * perice2 + a * perice3 + b * perice4 == perice) {*/
                                    /*        System.out.println("有" + i + "张五元的,有" + j + "张2元的,有" + a + "张1元的,有" + b + "张5角的！");*/
                                    /*    } else if (i * perice1 + j * perice2 + a * perice3 + b * perice4 != perice){*/
                                    /*        continue;*/
                                    /* }*/
                                if (perice - i * perice1 - j * perice2 - a * perice3 < 0) {
                                    break;
                                }
                                int b = (perice - i * perice1 - j * perice2 - a * perice3) / perice4;
                                if (i * perice1 + j * perice2 + a * perice3 + b * perice4 == perice) {
                                System.out.println("有" + i + "张五元的,有" + j + "张2元的,有" + a + "张1元的,有" + b + "张5角的！");
                            }
                    }
                }
            }
    }

    /**
     * 1000000以内的自守数（尾数是它本身）
     */
    @Test
    public void demo04() {
            //获取毫秒数
          long begin=System.currentTimeMillis();
          for (int num = 0; num <= 1000000; num++) {
              int a=num*num;
              int b=num%10;
              /**
               * 规律：只有0、1和尾数是5、6的数是自守数
               */
              if (b==0||b==1||b==5||b==6){
                  if (a%10==num||a%100==num||a%1000==num||a%10000==num||a%100000==num||a%1000000==num){
                      System.out.println("这些数字是："+num);
                  }
              }
            /*if (num<=10&&(num*num)%10==num){
                System.out.println("这些数字是："+num);
            }else if (num>10&&num<=100&&(num*num)%100==num){
                System.out.println("这些数字是："+num);
            }else if (num>100&&num<=1000&&(num*num)%1000==num){
                System.out.println("这些数字是："+num);
            }else if (num>1000&&num<=10000&&(num*num)%1000==num){
                System.out.println("这些数字是："+num);
            }else if (num>10000&&num<=100000&&(num*num)%10000==num){
                System.out.println("这些数字是："+num);
            }else if (num>100000&&num<=1000000&&(num*num)%100000==num){
                System.out.println("这些数字是："+num);
            }*/

          }
          long end=System.currentTimeMillis();
          System.out.println("总耗时："+(end-begin));
      }
      @Test
    public void Demo(){
        int num1=2018;
        int num2=20;
        int num3=25;
        int max=num1;
        if (num2>num1){
            max=num2;
        }
          if (num3>num2){
              max=num3;
          }
          System.out.println(max);
      }
    /**
     * 打印等腰三角形
     */
    @Test
    public void demo05(){
        int row=6;
        for (int i=1;i<=row;i++){
            for (int j=row-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 输出下列
     *        A
             ABA
            ABCBA
           ABCDCBA
          ABCDEDCBA
     */
    @Test
    public void demo06(){
        int row=5;
        for (int i=0;i<row;i++){
            for (int j=0;j<8-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print((char)('A'+k));
            }
            for (int n=i-1;n>=0;n--){
                System.out.print((char)('A'+n));
            }
            System.out.println();
        }
    }

    /**
     * 去掉字符串中的空格和逗号
     */
    @Test
    public  void demo07(){
        String string="ab cd,bc,de ac";
        String str="";//隔字符串
        for (int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if (c == ' ' || c == ',') {
                str+="";
            }else {
                str+=c;
            }

        }
        System.out.println(str);
    }

    /**
     * 将每个字母用逗号分开
     */
    @Test
    public void demo08(){
        String string="abcde";
        String str="";
        for(int i=0;i<string.length();i++){
            if(i==string.length()-1){
                str+=string.substring(i,i+1);
                break;
            }else{
                str+=string.substring(i,i+1);
                str+=",";
            }
        }
        System.out.println(str);
    }

    /**
     * 判断字符串是否有重复字母
     */
    @Test
    public void demo09() {
        String str="abcdsfhkill";
        boolean flag=false;
       for (int i=0;i<str.length();i++) {
           char a = str.charAt(i);
        if (str.lastIndexOf(a)!=i){
            flag=true;
        }
       }
        System.out.println(flag);
    }
    /**
     * 将字符串转换为数字
     */
    @Test
    public void demoo10(){
        String str="58620";
        //一步一步的输出
       /* int num=str.charAt(0)-'0';
       num=num*10+str.charAt(1)-'0';
       num=num*10+str.charAt(2)-'0';
         num=num*10+str.charAt(3)-'0';
        num=num*10+str.charAt(4)-'0';*/

       //for循环
        int num=0;
        for (int i=0;i<str.length();i++){
            num=num*10+str.charAt(i)-'0';
        }
        System.out.println(num);
    }
    /**
     * 数字黑洞，给出一个四位数
     * 最大值-最小值=结果
     * 结果最大值-结果最小值=结果
     * ......
     * 求最终的数字
     */
    @Test
    public void demo11(){
        int num=8657;
        for (;;) {
            System.out.println(num);
            //将数字转换为数组
            char[] chars = (num + "").toCharArray();
            //排序
            Arrays.sort(chars);
            int max = 0;
            int min = 0;
            //求最小值
            for (int i = 0; i < chars.length; i++) {
                min = min * 10 + chars[i] - '0';
            }
            //求最大值
            for (int i = chars.length - 1; i >= 0; i--) {
                max = max * 10 + chars[i] - '0';
            }
            int result = max - min;//第一次结果
            if (result == num)
                break;
            num = result;//每次结果变为新的参数
        }
    }
    /**
     * 任意数字之间进制的转换
     */
    @Test
    public void demo12(){
        String str="20011002";
        BigInteger num=new BigInteger(str,3);
        System.out.println(num.toString(5));
        //底层代码
        int m=0;
        for (int i=0;i<str.length();i++) {
            char n = str.charAt(i);
            //转换几进制就乘以几
            m = m * 3 + (n - '0');
        }
        System.out.println(m);
        //第一结果
        String result="";
        //死循环
            for (;;){
                if (m==0){
                    break;
            }
                //转换几进制就余几
            result=m%5+result;
                m=m%5;
        }
        System.out.println(result);




//10进制->2进制

        String a = "-1195";//输入数值

        BigInteger src = new BigInteger(a);//转换为BigInteger类型

        System.out.println(src.toString(2));//转换为2进制并输出结果

//2进制->10进制

        String a1 = "10010101011";//输入数值

        BigInteger src1 = new BigInteger(a1, 2);//转换为BigInteger类型

        System.out.println(src.toString());//转换为2进制并输出结果

      /*  由此可见，有2点要注意：

        1. BigInteger的构造函数

        BigInteger(String src)默认参数字符串为10进制数值

        BigInteger(String src, int x)第2个参数x是指定第一个参数src的进制类型

        2. toString方法

        toString()默认把数值按10进制数值转化为字符串。

        toString(int x)把数值按参数x的进制转化为字符串。*/



//十进制转其他进制

        String str2="1689";

        int number;

//转2进制

        number = Integer.parseInt(str2);

        System.out.println(Integer.toBinaryString(number));

//转8进制

        number = Integer.parseInt(str2);

        System.out.println(Integer.toOctalString(number));

//转16进制

        number = Integer.parseInt(str2);

        System.out.println(Integer.toHexString(number));
    }

    /**
     * 使用正则去掉空格或者。。。
     * 获取字符串
     */
    @Test
    public  void demo13() {
        String string = "abc bcd  dvf asd   asd  123";
        /*String []str = string.split(" {1,}");*/
        String []str = string.split(" +");
        for (int i = 0; i < string.length(); i++) {
          System.out.println(str[i]);
        }
    }
    /**
     * 使用正则获取字符串中字母和数字出现次数
     * 字母最多三次，数字最多五次，否则返回false
     */
    @Test
    public  void demo14() {
        String string = "AD123";
        System.out.println(string.matches("[A-Z]{1,3}[0-9]{1,5}"));
    }
    /**
     * 使用正则替换字符串中的日期格式
     * asdd 2018-05-29 dsadsadas
     * asdd 05/29 2018年 dsadsadas
     */
    @Test
    public  void demo15() {
        String string = "asdd 2018-05-29 dsadsadas";
        //正则里面括号中的表达式使用$n(第几次出现）可以继续匹配原字符
        string=string.replaceAll("([0-9]{4})-([0-9]{2})-([0-9]{2})","$2/$3 $1年");
        System.out.println(string);
    }
    /**
     * 对字符串进行加密和解密
     */
    @Test
    public  void demo16() throws UnsupportedEncodingException {
        String pwd = "abcde";
        String key="大家辛苦了";
        //将字符串转换为数字数组
        byte[] keys=key.getBytes("utf-8");
        byte[] pwds=pwd.getBytes("utf-8");
        System.out.println("加密前："+new String(keys,"utf-8"));
        for (int i=0;i<keys.length;i++){
            //第一种，需要强转
           // keys[i]=(byte)(keys[i]^pwds[i%pwds.length]);
            //第二种,不需要强转
            keys[i]^=pwds[i%pwds.length];
        }
        System.out.println("加密后："+new String(keys,"utf-8"));
        for (int i=0;i<keys.length;i++){
            //第一种，需要强转
            // keys[i]=(byte)(keys[i]^pwds[i%pwds.length]);
            //第二种,不需要强转
            keys[i]^=pwds[i%pwds.length];
        }
        System.out.println("解密后："+new String(keys,"utf-8"));
    }
    }


