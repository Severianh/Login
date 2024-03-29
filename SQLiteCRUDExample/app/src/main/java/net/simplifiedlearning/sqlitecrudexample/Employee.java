package net.simplifiedlearning.sqlitecrudexample;

/**
 * Created by Belal on 9/30/2017.
 */

public class Employee {
    int id;
    String name, dept, joiningDate, cod;
    double salary;

    public Employee(int id, String cod, String name, String dept, String joiningDate, double salary) {
        this.id = id;
        this.cod = cod;
        this.name = name;
        this.dept = dept;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }
}
