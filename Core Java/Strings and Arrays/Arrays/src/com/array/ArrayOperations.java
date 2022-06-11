package com.array;

public class ArrayOperations {
	
	public void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	public void arrayDemo(int arr[]) {
		printArray(arr);
		reverseArray(arr);
	}
	
	public void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		printArray(arr);
	}
	
	public void moveZeroes(int arr[]) {
		int j = 0;
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		printArray(arr);
	}
	
	public int[] resizeArray(int arr[],int capacity) {
		printArray(arr);
		int[] temp = new int[capacity];
		for(int i = 0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp; //avoiding the step arr = temp because it would be garbage collected
	}
	
	public int[] mergeSortedArrays(int arr1[],int arr2[]) {
		int resultLength = arr1.length + arr2.length;
		int i=0,j=0,k=0;
		int result[] = new int[resultLength];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k]=arr1[i];
				i++;
			}
			else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		if(i<arr1.length) {
			while(i<arr1.length) {
				result[k] = arr1[i];
				i++;
				k++;
			}
		}
		if(j<arr2.length) {
			while(j<arr2.length) {
				result[k] = arr2[j];
			    j++;
			    k++;
			}
		}
		return result;
	}
	
	public boolean checkPalindrome(String word) {
		char[] ch = word.toCharArray();
		int start = 0;
		int end = ch.length-1;
		while(start<end) {
			if(ch[start]!=ch[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		ArrayOperations obj = new ArrayOperations();
		
		System.out.println("Reversing an array");
		obj.arrayDemo(new int[] {1,2,3,4,5});
		
		System.out.println("Moving zeroes on one side of an array");
		obj.moveZeroes(new int[] {1,2,0,0,3,5,0,6});
		
		System.out.println("Resizing an array");
		int arr[] = obj.resizeArray(new int[] {1,2,3,4,5},10);
		
		obj.printArray(arr);
		
		System.out.println("Merging two sorted arrays");
		int arr1[] = {2,3,5,10};
		int arr2[] = {4,6,11,15};
		int result[] = obj.mergeSortedArrays(arr1, arr2);
		obj.printArray(result);
		
		System.out.println("Checking whether word is palindrome or not");
		System.out.println(obj.checkPalindrome("madame"));
		

	}

}
