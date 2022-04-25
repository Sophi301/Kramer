
import java.lang.IndexOutOfBoundsException;

public class Vector {
	private final double[] vec;
	public final int nElements;
	
	Vector(double[] vec) {
		this.nElements = vec.length;
		this.vec = vec;
	}

	Vector(int nElements) {
		this(new double[nElements]);
	}
	
	public double get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > nElements) {
			throw new IndexOutOfBoundsException();
		}
		
		return vec[index];
	}
	
	public void set(int index, double value) throws IndexOutOfBoundsException {
		if (index < 0 || index > nElements) {
			throw new IndexOutOfBoundsException();
		}

		vec[index] = value;
	}

	public double dot(Vector otherVec) throws SizeMismatchException {
		if (nElements != otherVec.nElements) {
			throw new SizeMismatchException("Invalid dot product between two vectors of different sizes.");
		}

		double sum = 0;
		for (int i = 0 ; i < nElements ; ++i) {
			sum += vec[i] * otherVec.get(i);
		}

		return sum;
	}

	public static void main(String[] args) {
		Vector vec1 = new Vector(new double[]{4, -0.5, 3, 1, 0});
		Vector vec2 = new Vector(5);

		vec2.set(0, -0.1);
		vec2.set(0, 0.3);
		vec2.set(0, -1);
		vec2.set(0, 2.5);
		vec2.set(0, 3);

		try {
			System.out.printf("The resultant dot product is: %f\n", vec1.dot(vec2));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
