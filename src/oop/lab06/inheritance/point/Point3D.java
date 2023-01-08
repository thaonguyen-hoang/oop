package oop.lab06.inheritance.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("(").append(getX())
                .append(", ").append(getY())
                .append(", ").append(z).append(")");
        return description.toString();
    }
}
