package codefirst;

import java.util.*;
import java.math.*;


public class firstprograme {

	public static void main(String[] args) {
		System.out.println(evenlyDivides(2445));
	}
    /* 
    example :
        the n is 2445 and the n is consider as a initialized count as 0.
        now a is entering into the while loop and now a = 2445/10 = 244 and count is 1 increased 
        when while loop condition is false until while loop is run.
    */
	static int evenlyDivides (int n) {
		int a = n;
		int count = 0;
		while (a!=0) {
			a=a/10;
			++count;
		}
		return (n%count);
	}
