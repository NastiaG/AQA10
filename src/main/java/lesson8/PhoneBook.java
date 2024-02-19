package lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map <Integer, String> phoneBook = new HashMap<>();

    public Map<Integer, String> getPhoneBook() {
        return phoneBook;
    }

    public void add(Integer phoneNumber, String surname) {
        phoneBook.put(phoneNumber, surname);
    }

    public Set<Integer> get(String surname) {
        Set<Integer> resultSet = new HashSet<>();

        for(Map.Entry<Integer, String> entry: phoneBook.entrySet()) {
            if(entry.getValue().equals(surname)) {
                resultSet.add(entry.getKey());
            }
        }
        return resultSet;
    }
}