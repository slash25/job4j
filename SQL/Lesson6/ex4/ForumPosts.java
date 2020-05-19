package sql.lesson6.ex4;

import java.util.Date;

public class ForumPosts {

    public ForumPosts(int id, String title, String fp_content, boolean is_Poll,
                      Date dates, String ip, sql.lesson6.ex4.ForumSubcategories forumSubcategories,
                      Users users, ParentPosts parentPosts) {
        this.id = id;
        this.title = title;
        this.fp_content = fp_content;
        this.is_Poll = is_Poll;
        this.dates = dates;
        this.ip = ip;
        ForumSubcategories = forumSubcategories;
        this.users = users;
        this.parentPosts = parentPosts;
    }

    int id;
    String title;
    String fp_content;
    boolean is_Poll;
    Date dates;
    String ip;
    ForumSubcategories ForumSubcategories;
    Users users;
    ParentPosts parentPosts;
}
