package info.scope;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		maximumDifference = 0;
		for (int i = 0; i < elements.length; ++i) {
			for (int j = 0; j < elements.length; ++j) {
				int difference = elements[i] - elements[j];
				if (difference < 0)
					difference = (-1) * difference;
				if (maximumDifference < difference)
					maximumDifference = difference;
			}
		}
	}

}