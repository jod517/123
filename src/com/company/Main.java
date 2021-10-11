package com.company;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.reflect.*;

public class Main {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {


        List<NumClass> numClassList = new ArrayList<NumClass>();


//
//
//        int a = numClassList.size();
//        System.out.println(a);
//
//        for (int i = 1; i != 10;) {
//            System.out.println(numClassList.get(i));
//            i++;
//        }

//        NumClass numClass = new NumClass();
//        Class clazz = NumClass.class;
//        Field ifield = clazz.getDeclaredField("i");
//        ifield.setAccessible(true);
//        long fieldValue = ifield.getLong(numClass);
//        System.out.println("i = " + fieldValue);

//        Class<?> clazz = NumClass.class;
//        Object cc = clazz.newInstance();
//        Field f1 = cc.getClass().getSuperclass().getDeclaredField("a_field");
//        f1.setAccessible(true);
//        f1.set(cc, "reflecting on life");
//        String str1 = (String) f1.get(cc);
//        System.out.println("field: " + str1);


        for (int i = 0; i < 10; i++) {
            int a = 1;
            NumClass numClass = new NumClass.Builder()
                    .setNum(a++)
                    .build();
            numClassList.add(numClass);

        }


////        NumClass numClass = new NumClass.Builder()
////                .setNum(3)
////                .build();
//        for (int i = 1; i != 10;) {
//            System.out.println(numClassList.get(i));
//            i++;
//        }
//
//    }


    }
}

