import java.util.ArrayList;
import java.util.Arrays;

public class Combinations {

	public static void main(String[] args) {
		ArrayList<Integer> inputSet = new ArrayList<Integer>();
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		inputSet.addAll(Arrays.asList(arr));
		generateCombinations(inputSet, 3);

		System.out.println("final cout of nCr : " + count);
	}

	static ArrayList<Integer> finalCombinationsSet = new ArrayList<Integer>();
	static int count = 0;

	public static void generateCombinations(ArrayList<Integer> inputSet, int r) {

		if (r == 0) {
			System.out.println(finalCombinationsSet);
			count++;
		} else {
			assert r < inputSet.size();
			while (inputSet.size() >= r) {

				Integer chosen = inputSet.remove(0);
				finalCombinationsSet.add(chosen);

				ArrayList<Integer> subInputSet = new ArrayList<Integer>();
				subInputSet.addAll(inputSet);
				generateCombinations(subInputSet, r - 1);

				finalCombinationsSet.remove(chosen);

			}
		}
	}
}
