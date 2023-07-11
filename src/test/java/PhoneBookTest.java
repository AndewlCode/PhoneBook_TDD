import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {
    @org.junit.jupiter.api.Test
    public void testPhonebookAdd1() {
        // given:
        PhoneBook phoneBook = new PhoneBook();

        // when:
        phoneBook.add("Иван", "9091234545");

        // then:
        String username = phoneBook.findByNumber("9091234545");
        Assertions.assertEquals("Иван",username);
    }

    @org.junit.jupiter.api.Test
    public void testPhonebookAdd2() {
        // given:
        PhoneBook phoneBook = new PhoneBook();

        // when:
        phoneBook.add("Иван", "9091234545");

        // then:
        String phoneNumber = phoneBook.contacts.get("Иван");
        Assertions.assertEquals("9091234545",phoneNumber);
    }

    @org.junit.jupiter.api.Test
    public void testPhonebookFindByNumber1() {
        // given:
        PhoneBook phoneBook = new PhoneBook();

        // when:
        phoneBook.add("Иван", "9091234545");

        // then:
        String userName = phoneBook.findByNumber("9091234545");
        Assertions.assertEquals("Иван",userName);
    }

    @org.junit.jupiter.api.Test
    public void testPhonebookFindByNumber2() {
        // given:
        PhoneBook phoneBook = new PhoneBook();

        // when:
        phoneBook.add("Иван", "9091234545");
        phoneBook.add("Сергей", "9091235555");

        // then:
        String userName = phoneBook.findByNumber("9091235555");
        Assertions.assertEquals("Сергей",userName);
    }
}
