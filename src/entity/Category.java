package entity;
public class Category {
    private int CategoryID;
    private String Name;
    private String Description;

    public Category() {
    }

    public Category(int CategoryID, String Name, String Description) {
        this.CategoryID = CategoryID;
        this.Name = Name;
        this.Description = Description;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Desciption) {
        this.Description = Desciption;
    }

    @Override
    public String toString() {
        return "Category{" + "CategoryID=" + CategoryID + ", Name=" + Name + ", Description=" + Description + '}';
    }
}
