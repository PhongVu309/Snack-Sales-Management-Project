/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author daica
 */
public class Account {
    private String Username;
    private String DisplayName;
    private String Password;
    private int Type;

    public Account() {
    }

    public Account(String Username, String DisplayName, String Password, int Type) {
        this.Username = Username;
        this.DisplayName = DisplayName;
        this.Password = Password;
        this.Type = Type;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Account{" + "Username=" + Username + ", DisplayName=" + DisplayName + ", Password=" + Password + ", Type=" + Type + '}';
    }
    
}
