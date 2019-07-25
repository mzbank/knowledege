package job.reflect.good;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    /**
     * 获取反射对象三种方法(反射入口) Class 1.Class.ForName()
     *
     * */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
//        第一种方法 Class.ForName()
        try {
            Class<?> perClazz = Class.forName("job.reflect.good.Person");
            System.out.println(perClazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        第二种方法 类名.class
        Class<?> perClazz2 = Person.class;
        System.out.println(perClazz2);
        //    第三种方法 对象.getClass()
        Person person = new Person();
        Class<?> perClazz3 = person.getClass();
        Method method = perClazz2.getDeclaredMethod("myinterface2");
        try {
            method.invoke(perClazz2.newInstance());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }


}
