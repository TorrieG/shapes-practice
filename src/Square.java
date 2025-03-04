/**
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

//implement Shape interface and provide abstract method implementation
public class Square implements Shape {

    /*
  Define an instance variable for Square called as side
  Instance variable must be encapsulated
  double side
   */
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a square can be found as => side * side
    Perimeter of a square can be found as => 4 * side
    */
    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public double perimeter() {
        return 4 * getSide();
    }


    //Override toString() method here


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "side=" + side +
                '}';
    }
}
