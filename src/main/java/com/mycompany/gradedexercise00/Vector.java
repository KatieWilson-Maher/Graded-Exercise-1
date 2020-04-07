/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradedexercise00;

/**
 *
 * @author katie
 */
public class Vector {

    private double x, y, z, h;

    // A constructor will have no parameters. It will produce a Vector whose
    // elements all have a values equal to zero.
    //DONE
    public Vector() {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
    }

    // A constructor will have 3 floating point values. It will produce a Vector
    // whose x, y, and z elements have values equal those given by the parameter.
    // The fourth (homogeneous) coordinate will have a value equal to one.
    //DONE
    public Vector(double one, double two, double three) {
        x = one;
        y = two;
        z = three;
        h = 1;
    }

    //The dot() method will have one Vector parameter. Its return type is double.
    // It will compute the dot product of this vector and the parameter.
    //DONE
    public double dot(Vector v) {
        return this.x * v.get(0) + this.y * v.get(1) + this.z * v.get(2) + this.h * v.get(3);
    }

    //The magnitude() method will have no parameters. Its return type is double.
    // It will compute the magnitude of this vector.
    //DONE
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z + h * h);
    }

    //The normalize() method will have no parameters. Its return type is Vector.
    // It will produce a vector that has the same direction as this vector but a
    // magnitude (length) equal to one.
    //direction = inverse tan of y/x
    //DONE/TO TEST
    public Vector normalize() {
        Vector newV = new Vector();
        double mag = this.magnitude();
        newV.set(0, this.x / mag);
        newV.set(1, this.y / mag);
        newV.set(2, this.z / mag);
        newV.set(3, this.h / mag);
//      double dir = Math.atan(y/x);
        return newV;
    }

    // The cross() method will have one Vector parameter. It return type is Vector.
    // It will compute the cross product of the x, y, and z components of this vector
    // and the x, y, and z components of the parameter.
//    cx = aybz − azby
//    cy = azbx − axbz
//    cz = axby − aybx
    //x = 0, y = 1, z = 2
    //DONE
    public Vector cross(Vector v) {
        double cx = y * v.get(2) - z * v.get(1);
        double cy = z * v.get(0) - x * v.get(2);
        double cz = x * v.get(1) - y * v.get(0);
        Vector c = new Vector(cx, cy, cz);
        return c;
    }

    //The get() method will have one integer parameter. It return type is double.
    // It will return the x component of the vector if the parameter's value equals 0,
    // the y component if the parameter's value equals 1, the z component if the parameter's
    // value equals 2, and the homogeneous component if the parameter's value equals 3.  
    //DONE/COULD FIX
    public double get(int index) {
        double returnValue = 0;
        if (index == 0) {
            returnValue = x;
        }
        if (index == 1) {
            returnValue = y;
        }
        if (index == 2) {
            returnValue = z;
        }
        if (index == 3) {
            returnValue = h;
        }
        return returnValue;
    }

    //DONE/COULD FIX
    public void set(int index, double val) {
        if (index == 0) {
            this.x = val;
        }
        if (index == 1) {
            this.y = val;
        }
        if (index == 2) {
            this.z = val;
        }
        if (index == 3) {
            this.h = val;
        }
    }

    //DONE
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ", " + h + ")";
    }
}
