/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author daica
 */
public class Employees {
    private int EmployeeID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;
    private String Position;

    public Employees() {
    }

    public Employees(int EmployeeID, String FirstName, String LastName, String Email, String Phone, String Position) {
        this.EmployeeID = EmployeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
        this.Position = Position;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    @Override
    public String toString() {
        return "Employees{" + "EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", Phone=" + Phone + ", Position=" + Position + '}';
    }
    
}
