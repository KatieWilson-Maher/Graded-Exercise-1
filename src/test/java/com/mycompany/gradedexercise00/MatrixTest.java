package com.mycompany.gradedexercise00;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    public MatrixTest() {
    }

    public void compare(Matrix m1, Matrix m2) {
        for (int m1Row = 0; m1Row < 4; m1Row++) {
            for (int m1Column = 0; m1Column < 4; m1Column++) {
                double m1Val = m1.get(m1Row, m1Column);
                double m2Val = m2.get(m1Row, m1Column);
                assertEquals(m1Val, m2Val);
            }
        }
    }

    public Matrix fill(Matrix m) {
        int i = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                m.set(row, column, i);
                i += 1;
            }
        }
        return m;
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
    /**
     * Test of get method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testGet() { //DONE
        Matrix m = new Matrix();
        double actual = m.get(1, 1);
        double expected = 1;
        assertEquals(actual, expected);
    }

    /**
     * Test of set method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testSet() { //DONE
        Matrix m1 = new Matrix();
        int i = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                m1.set(row, column, i);
                i += 1;
            }
        }
        String actual = m1.toString();
        String expected = "[ 0.0, 1.0, 2.0, 3.0 ]\n[ 4.0, 5.0, 6.0, 7.0 ]\n[ 8.0, 9.0, 10.0, 11.0 ]\n[ 12.0, 13.0, 14.0, 15.0 ]\n";
        assertEquals(expected, actual);
    }

    /**
     * Test of identity method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testIdentity() { //DONE
        Matrix expected = new Matrix();
        Matrix actual = new Matrix();
        int i = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                actual.set(row, column, i);
                i += 1;
            }
        }
        actual.identity();
        compare(expected, actual);
    }

    /**
     * Test of toString method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testToString() { //DONE
        Matrix actual = new Matrix();
        String actualString = actual.toString();
        String expected = "[ 1.0, 0.0, 0.0, 0.0 ]\n[ 0.0, 1.0, 0.0, 0.0 ]\n[ 0.0, 0.0, 1.0, 0.0 ]\n[ 0.0, 0.0, 0.0, 1.0 ]\n";
        assertEquals(expected, actualString);
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testMultiply_Matrix() { //DONE
        Matrix m1 = new Matrix();
        fill(m1);
        Matrix m2 = new Matrix();
        fill(m2);
        Matrix actual = m1.multiply(m2);
        String actualString = actual.toString();
        String expected = "[ 56.0, 62.0, 68.0, 74.0 ]\n[ 152.0, 174.0, 196.0, 218.0 ]\n[ 248.0, 286.0, 324.0, 362.0 ]\n[ 344.0, 398.0, 452.0, 506.0 ]\n";
        assertEquals(expected, actualString);
        
    }

    /**
     * Test of rotateX method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testRotateX() {
        System.out.println("rotateX");
        double angle = 0.0;
        Matrix instance = new Matrix();
        instance.rotateX(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotateY method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testRotateY() {
        System.out.println("rotateY");
        double angle = 0.0;
        Matrix instance = new Matrix();
        instance.rotateY(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotationZ method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testRotationZ() {
        System.out.println("rotationZ");
        double angle = 0.0;
        Matrix instance = new Matrix();
        instance.rotationZ(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scale method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testScale() {
        System.out.println("scale");
        double xChange = 0.0;
        double yChange = 0.0;
        double zChange = 0.0;
        Matrix instance = new Matrix();
        instance.scale(xChange, yChange, zChange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testTranslate() {
        System.out.println("translate");
        float xChange = 0.0F;
        float yChange = 0.0F;
        float zChange = 0.0F;
        Matrix instance = new Matrix();
        instance.translate(xChange, yChange, zChange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @org.junit.jupiter.api.Test
    public void testMultiply_Vector() {
        System.out.println("multiply");
        Vector v = null;
        Matrix instance = new Matrix();
        Vector expResult = null;
        Vector result = instance.multiply(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
