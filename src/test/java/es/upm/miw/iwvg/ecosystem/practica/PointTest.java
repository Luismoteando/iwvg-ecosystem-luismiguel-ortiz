package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3, 3);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
        assertEquals(3, point.getZ());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getZ());
    }

    @Test
    void testModule() {
        assertEquals(4.6904, point.module(), 10e-5);
    }

    @Test
    void testPhaseXY() {
        assertEquals(0.9828, point.phaseXY(), 10e-5);
    }

    @Test
    void testPhaseXZ() {
        assertEquals(0.9828, point.phaseXZ(), 10e-5);
    }


    @Test
    void testPhaseYZ() {
        assertEquals(0.7853, point.phaseYZ(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testSetters() {
        point.setX(4);
        point.setY(2);
        point.setZ(1);
        assertEquals(4, point.getX());
        assertEquals(2, point.getY());
        assertEquals(1, point.getZ());
    }
}
