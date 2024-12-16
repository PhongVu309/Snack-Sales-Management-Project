/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import entity.Category;
import entity.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daica
 */
public class Employeesmodel {
    public ArrayList<Employees> DSEmployees() {
        ArrayList<Employees> ListEmployees = new ArrayList<>();
        String sql = "SELECT * FROM Employees";

        try (Connection conn = connection.getConnection();
             Statement stas = conn.createStatement();
             ResultSet rs = stas.executeQuery(sql)) {

            while (rs.next()) {
                Employees tb = new Employees(rs.getInt("EmployeeID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Email"), rs.getString("Phone"), rs.getString("Position"));
                ListEmployees.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListEmployees;
    }
    public int Insert(Employees insertEmployees) {
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Employees (FirstName, LastName, Email, Phone, Position) VALUES (?, ?, ?, ?, ?)";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, insertEmployees.getFirstName());
            sttm.setString(2, insertEmployees.getLastName());
            sttm.setString(3, insertEmployees.getEmail());
            sttm.setString(4, insertEmployees.getPhone());
            sttm.setString(5, insertEmployees.getPosition());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException e) {
                    Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return -1;
    }
    public boolean Update(Employees updateEmployees) {
        String sql = "UPDATE Employees SET FirstName = ?, LastName = ?, Email = ?,Phone = ?, Position = ? WHERE EmployeeID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setString(1, updateEmployees.getFirstName());
            sttm.setString(2, updateEmployees.getLastName());
            sttm.setString(3, updateEmployees.getEmail());
            sttm.setString(4, updateEmployees.getPhone());
            sttm.setString(5, updateEmployees.getPosition());
            sttm.setInt(6, updateEmployees.getEmployeeID());


            
            return sttm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    public boolean Delete(int EmployeeID) {
        String sql = "DELETE FROM Employees WHERE EmployeeID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setInt(1, EmployeeID);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Delete thành công");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<Employees> searchEmployees(String keyword) {
        ArrayList<Employees> ListEmployees = new ArrayList<>();
        String sql = "SELECT * FROM Employees WHERE FirstName LIKE ? OR LastName LIKE ? OR EmployeeID LIKE ?";

        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setString(1, "%" + keyword + "%");
            sttm.setString(2, "%" + keyword + "%");
            sttm.setString(3, "%" + keyword + "%");
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                Employees Employees = new Employees(rs.getInt("EmployeeID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Email"), rs.getString("Phone"), rs.getString("Position"));
                ListEmployees.add(Employees);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListEmployees;
    }
}
