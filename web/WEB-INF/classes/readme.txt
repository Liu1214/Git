class A {
    public void add() {
        a + b
    }

    public void cut() {}

    public void print() {}
}


public void add() {
    a + b
    print();
}

--------------------------------------
连接点Joinpoint
    类中的所有方法           add()  cut()  print();

切入点（切点）Pointcut
    类中的一个方法

增强
    扩展的额外代码 相对于Add() 额外的代码

目标对象 （A）

代理对象 （新的A对象）

织入
    把 增强 应用到 目标对象 产生 代理对象的过程

切面
    增强 & 切入点的结合

--------------------------------------
数据连接的参数

    驱动名称
    URL
    用户名
    密码





