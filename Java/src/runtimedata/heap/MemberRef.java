package runtimedata.heap;

import classfile.ConstantMemberRefInfo;

/**
 * Author: zhangxin
 * Time: 2017/7/22.
 * Desc: 字段和方法的符号引用保存的相同信息;包含全限名和描述符;
 * 字段和方法特有的属性,有其对应子类来实现;
 */
public class MemberRef {
    SymRef symRef;
    String name;
    String descriptor;

    public MemberRef(ZconstantPool zconstantPool){
        symRef = new SymRef();
        symRef.cp = zconstantPool;
    }

//    TODO :这里并没有给 sysRef的class属性赋值;
    void copyMemberRefInfo(ConstantMemberRefInfo refInfo){
        symRef.className = refInfo.getClassName();
        name = refInfo.getName();
        descriptor = refInfo.getDescriptor();
    }
}
