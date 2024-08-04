package codefirst;

import java.util.*;
import java.math.*;


public class firstprograme {

	public static void main(String[] args) {
		System.out.println(evenlyDivides(2996));
	}
	static int evenlyDivides (int n) {
		int a = n;
		int count = 0;
		while (a!=0) {
			a=a/10;
			++count;
		}
		return (n%count);
	}
