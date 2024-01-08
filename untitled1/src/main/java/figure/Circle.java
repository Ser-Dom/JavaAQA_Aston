package figure;

class Circle implements Shape, Colored {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Circle - Perimeter: " + getPerimeter() + ", Area: " + getArea() +
                ", Fill Color: " + getFillColor() + ", Border Color: " + getBorderColor());
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

