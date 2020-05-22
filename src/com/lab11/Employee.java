package com.lab11;
import com.lab11.Manager;


public class Employee {

    private int id;
    private String name;
    private String surname;
    private double salary;
    private Manager manager;
    public Employee(){
        this.id=1;
        this.name="unknown";
        this.surname="_";
        this.salary=1000;
    }

    public Employee(int id, String name, String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=1000;
    }
    public Employee(int id, String name, String surname,double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    public Employee(int id, String name, String surname,double salary, Manager manager){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.manager=manager;
    }

    /**
     *
     * @return id our object
     */
    public final int getId() {
        return id;
    }
    public final void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return name our object
     */
    public final String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return surname our object
     */
    public final String getSurname() {
        return surname;
    }
    public final void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return salary our object
     */
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @return manager-object our object
     */
    public final Manager getManager() {
        return this.manager;
    }
    public final void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     *
     * @param n Method changing salary our object
     */
    public void raiseSalary(int n){
        this.salary= this.salary*n/100+ this.salary;
    }
    @Override
    public String toString() {
        return " id= " + getId() + ", name= " + getName() + ", surname= " + getSurname()  + ", salary= " + getSalary() +", manager= {"+getManager()+" } "+" ";
    }
    public String getNameManager(){
        if(getManager()!=null)
        {return getManager().getName()+" "+ getManager().getSurname();}
        else
        {return "No manager";}
    }
    public  Employee getTopManager() {
        if (getManager() != null) {
            return getManager().getTopManager();
        } else {
            return this;
        }
    }
}


