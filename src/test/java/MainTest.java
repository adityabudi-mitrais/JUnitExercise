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

        Main.sendPoint(1, 2, 100);
        assertEquals(40, Main.users.get(0).getPoint());
        assertEquals(60, Main.users.get(1).getPoint());

    }

    @Test
    void transactionHistories() {
        assertEquals(1,Main.transactionHistories.size());
        assertEquals("Adit",Main.transactionHistories.get(0).getSender());
        assertEquals("Augi",Main.transactionHistories.get(0).getReceiver());
    }
}