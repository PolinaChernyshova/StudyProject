package Lesson_13;

import java.util.ArrayList;
import java.util.HashMap;

    public class PhoneBook {
        private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        public void add(String surname, String phoneNumber) {
            if (!phoneBook.containsKey(surname)) {
                phoneBook.put(surname, new ArrayList<>());
            }
            phoneBook.get(surname).add(phoneNumber);
        }
        public ArrayList<String> get(String surname) {
            return phoneBook.getOrDefault(surname, new ArrayList<>());
        }

    }