package runtimedata.heap;

import runtimedata.Slot;

/**
 * Author: zhangxin
 * Time: 2017/5/4 0004.
 * Desc: 用来模拟Java中的Object类,这里只是简单的模拟定义一个类,用来盛放索引的
 */
public class Zobject {
    Zclass clazz;   //存放一个class的成员,用来调用类的方法,静态成员变量'
    Slot[] fields;  //存放的是非静态成员变量,包含父类+ 自己的
}
