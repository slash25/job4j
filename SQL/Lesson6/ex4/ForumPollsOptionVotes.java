package sql.lesson6.ex4;

import java.util.Date;

public class ForumPollsOptionVotes {
    /*
    CREATE TABLE ForumPollsOptionVotes(
--CONSTRAINT CONST-NAME CONSTRAINT TYPE (COLUMN NAME)
id INT,
CONSTRAINT forumPollsOptionVotes_pk PRIMARY KEY (id),
idPollOption INT,
CONSTRAINT forumPollsOption_FK FOREIGN KEY (idPollOption) REFERENCES forumPollsOptions (id),
idUser INT,
CONSTRAINT users_FK FOREIGN KEY (idUser) REFERENCES Users (id),
dates TIMESTAMP,
ip VARCHAR(20)
);

     */

    int id;
    int idPollOption;
    forumPollsOptions forumPollsOptions;
    Users users;
    Date dates;
    String ip;




}
