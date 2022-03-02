import model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeAll
    static void beforeAll() {
        Main.users = Main.initiateUsers();
    }

    @Test
    void initiateUsers() {
        assertEquals(2, Main.users.size());
    }

    @Test
    void sendPoint() {
        Main.sendPoint(1, 2, 10);
        assertEquals(40, Main.users.get(0).getPoint());
        assertEquals(60, Main.users.get(1).getPoint());

    }

    @Test
    void transactionHistories() {
        Main.sendPoint(2, 1, 20);
        assertEquals(2,Main.transactionHistories.size());
        assertEquals("Augi",Main.transactionHistories.get(1).getSender());
        assertEquals("Adit",Main.transactionHistories.get(1).getReceiver());
    }
}