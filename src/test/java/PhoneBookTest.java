import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {
    @org.junit.jupiter.api.Test
    public void testPhonebookAdd() {
        // given:
        PhoneBook phoneBook = new PhoneBook();

        // when:
        phoneBook.add("Иван", "9091234545");

        // then:
        String username = phoneBook.findByNumber("9091234545");
        Assertions.assertEquals("Иван",username);
    }

}
