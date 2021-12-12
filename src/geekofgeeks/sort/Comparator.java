package geekofgeeks.sort;

import java.util.Arrays;
import java.util.TreeSet;

public class Comparator {

	public static void main(String[] args) {
		Integer arr[] = { 12, 23, 11, 2, 1 ,34};
		Arrays.sort(arr, (x, yroot) -> {
			boolean isXEven = x % 2 == 0;
			boolean isYEven = yroot % 2 == 0;
			if (isXEven && (!isYEven)) {
				return -1;
			} else if ((!isXEven) && isYEven) {
				return 1;
			}
			return 1;
		});
		System.out.println(Arrays.toString(arr));

	}

}
