package com.jin.feign.server.demo.bean;

import lombok.Data;

/**
 * @author wu.jinqing
 * @date 2020年01月13日
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;

    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getClassName());
        }

    }
}
