package geekofgeeks.array;

import java.util.*;

public class SieveOfEratosthenes_PrimeNo {
	// Print prime nos upto 50
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int no = Integer.parseInt(s.nextLine()); // no means print prime numbers uptil no
		final int FIRST_PRIME_NUMBER = 2;
		SortedSet<Integer> sortedSet = new TreeSet<>(); //soretedSet contains all no from 2 to no
		for (int i = 2; i <= no; i++)
			sortedSet.add(i);
		int primeNo = FIRST_PRIME_NUMBER;
		while (primeNo < no) {

			for (int p = (int) Math.pow(primeNo, 2); p <= no; p += primeNo) {
				sortedSet.remove(p); // remove p2 , p2+p i.e p(p+1) , p2+2p i.e p(p+2) and so on 

			}

			SortedSet<Integer> tailSet = sortedSet.tailSet(primeNo + 1); // find next prime no after primeNo
			System.out.println(primeNo+" "+tailSet);
			if (tailSet.isEmpty()) {
				System.out.print("Dekho break");
				break;

			}
			primeNo = tailSet.first(); // find next prime no after primeNo

		}

		System.out.println(sortedSet);

	}

}
