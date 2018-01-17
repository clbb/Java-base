package com.Arraylist;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements Iterable<T> {

    // 默认容量
    private static final int DEFAULT_CAPACITY = 10;
    //实际大小
    private int theSize;
    // 数组
    private T[] theItems;

    public ArrayList() {
        doClear();
    }

    public int size(){
        return theSize;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    /**
     * 清除多余空间
     */
    public void trimToSize(){
        ensureCapacity(size());
    }

    /**
     * 根据索引获取元素
     * @param index
     * @return
     */
    public T get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        return theItems[index];
    }

    /**
     * 设置新值，返回旧值
     * @param index
     * @param newVal
     * @return
     */
    public T set(int index, T newVal){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        T oldVal = theItems[index];
        theItems[index] = newVal;
        return oldVal;
    }

    /**
     * 根据索引添加元素
     * @param index
     * @param x
     */
    public void add(int index, T x){
        // 扩展容量
        if(theItems.length == size()){
            ensureCapacity(size() * 2 + 1);
        }
        // 向后移动
        for(int i = theSize;i > index;i--){
            theItems[i] = theItems[i-1];
        }
        // 添加
        theItems[index] = x;
        // 实际容量增加1
        theSize++;
    }

    /**
     * 默认向最后添加
     * @param x
     * @return
     */
    public boolean add(T x){
        add(size(), x);
        return true;
    }

    /**
     * 根据索引删除节点
     * @param index
     * @return
     */
    public T remove(int index){
        T removedItem = theItems[index];
        // 向前移动
        for(int i = index;i<size()-1;i++){
            theItems[i] = theItems[i+1];
        }
        //实际容量减小1
        theSize--;
        return removedItem;
    }

    private void doClear(){
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    /**
     * 数组扩展
     * @param newCapacity
     */
    public void ensureCapacity(int newCapacity){
        if(newCapacity < theSize){
            return;
        }
        T[] old = theItems;
        // 泛型不能实例化，只能这么写
        theItems = (T[])new Object[newCapacity];
        for(int i = 0;i<size();i++){
            theItems[i] = old[i];
        }
    }

    /**
     * 迭代器方法
     */
    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    /**
     * 迭代器。内部类
     * @author Gavin
     *
     */
    private class ArrayListIterator implements Iterator<T>{

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            // 如果已经没有元素了
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return theItems[current++];
        }

        public void remove(){
            ArrayList.this.remove(--current);
        }
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder("[");
        for(int i = 0;i<size();i++){
            line.append(theItems[i]);
            if(i != size()-1){
                line.append(", ");
            }else{
                line.append("]");
            }
        }
        return line.toString();
    }
}