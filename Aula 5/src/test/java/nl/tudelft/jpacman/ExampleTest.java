package nl.tudelft.jpacman;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO
 *
 * @author Jose Campos
 */
public class ExampleTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("before a test class is executed");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("after a test class has been executed");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before a test method/case is executed");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after a test method/case has been executed");
    }

    @Test
    public void testA() {
        System.out.println("I'm a passing test");
        String a = "Hello";
        assertEquals(a, a);
    }

    /*
    @Test
    public void testB() {
        System.out.println("I'm a failing test");
        String a = "Hello";
        assertEquals(new String("Ola"), a);
    }*/
}
