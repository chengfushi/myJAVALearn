package com.generic_.custo;


public class CustomGeneric {
    public static void main(String[] args) {

    }
}

class Tiger<T, R, m> {
    String name;
    T t;
    R r;
    m m;

//    T[] ts = new T[8];//这里不能对数组完成初始化，因为不知到T的具体类型，无法分配内存空间

    //静态方法中不能使用泛型，因为静态在类加载时对象还没有创建

    public Tiger(T t, R r, m m) {
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public m getM() {
        return m;
    }

    public void setM(m m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", t=" + t +
                ", r=" + r +
                ", m=" + m +
                '}';
    }
}