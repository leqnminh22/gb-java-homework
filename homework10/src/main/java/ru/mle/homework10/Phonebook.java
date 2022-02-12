package ru.mle.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    /**
    2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
    искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
    (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
     */

    private Map<Integer, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void addUser(int number, String surname) {
        phonebook.put(number, surname);
    }

    public void getNumber(String surname){
        if(phonebook.containsValue(surname)){
            Set<Map.Entry<Integer,String>> set = phonebook.entrySet();
            for (Map.Entry<Integer,String> temp: set) {
                if(temp.getValue().equals(surname)){
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.printf("Имя [%s] нет в телефонной книжке.", surname);
        }
    }

    public static void main (String[]args){

        Phonebook phonebook = new Phonebook();

        phonebook.addUser(45646521, "Petrov");
        phonebook.addUser(32112321, "Ivanov");
        phonebook.addUser(32144412, "Ivanov");
        phonebook.addUser(13211323, "Petrov");
        phonebook.addUser(65466666, "Samoilov");
        phonebook.addUser(33344412, "Shmakov");
        phonebook.addUser(45952378, "Pyatkin");

        phonebook.getNumber("Petrov");
        phonebook.getNumber("Ivanov");
        phonebook.getNumber("Samoilov");
        phonebook.getNumber("Shmakov");
        phonebook.getNumber("Pyatkkin");

    }
}

