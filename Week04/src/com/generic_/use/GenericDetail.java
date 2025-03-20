package com.generic_.use;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class GenericDetail {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom",5000,new MyDate("2000","01","01")));
        employees.add(new Employee("Jerry",6000,new MyDate("2001","01","01")));
        employees.add(new Employee("Jim",7000,new MyDate("2002","01","01")));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee) && !(o2 instanceof Employee)) {
                    return 0;
                }

                //比较姓名
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }

                //比较生日
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}



class Employee {
    private String name;
    private double salary;
    private MyDate birthDate;


    public Employee(String name, double salary, MyDate birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    @Override
    public int compareTo(MyDate o){

        int yearMinus = Integer.parseInt(year)  - Integer.parseInt(o.getYear());
        if (yearMinus != 0) {
            return yearMinus;
        } else {
            int monthMinus = Integer.parseInt(month)  - Integer.parseInt(o.getMonth());
            if (monthMinus != 0) {
                return monthMinus;
            } else {
                return Integer.parseInt(day)  - Integer.parseInt(o.getDay());
            }
        }
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}