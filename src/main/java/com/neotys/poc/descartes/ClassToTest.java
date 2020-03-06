package com.neotys.poc.descartes;

public class ClassToTest {
    public int methodToTest(int integer, boolean bool) {
        if (bool) return 0;

        integer *= integer;
        integer += 5;

        return integer / 6;
    }

    public int methodToTest2(final String string) {
        return methodToTest(string.length(), false);
    }

    public String methodToTest3(final String string, int index) {
        if (index > string.length() - 1) {
            return "";
        }

        if (index < 0) {
            return string;
        }

        return string.substring(index);
    }
}
