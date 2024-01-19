package lesson8;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBookMap = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        phoneBookMap.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBookMap.getOrDefault(lastName, Collections.emptyList());
    }
}
