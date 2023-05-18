package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testAdd() {
        assertEquals(2, new Calculator().add(1,1));
    }
    @Test
    public void testSubtract() {
        assertEquals(8, new Calculator().subtract(10,2));
    }
    @Test
    public void testMultiply() {
        assertEquals(6, new Calculator().multiply(3, 2));
    }
    @Test
    public void testDivide() {
        assertEquals(5, new Calculator().divide(10, 2));
    }
}
