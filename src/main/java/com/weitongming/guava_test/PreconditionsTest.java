package com.weitongming.guava_test;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by tim.wei on 2018/3/11.
 * 前置条件Preconditions提供静态方法来检查方法或构造函数，被调用是否给定适当的参数。它检查的先决条件。其方法失败抛出IllegalArgumentException。
 */
public class PreconditionsTest {


    @Test
    public void test(){
        System.out.println(getValue(1));
        System.out.println(sum(1 ,3));
        getValue(7);
        sum(null ,2);
    }



    private Integer sum(Integer a ,Integer b){
        Preconditions.checkNotNull( a ) ;
        Preconditions.checkNotNull( b ,"参数2为空");
        return  a + b ;
    }

    private Integer getValue(int index){
        Integer[] list = {1,2,3,4,5};
        Preconditions.checkElementIndex(index ,list.length);
        return list[index];
    }
}
