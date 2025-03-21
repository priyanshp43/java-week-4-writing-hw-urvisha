package homework_week_8.programme_17_carper_cost_calculator;

/**
 * Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 *
 * Write the following methods (instance methods):
 *  Method named getCost without any parameters, it needs to return the value of cost field
 */

public class Floor {
    double width;
    double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }

}
