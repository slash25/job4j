package sql.lesson6.ex3;

public class Categories {

    int CategoryID;
    boolean Picture;
    String CategoryName;
    String Description;

    public Categories(int categoryID, boolean picture, String categoryName, String description) {
        CategoryID = categoryID;
        Picture = picture;
        CategoryName = categoryName;
        Description = description;
    }
}
