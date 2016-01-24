import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static int[] removeDuplicates(int[] array) {
		Set<Integer> set = new LinkedHashSet<>();
		for (Integer i : array) {
			set.add(i);
		}
		int[] result = new int[set.size()];
		Iterator<Integer> iterator = set.iterator();
		for (int i = 0; iterator.hasNext(); ++i) {
			result[i] = (int) iterator.next();
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 2, 3, 4, 5, 6, 9, 10, 10 };
		int[] result = removeDuplicates(array);
		System.out.println(Arrays.toString(result));
	}
}