import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> contacts = new HashMap<>();

    public void add(String name, String number) {
        contacts.put(name, number);
    }

}
