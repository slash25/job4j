package ru.job4j.ex;

public class UserStore {

    //findUser - если пользователя не нашли в списке, то кинуть исключение UserNotFoundException.

    private static User findUser(User[] user, String login) throws UserNotFoundException {

        for (User us : user) {
            if ((us.getUsername().equals(login))) {
                if (us.getUsername().length() > 3) {
                    return us;
                }
                throw new UserInvalidException("small name of user");
            }
        }
        throw new UserNotFoundException("user not found");
    }

    private static boolean validate(User user) throws UserInvalidException {
        //validate - если пользователь не валидный или если имя пользователя
        // состоит из менее трех символов, то кинуть исключение UserInvalidException

        //Метод validate принимает аргумент user. У объекта user есть метод isValid().
        // Если он false, то нужно выкинуть исключение UserInvalidException.

        //Так же в этом методе нужно проверить, что у объекта user количество символов
        // в поле username меньше 3. Если оно меньше, то нужно выкинуть исключение UserInvalidException.
        // Для этого нужно воспользоваться методом String.lenght().
        if (!user.isValid()) {
            throw new UserInvalidException("user not valid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {

        /*main - поправить код за счет использования try-catch с множественным блоком catch.

        В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение,
         что пользователя не найдено.

        В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение,
         что пользователь не валидный.*/

        /*User[] users = {new User("Petr Arsentev", true),
                new User("Dmitriy Galkin", false),
                new User("Max Petrov", true)};*/
        User[] users = new User[10];
        users[0] = new User("Petr Arsentev", true);
        users[1] = new User("Dmitriy Galkin", false);
        users[2] = new User("Dj", true);

        User user = findUser(users, "Petr Arsentev");

        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException ea) {
            ea.printStackTrace();
        }
    }
}
