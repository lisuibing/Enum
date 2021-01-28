package com;

import java.util.Base64;

/**
 * @Auther:lisuibing
 * @Date: 2021/1/8
 * @Description: PACKAGE_NAME
 * @Version: 1.0
 */
public enum Color {
   //修改Enum
    RED("红色",1),GREEN("绿色",2),BLANK("白色", 3), YELLO("黄色", 4);

    private  String name;
    private int index;

    private Color(String name,int index){
        this.name=name;
        this.index=index;

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

class  B{
    public static void main(String[] args){
        System.out.println("红色是"+Color.RED.getName());
        System.out.println(Color.RED.getIndex());

          Color.RED.setName("绿色");
          System.out.println("红色是"+Color.RED.getName());

          for (Color color:Color.values()){
              System.out.println(color+"---"+color.getName()+"--"+color.getIndex());
          }

          String arr[]={"apple","banana","pean","orange"};

          for (String str:arr){
             System.out.println(str+"="+arr.length);
          }

       String clientId = "abcd";
       String clientSecret = "1234";
       System.out.println(Base64.getUrlEncoder().encodeToString((clientId + ":" + clientSecret).getBytes()));
     //OjEyMzQ=
    }

}
