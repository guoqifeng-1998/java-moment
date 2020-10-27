 package com.soft2036.study.week4;

/**
 * @ClassName Employee
 * @Description 基础的员工抽象类
 * @Author 郭崎锋
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class");
    }

    /**
     * 发工资
     *
     *
     * @param
     * @return int
     */
    public abstract int getSalary();
}
