package com.colletion;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 备选课程类
 */
public class ListTest {
    /*
    用于存放备选课程的List
     */
    public List coursesToSelect;
    public ListTest(){
        this.coursesToSelect = new ArrayList();
    }

    /*
    用于往courseToSelect中添加备选课程
     */
    public void testAdd(){
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程"+temp.id+":"+temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2= (Course) coursesToSelect.get(0);
        System.out.println("添加了课程"+temp2.id+":"+temp2.name);

        Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course)coursesToSelect.get(2);
        Course temp4 = (Course)coursesToSelect.get(3);

        System.out.println("添加了两门课程"+temp3.id+":"+temp3.name+";"
                            +temp4.id+":"+temp4.name);

        Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
        coursesToSelect.addAll(2,Arrays.asList(course2));
        Course temp5 = (Course)coursesToSelect.get(2);
        Course temp6 = (Course)coursesToSelect.get(3);
        System.out.println("添加了两门课程"+temp5.id+":"+temp5.name+";"
                +temp6.id+":"+temp6.name);

    }

    /*
    取得list中的元素
     */

    public void testGet(){
        int size = coursesToSelect.size();
        for(int i = 0; i < size; ++i){
            Course cr=(Course)coursesToSelect.get(i);
            System.out.println("添加的课程:"+cr.id+":"+cr.name);
        }
    }

    /*
    通过迭代器遍历list
     */
    public void testIteartor(){
        Iterator it = coursesToSelect.iterator();
        System.out.println("有如下课程备选:");
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }

    /*
    通过for each方法访问集合元素
     */
    public void testForEach(){
        System.out.println("有如下课程备选(for each):");
        for(Object obj:coursesToSelect){
            Course cr = (Course)obj;
            System.out.println(cr.id+cr.name);
        }
    }

    /*
    修改list中元素
     */
    public void testModify(){
        coursesToSelect.set(4,"毛概");
    }
    public static void main(String[] args){
        ListTest it = new ListTest();
        it.testAdd();
        it.testGet();
        it.testIteartor();
        it.testForEach();
        it.testModify();
        it.testForEach();

    }
}
