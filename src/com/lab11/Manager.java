package com.lab11;
import com.lab11.Employee;
public class Manager extends Employee
{
    private double bonus;
    public Manager(int id, String name, String surname) {
        super(id, name, surname);
    }

    public Manager(int id, String name, String surname, double salary) {
        super(id, name, surname, salary);
    }


    public Manager(int id, String name, String surname, double salary, Manager manager) {
        super(id, name, surname, salary, manager);
    }

    public Manager(int id, String name, String surname, double salary, Manager manager, double bonus) {
        super(id, name, surname, salary, manager);
        this.bonus=bonus;
    }

    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public double getSalary(){
        return this.bonus+super.getSalary();
    }

    @Override
    public String toString() {
            return " id= " + getId() + ", name= " + getName() + ", surname= " + getSurname()  + ", salary= " + getSalary() +", manager= {"+getManager()+" }, bonus= "+getBonus();
    }
}