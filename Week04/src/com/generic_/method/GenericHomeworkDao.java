package com.generic_.method;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericHomeworkDao {
    public static void main(String[] args) {
        Dao<User> userDao = new Dao<User>();
        userDao.save("1", new User("小明", 12));
        userDao.update("1", new User("小红", 13));

    }
}

class Dao<T> {
    private Map<String,T> daoMap;


    public void save(String id,T entity) {
        daoMap.put(id ,entity);
    }

    public T get(String id) {
        return daoMap.get(id);
    }

    public void update(String id,T entity) {
        daoMap.put(id, entity);
    }

    public void delete(String id) {
        daoMap.remove(id);
    }

    public List<T> list() {
        return new ArrayList<>(daoMap.values());
    }
}


class User{
    private String name;
    private int age;

    public User(String name, int age) {
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
}