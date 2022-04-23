
public class Vector {
	private final double[] innerRepresentation;
	public final int nElements;
	
	Vector(double[] vec) {
		this.nElements = vec.length;
		this.innerRepresentation = vec;
	}

	Vector(int nElements) {
		this(new double[nElements]);
	}
	
	public double get(int index) throws Exception {
		// TODO: Implement
	}
	
	public void set(int index, double value) throws Exception {
		// TODO: Implement
	}
}
