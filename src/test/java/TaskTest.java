import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void simpleTaskMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(001, "Сделать домашнее задание");

        boolean actual = simpleTask.matches("домашнее");
        boolean exp = true;

        Assertions.assertEquals(actual, exp);

    }

    @Test
    public void simpleTaskNotMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(001, "Сделать домашнее задание");

        boolean actual = simpleTask.matches("Домашние");
        boolean exp = false;

        Assertions.assertEquals(actual, exp);

    }

    @Test
    public void epicMatchesTest() {
        Epic epic = new Epic(222, new String[]{"Сходить в зал", "Зайти в магазин", "Поиграть с котом"});
        boolean actual = epic.matches("котом");
        boolean exp = true;

        Assertions.assertEquals(actual, exp);

    }

    @Test
    public void epicNotMatchesTest() {
        Epic epic = new Epic(222, new String[]{"Сходить в зал", "Зайти в магазин", "Поиграть с котом"});
        boolean actual = epic.matches("собака");
        boolean exp = false;

        Assertions.assertEquals(actual, exp);

    }

    @Test
    public void meetingTopicMatchTest() {
        Meeting meeting = new Meeting(333,
                "Тестирование звонков",
                "Мессенджер",
                "Понедельник");

        boolean actual = meeting.matches("звонков");
        boolean exp = true;

        Assertions.assertEquals(actual, exp);
    }

    @Test
    public void meetingProjectMatchTest() {
        Meeting meeting = new Meeting(333,
                "Тестирование звонков",
                "Мессенджер",
                "Понедельник");

        boolean actual = meeting.matches("Мессенджер");
        boolean exp = true;

        Assertions.assertEquals(actual, exp);
    }

    @Test
    public void meetingNotMatchTest() {
        Meeting meeting = new Meeting(333,
                "Тестирование звонков",
                "Мессенджер",
                "Понедельник");

        boolean actual = meeting.matches("созвон");
        boolean exp = false;

        Assertions.assertEquals(actual, exp);
    }


}