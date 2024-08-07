package org.example.entity;

import java.util.Objects;

public class Employee {
    private long id;
    private String firstname;
    private String lastname;

    public Employee(long id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public long getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
