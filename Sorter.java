import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Sorter {
	
	private static Random randomNumber = new Random();
	
	abstract void sort(int[] array);
	abstract void sort(String[] array);
	abstract void sort(double[] array);
	
	private static double[][] setRandomDoubleMatrix(int[] sizes) {
		double[][] randomMatrix = new double[sizes.length][];
		
		for (int sizeIndex=0; sizeIndex<sizes.length; sizeIndex++) {
			int numberElements = (int) (Math.pow(10, sizes[sizeIndex]))+1;
			double[] randomArray = new double[numberElements];
			
			for (int lineIndex=0; lineIndex<numberElements; lineIndex++) {
				randomArray[lineIndex] = randomNumber.nextDouble(numberElements);
			}
			randomMatrix[sizeIndex] = randomArray;
		}
		
		return randomMatrix;
	}
	
	private static String[][] setRandomStringMatrix(int[] sizes) {
		String[][] randomMatrix = new String[sizes.length][];
		
		for (int sizeIndex=0; sizeIndex<sizes.length; sizeIndex++) {
			int numberElements = (int) (Math.pow(10, sizes[sizeIndex]))+1;
			String[] randomArray = new String[numberElements];
			
			for (int lineIndex=0; lineIndex<numberElements; lineIndex++) {
				randomArray[lineIndex] = Integer.toString(randomNumber.nextInt(numberElements));
			}
			randomMatrix[sizeIndex] = randomArray;
		}
		
		return randomMatrix;
	}
	
	private static int[][] setRandomIntMatrix(int[] sizes) {
		int[][] randomMatrix = new int[sizes.length][];
		
		for (int sizeIndex=0; sizeIndex<sizes.length; sizeIndex++) {
			int numberElements = (int) (Math.pow(10, sizes[sizeIndex]))+1;
			int[] randomArray = new int[numberElements];
			
			for (int lineIndex=0; lineIndex<numberElements; lineIndex++) {
				randomArray[lineIndex] = randomNumber.nextInt(numberElements);
			}
			randomMatrix[sizeIndex] = randomArray;
		}
		
		return randomMatrix;
	}
	
	private static List<List<Double> > evaluateSortTime(List<Sorter> sortMethods, int[][] intMatrix, double[][] doubleMatrix, String[][] stringMatrix) {
		
		List<List<Double>> timeCollection = new ArrayList<>();
		List<Double> intTimes = new ArrayList<>();
		List<Double> doubleTimes = new ArrayList<>();
		List<Double> stringTimes = new ArrayList<>();
	
		for (Sorter sortMethod : sortMethods) {
			for (int[] intArray : intMatrix) {
				double startTime = System.nanoTime();
				sortMethod.sort(intArray);
				intTimes.add(System.nanoTime() - startTime);
			}
			for (double[] doubleArray : doubleMatrix) {
				double startTime = System.nanoTime();
				sortMethod.sort(doubleArray);
				doubleTimes.add(System.nanoTime() - startTime);
			}
			for (String[] stringArray : stringMatrix) {
				double startTime = System.nanoTime();
				sortMethod.sort(stringArray);
				stringTimes.add(System.nanoTime() - startTime);
			}
		}
		
		timeCollection.addAll(Arrays.asList(intTimes, doubleTimes, stringTimes));
		return timeCollection;
	}
	
	static void printTimeTable(List<List<Double>> timeCollection) {
		double[][] timeTable = new double[timeCollection.get(0).size()][timeCollection.size()];
	}
	
	public static void main(String args[]) {
		//Instance classes
		List<Sorter> sortMethods = new ArrayList<>(Arrays.asList(
				new QuickSort(),
				new MergeSort(),
				new BubbleSort()
				));
		
		//Set arrays
		int[] sizes = {2,3,4};
		int[][] intMatrix = Sorter.setRandomIntMatrix(sizes);
		double[][] doubleMatrix = Sorter.setRandomDoubleMatrix(sizes);
		String[][] stringMatrix = Sorter.setRandomStringMatrix(sizes);
		
		//Time evaluation
		List<List<Double>> timeCollection = evaluateSortTime(sortMethods, intMatrix, doubleMatrix, stringMatrix);
		printTimeTable(timeCollection);
	}

}
