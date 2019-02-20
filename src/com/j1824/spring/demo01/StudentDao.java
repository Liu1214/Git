package com.j1824.spring.demo01;

public class StudentDao {

    public void add() {
        System.out.println("添加学生");
    }

    public void add(String s) {
        System.out.println("添加学生：" + s);
    }

    public void remove() {
        System.out.println("删除学生");
    }

    public void update() {
        System.out.println("更新学生");
    }

    public void find() {
        System.out.println("查找学生");
    }

}
