import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    HashMap<String, String> contacts = new HashMap<>();

    public void add(String name, String number) {
        contacts.put(name, number);
    }

    public String findByNumber(String number) {
        for (String key : contacts.keySet()) {
            if (contacts.get(key).equals(number)) {
                return key;
            }
        }
        return "Контакт не найден";
    }

    public String findByName(String name) {
        if (contacts.get(name) != null) {
            return contacts.get(name);
        } else {
            return "Контакт не найден";
        }
    }

    public String printAllNames() {
        List<String> result = new ArrayList<>(contacts.keySet());
        return result.stream().sorted().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
