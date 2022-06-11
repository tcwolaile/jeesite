package com.thinkgem.jeesite.common.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;


public class StringUtilsTest {

    String first = "Hello";
    String second = null;
    String third = "hello";
    String firth = "";

    @Test
    public void lowerFirst() {


        assert StringUtils.lowerFirst(first).equals("hello") == true;
        assert StringUtils.lowerFirst(second).equals("") == true;
        assert StringUtils.lowerFirst(third).equals("hello") == true;
        assert StringUtils.lowerFirst(firth).equals("") == true;

    }

    @Test
    public void upperFirst() {
        assert StringUtils.upperFirst(first).equals("Hello") == true;
        assert StringUtils.upperFirst(second).equals("") == true;
        assert StringUtils.upperFirst(third).equals("Hello") == true;
        assert StringUtils.upperFirst(firth).equals("") == true;
    }

    @Test
    public void getBytes() {

        assert Arrays.equals(StringUtils.getBytes(first), new byte[]{72, 101, 108, 108, 111}) == true;
        assert StringUtils.getBytes(second) == null;

    }

    @Test
    public void toBoolean() {
        assert StringUtils.toBoolean("y") == true;
        assert StringUtils.toBoolean(second) == false;
        assert StringUtils.toBoolean(firth) == false;
    }

    @Test
    public void testToString() {
        byte[] bytes = {72, 101, 108, 108, 111};

        assert StringUtils.toString(bytes).equals("Hello") == true;
        assert StringUtils.toString(new byte[]{}).equals("") == true;
        System.out.println(StringUtils.toString(new byte[349999999]));
    }

    @Test
    public void testToString1() throws UnsupportedEncodingException {

        Object obj = null;
        assert StringUtils.toString(first, "defaultVal").equals("defaultVal") == false;
        assert StringUtils.toString(obj, "defaultVal").equals("defaultVal") == true;

    }

    @Test
    public void inString() {

        assert StringUtils.inString("hello", new String[]{"hello", "hwdf"}) == true;
        assert StringUtils.inString("hello", new String[]{"h", "ll", "od"}) == false;
        assert StringUtils.inString(null, new String[]{"sdf"}) == false;

    }
}