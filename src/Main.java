import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Задание 1

        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midlleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2

        String fullNameUp = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullNameUp);

        //Задание 3

        String fullNameNew = "Иванов Семён Семёнович";
        fullNameNew = fullNameNew.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameNew);
    }
}