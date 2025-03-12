package oop.exercises.exercises_on_inheritance.point2d;

import java.awt.*;

public class Point3D extends Point {
    private float z;
    public Point3D(float x, float y, float z) {
        this.z=z;
    }
    Point3D(){
        z=0.0f;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        float[] floats= new float[]{x,y,z};
    }
    public float[] getXYZ(){
        float[] floats= new float[3];
        floats[0]=x;
        floats[1]=y;
        floats[2]=z;
        return floats;
    }

    @Override
    public String toString() {
        return '(' + x + "," + y + "," + z + ')';
    }
}
