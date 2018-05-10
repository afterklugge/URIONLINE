
public class TestGeometricObject {
	/** Main method */
	public static void main(String[] args) {
		// Declare and initialize two geometric objects
		GeometicObject geoObject1 = new Circle(5);
		GeometicObject geoObject2 = new Rectangle(5, 3);

		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

		// Display circle
		displayGeometricObject(geoObject1);

		// Display rectangle
		displayGeometricObject(geoObject2);
	}

	/** A method for comparing the areas of two geometric objects */
	public static boolean equalArea(GeometicObject object1, GeometicObject object2) {
		return object1.getArea() == object2.getArea();
	}

	/** A method for displaying a geometric object */
	public static void displayGeometricObject(GeometicObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
		System.out.print("Date creating is " + object.getDateCreated());
	}
}