package geekofgeeks.array;

public class MajorityElementMoeMooreAlgo {

	public static void main(String[] args) {
		int[] arr = { 8, 6, 8, 4, 8, 2, 8 };
		int index = moorieVotingAlgo(arr);
		System.out.println(index);
	}

	private static int moorieVotingAlgo(int[] arr) {
		int index = findProspectiveCandidateIndex(arr);
		return isReallyProspectiveCandiateIndex(arr, index);
	}

	private static int isReallyProspectiveCandiateIndex(int[] arr, int index) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[index]) {
				count++;
			}
		}
		if (count > (arr.length / 2)) {
			return index;
		}
		return -1;
	}

	private static int findProspectiveCandidateIndex(int[] arr) {
		int prospectiveIndex = 0;
		int count = 1;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[prospectiveIndex] == arr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) { // reset counter and prospective candidate
				prospectiveIndex = i;
				count = 1;
			}
		}
		return prospectiveIndex;
	}

}
