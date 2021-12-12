package geekofgeeks.array;

public class Exactly3Divisors {

	
	public static void main(String args[])
	{
		Divisors s= new Divisors();
		//s.exactly3Divisors(6);
		System.out.println(s.digitsInFactorial(5));
		System.out.print(Math.log10(1000));
	}
}


class Divisors
{
	 public int digitsInFactorial(int N)
	    {
	        //Your code here
	        int logSum=0;
	        for(int i=N; i>1;i--)
	        {System.out.println(i+"  "+Math.log10(i));
	            logSum+= Math.log10(i) ;
	        }
	        System.out.println(logSum);
	        
	        return (int)Math.floor(logSum)+1;
	    }
	public int exactly3Divisors(int N)
    {
        //Your code here
		
        java.util.SortedSet<Integer> allNumbers= new java.util.TreeSet<>();
        for(int i=2;i<=N;i++)
        allNumbers.add(i);
        int primeNo=2;
        for(int i=2;i<=N;i++){
            
            for(int no = primeNo*primeNo ; no<= N ; no=no+primeNo)
            {
                allNumbers.remove(no);
            }
            
            java.util.SortedSet<Integer> remainingNumbers=allNumbers.tailSet(i+1);
            if(remainingNumbers.isEmpty())
                break;
            primeNo=remainingNumbers.first();
        }
        //allNumbers now contains prime no uptil N (inclusive of N)
        return allNumbers.stream().filter( a ->  a*a <= N).collect(java.util.stream.Collectors.toList()).size();
        
        
    }
}

/*
Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. The only line of each test case contains an integer N.

Output:
For each testcase, in a new line, print the answer of each test case.

Your Task:
This is a function problem. You only need to complete the function exactly3Divisors() that takes N as parameter and returns count of numbers less than or equal to N with exactly 3 divisors.

Constraints :
1 <= T <= 105
1 <= N <= 109

Example:
Input :
3
6
10
30

Output :
1
2
3

Explanation:
Testcase 1: There is only one number 4 which has exactly three divisors 1, 2 and 4

*/

/*Hint


The logic behind this is, such numbers can have only three numbers as their divisor and also that include 1 and that number itself resulting into just a single divisor other than number, so we can easily conclude that required are those numbers which are squares of prime numbers so that they can have only three divisors (1, number itself and sqrt(number)). So all primes i, such that i*i is less than equal to N are three-prime numbers.
Note: We can generate all primes within a set using any sieve method efficiently and then we should all primes i, suct that i*i <=N.
*/