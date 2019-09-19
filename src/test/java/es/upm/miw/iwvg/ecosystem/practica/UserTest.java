package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(23, "luis", "ortiz");
    }

    @Test
    void testUser() {
        user = new User(23, "luis", "ortiz");
        assertEquals(23, user.getNumber());
        assertEquals("Luis", user.getName());
        assertEquals("Ortiz", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Luis Ortiz", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("L.", user.initials());
    }
}