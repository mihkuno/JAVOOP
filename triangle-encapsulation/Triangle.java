

public class Triangle {
    
    private float base;
    private float height;

    public Triangle() {} // constructor

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return this.base;
    }

    public float getHeight() {
        return this.height;
    }

    public float getArea() {
        return (this.base * this.height) / 2;
    }
}
