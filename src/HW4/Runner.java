package HW4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так, чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем
        UserMeta dimooon = new UserMeta("Dimooon", 22);
        getMetaData(dimooon);
        getMetaAttribute(dimooon);
        getMetaMethod(dimooon);
    }
    public static void getMetaData (UserMeta userMeta) {
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            Arrays.stream(userMeta.getClass().getDeclaredFields()).forEach(e -> System.out.println(e.getName()));
        }
    }
    public static void getMetaAttribute (UserMeta userMeta) throws IllegalAccessException {
        for (Field field : userMeta.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(GetMetaData.class)) {
                System.out.println(field.get(userMeta).toString());
            }
        }
    }
    public static void getMetaMethod (UserMeta userMeta) throws InvocationTargetException, IllegalAccessException {
        for (Method method : userMeta.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(GetMetaData.class)) {
                long time = System.currentTimeMillis();
                method.invoke(userMeta, "dimooon");
                System.out.println(System.currentTimeMillis()-time);
            }
        }
    }
}

    //method3.1
    //method3.2
    //method3.3

