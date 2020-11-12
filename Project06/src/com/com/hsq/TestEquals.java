package com.com.hsq;
/**
 * == 和 equals 两者之间的区别
 *
 * == 代表比较双方是否相同。
 * 基本类型则表示值相等
 * 引用类型表示地址相等  即是相同的对象
 *
 * equals 提供定义 “对象内容相等”的逻辑
 *
 */

import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;
        User u1 = new User("zhansan",1231,"123456");
        User u2 = new User("zhansi",1231,"123123");
        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
    }
}
class User{
    String name;
    int id;
    String pwd;

    public User(String name, int id, String pwd) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
