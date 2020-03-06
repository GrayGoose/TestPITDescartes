package com.neotys.poc.descartes;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ClassToTest().methodToTest(7, true));
        System.out.println(new ClassToTest().methodToTest(7, false));
        System.out.println(new ClassToTest().methodToTest2("pepito mi corazon"));
    }
}
