package sql.lesson6.ex4;

import java.util.Date;

public class ParentPosts {
    public ParentPosts(int id, String title, Date dates) {
        this.id = id;
        this.title = title;
        this.dates = dates;
    }

    int id;
    String title;
    Date dates;
}
