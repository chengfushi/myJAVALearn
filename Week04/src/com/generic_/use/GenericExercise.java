package com.generic_.use;


import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("john", 18));
        students.add(new Student("tom", 18));
        students.add(new Student("jack", 18));

        //遍历hashSet集合
        for (Student student:students) {
            System.out.println(student);
        }

        //使用泛型的方式给HashMap集合放入三个学生对象
        HashMap<String,Student> studentHashMap = new HashMap<String,Student>();
        studentHashMap.put("join" , new Student("join", 18));
        studentHashMap.put("tom" , new Student("tom", 18));
        studentHashMap.put("jack" , new Student("jack", 18));

        //迭代器遍历
        Set<Map.Entry<String,Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<String,Student>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Student> entry = iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        //使用foreach遍历
        for (Map.Entry<String,Student> entry:studentHashMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }




    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}