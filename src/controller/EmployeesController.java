/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import entity.Employees;
import java.util.ArrayList;
import model.Employeesmodel;

/**
 *
 * @author daica
 */
public class EmployeesController {
    private Employeesmodel model;

    public EmployeesController() {
        model = new Employeesmodel();
    }

    public int Insert(Employees insertEmployees) {
        Employeesmodel DSEmployeesmodel = new Employeesmodel();
        return DSEmployeesmodel.Insert(insertEmployees);
    }

    public boolean Update(Employees updateEmployees) {
        Employeesmodel DSEmployeesmodel = new Employeesmodel();
        return DSEmployeesmodel.Update(updateEmployees);
    }

    public boolean Delete(int id) {
        Employeesmodel DSEmployeesmodel = new Employeesmodel();
        return DSEmployeesmodel.Delete(id);
    }
     public ArrayList<Employees> getAllEmployees() {
        Employeesmodel DSEmployeesmodel = new Employeesmodel();
        return DSEmployeesmodel.DSEmployees();
    }
     public ArrayList<Employees> searchEmployees(String keyword) {
        return model.searchEmployees(keyword);
    }
}
