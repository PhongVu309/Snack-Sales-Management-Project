/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Category;
import java.util.ArrayList;
import model.Categorymodel;

/**
 *
 * @author daica
 */
public class CategoryController {
    private Categorymodel model;

    public CategoryController() {
        model = new Categorymodel();
    }

    public int Insert(Category insertCategory) {
        Categorymodel DSCategorymodel = new Categorymodel();
        return DSCategorymodel.Insert(insertCategory);
    }

    public boolean Update(Category updateCategory) {
        Categorymodel DSCategorymodel = new Categorymodel();
        return DSCategorymodel.Update(updateCategory);
    }

    public boolean Delete(int id) {
        Categorymodel DSCategorymodel = new Categorymodel();
        return DSCategorymodel.Delete(id);
    }
    public ArrayList<Category> getAllCategorys() {
        Categorymodel DSCategorymodel = new Categorymodel();
        return DSCategorymodel.DSCategory();
    }
    public ArrayList<Category> searchCategories(String keyword) {
        return model.searchCategories(keyword);
    }
}
