package ru.job4j.condition;
/**Программа "Глупый бот".
 * Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
 Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
 Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
 *
 */
public class DummyBot {
    public String answer(String question) {
        String answBot = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            answBot = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            answBot = "До скорой встречи.";
        }
        return answBot;
    }
    public static void main(String[] args) {
    }
}
