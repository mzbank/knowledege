package job.Knowledge.distinct;

public class coper {
//     1 package com.smyh;
// 2
//         3 public class ObjectDemo {
// 4     public static void main(String args[]){
//            5         Student student1 = new Student("生命壹号",22,"成都");
//            6         Student student2 = new Student("生命壹号",22,"成都");
//            7         System.out.println(student1==student2);
//            8         System.out.println(student1.equals(student2));
//            9     }
//10 }
//11 class Student {
//12     private String name;
//13     private int age;
//14     private String address;
//15     public Student(String name,int age,String address){
//            16         this.name = name;
//            17         this.age = age;
//            18         this.address = address;
//            19     }
//20     //重写Object类中的equals方法（比较两个对象的值是否相等）
//        21     public boolean equals(Object obj){
//            22         //为了提高效率：如果两个内存地址相等，那么一定是指向同一个对内存中的对象，就无需比较两个对象的属性值（自己跟自己比，没啥意义嘛）
//            23         if(this==obj){
//                24             return true;
//                25         }
//            26
//            27         //为了提供程序的健壮性
//            28         //我先判断一下，obj是不是学生的一个对象，如果是，再做向下转型，如果不是，直接返回false。
//            29         //这个时候，我们要判断的是对象是否是某个类的对象?
//            30         //记住一个格式：对象名 instanceof 类名。表示：判断该对象是否是该类的一个对象
//            31         if(!(obj instanceof Student)){
//                32             return false;
//                33         }
//            34
//            35         //如果是就继续
//            36         Student s = (Student)obj;//强制转换，即向下转型（毕竟Object类型没有具体的对象属性）
//            37         return this.name.equals(s.name) && this.age == s.age && this.address.equals(s.address);//判断两个对象的属性值是否相等
//            38     }
//39 }
}
