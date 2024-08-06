package DynamicArraydemo;

import java.util.*;

class DynamicArray{
	private static final int initialCapacity = 16;
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray(){
		arr = new int[initialCapacity];
		size = 0;
		capacity = initialCapacity;
	}
	
	public void add(int val) {
		if (size == capacity) {
			expandArray();
		}
		arr[size++] = val;	
	}
	
	private void expandArray() {
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void display() {
		System.out.println("Elements in the List: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void insertAtPos(int pos, int val) {
		if (size == capacity) {
			expandArray();
		}
		for (int i = size-1; i >= pos; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos] = val;
		size++;
	}
	
	public void deleteAtPos(int pos) {
		for(int i = pos + 1; i < size; i++) {
			arr[i-1] = arr[i];
		}
		size--;
		
		if (capacity > initialCapacity && capacity > 3*size) {
			shrinkArray();
		}
	}
	
	private void shrinkArray() {
		capacity /= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
}

public class DynamicArraydemo1 {

	public static void main(String[] args) {
		int val,pos;
		DynamicArray list = new DynamicArray();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n-----------------LIST MENU-------------------\n");
			System.out.println("Press 1: INSERT the value at END.\n");
			System.out.println("Press 2: DISPLAY the list.\n");
			System.out.println("Press 3: INSERT the value as specified POSITION.\n");
			System.out.println("Press 4: DELETE from specified POSITION.\n");
			System.out.println("Press 5: EXIT.\n");
			System.out.println("\n---------------------------------------------\n");
			System.out.println("Enter Your Choice\n");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the value:");
					val = scanner.nextInt();
					list.add(val);
					break;
			case 2: list.display();
					break;
			case 3: System.out.println("Enter the Position(strats from zero(0)):");
					pos = scanner.nextInt();
					if (pos<0) {
						System.out.println("Invalid Position.");
						break;
					}
					System.out.println("Enter the value:");
					val = scanner.nextInt();
					list.insertAtPos(pos, val);
					break;
			case 4: System.out.println("Enter the Position(strats from zero(0)):");
					pos = scanner.nextInt();
					if (pos<0) {
						System.out.println("Invalid Position.");
						break;
					}
					list.deleteAtPos(pos);
					break;
			case 5: System.exit(0);
			default:System.out.println("Invalid choice.\n");
			}
			
		}
		

	}

}
