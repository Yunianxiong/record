package com.yuer.annotate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class annotateMain {
    public static void main(String[] args) {

        Class<Annotation> annotationClass = Annotation.class;
        for (Field declaredField : annotationClass.getDeclaredFields()) {
            System.out.println("declaredField = " + declaredField);
        }
        Package aPackage = annotationClass.getPackage();
        System.out.println("aPackage = " + aPackage);


    }
}
