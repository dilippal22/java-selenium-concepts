/*If a class has an entity reference, it is known as aggregation.
 * It represents HAS-A relationship. Aggregation is used for code
 * re-usability.*/
//This is Aggregation Example

package com.java.aggregation;

class Operation{
	int square(int n){
		return n*n;
	}
}

class Circle{
	Operation op;	//Aggregation
	double pi = 3.14;
	public void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area of Circle is: "+result);
	}

double area(int radius){
	op = new Operation();
	int square = op.square(radius);
	return pi*square;
}

//public class AggregationExample {
	/*public void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area of Circle is: "+result);
	}*/

	//}

}
