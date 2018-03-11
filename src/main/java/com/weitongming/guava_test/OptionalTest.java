package com.weitongming.guava_test;

import com.google.common.base.Optional;
import org.junit.Test;

/**
 * Created by tim.wei on 2018/3/11.
 * OptionalTest
 guava的Optional类似于Java 8新增的Optional类，都是用来处理null的，不过guava的是抽象类，其实现类为Absent和Present，
 而java.util的是final类。其中一部分方法名是相同的。

 Guava用Optional表示可能为null的T类型引用。一个Optional实例可能包含非null的引用（我们称之为引用存在），也可能什么也不包括（称之为引用缺失）。
 它从不说包含的是null值，而是用存在或缺失来表示。但Optional从不会包含null值引用。
 */
public class OptionalTest {

    @Test
    public void test(){
        Integer value1 = null ;
        Integer value2 = 1 ;
        Optional<Integer> op1 = Optional.fromNullable(value1);
        Optional<Integer> op2 = Optional.of(value2);
        System.out.println(sum(op1,op2));
    }

    public int sum(Optional<Integer> op1 ,Optional<Integer> op2){
        System.out.println("param 1 isPresent :" + op1.isPresent());
        System.out.println("param 1 isPresent :" + op2.isPresent());
        Integer va1 = op1.or(0);
        Integer va2 = op2.get();
        return  va1+va2;
    }
}
