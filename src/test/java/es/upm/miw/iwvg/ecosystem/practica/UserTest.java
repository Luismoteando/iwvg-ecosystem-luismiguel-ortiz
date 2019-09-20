package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(23, "luis", "miguel", "ortiz");
    }

    @Test
    void testUser() {
        user = new User(23, "luis", "miguel", "ortiz");
        assertEquals(23, user.getNumber());
        assertEquals("Luis", user.getFirstName());
        assertEquals("Miguel", user.getSecondName());
        assertEquals("Ortiz", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Luis Miguel Ortiz", user.fullName());
    }

    @Test
    void testUpperCaseFullName() {
        assertEquals("LUIS MIGUEL ORTIZ", user.upperCaseFullName());
    }

    @Test
    void testInitials() {
        assertEquals("L.M.", user.initials());
    }
}