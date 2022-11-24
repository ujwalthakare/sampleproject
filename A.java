package java_1;

import java.util.Arrays;

public class A {
public static void main(String[] args) {
	
	int a[] = {1, 2, 2, 3, 4, 5, 6, 6, 7 ,7, 1 , 2,50};
	Arrays.sort(a);
//	int temp[] = new int[a.length];
	
	int j = 0;
	
	for (int i = 0; i < a.length - 1 ; i++) {
		if (a[i] != a[i+1]) {
			a[j++] = a[i];
		}
	}
		a[j++] = a[a.length - 1];
		
		for (int k = 0; k < j; k++) {
			System.out.print(" "+a[k]);
		}
	}
}

