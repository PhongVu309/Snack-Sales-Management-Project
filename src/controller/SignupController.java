package controller;

import entity.Account;
import java.util.ArrayList;
import model.Signupmodel;

public class SignupController {
    private Signupmodel model;

    public SignupController() {
        model = new Signupmodel();
    }

    public int Insert(Account insertAccount) {
        return model.Insert(insertAccount);
    }

    public ArrayList<Account> getAllAccounts() {
        return model.getAllAccounts();
    }
}
