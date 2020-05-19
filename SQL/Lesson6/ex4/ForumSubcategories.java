package sql.lesson6.ex4;

import java.util.Date;

public class ForumSubcategories {


    int id;
    ForumCategories forumCategories;
    String title;
    String description;
    Date dates;
    String ip;

    public ForumSubcategories(int id, ForumCategories forumCategories,
                              String title, String description, Date dates, String ip) {
        this.id = id;
        this.forumCategories = forumCategories;
        this.title = title;
        this.description = description;
        this.dates = dates;
        this.ip = ip;
    }
}
