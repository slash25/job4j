package sql.lesson6.ex4;

import java.util.Date;

public class forumPollsOptions {

    public forumPollsOptions(int id, String title, Date dates, ForumPosts forumPosts) {
        this.id = id;
        this.title = title;
        this.dates = dates;
        this.forumPosts = forumPosts;
    }

    int id;
    String title;
    Date dates;
    ForumPosts forumPosts;

}
