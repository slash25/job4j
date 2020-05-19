package sql.lesson6.ex4;

import java.util.Date;

public class ForumCategories {

    public ForumCategories(int id, String title, String description, Date dates, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dates = dates;
        this.ip = ip;
    }

    int id;
    String title;
    String description;
    Date dates;
    String ip;

}
