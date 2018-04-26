package util;

public class SortUtils {
	/**
	 * 冒泡排序
	 * 基本原理：相邻的两个数进行比较，大的玩下沉（后推），小的玩上冒（推前）
	 * 即相邻两个数与排序规律相反时，两个数交换
	 * */
	public void BubbleSort(int[] data) {
		for(int i=0;i<data.length;i++) {
			for(int j=data.length-1;j>i;j--) {
				if(data[j-1]>data[j]) {
					swap(data, j,j-1 );					 
				}
			}
			//System.out.println(data[i]);
		}
	}
	
	/**
	 * 插入排序
	 *基本原理：默认在一个有序的数组中插入一个数，从后面往前扫描
	 *  反复把已排序元素向后移，为插入元素提供空间
	 * */
	public void InsertSort(int[] data) {	
		for(int i=1;i<data.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(data[j+1]<data[j]) {
					swap(data, j, j+1);
				}	
			}	
		}
		//用于循环打印除结果
		/*for(int a=0;a<data.length;a++) {
			System.out.println(data[a]);
		}*/
	}
	
	/**
	 * 选择排序
	 * 基本思想：在一组数种，选择最小的一位数与第一位置的数交换，
	 * 然后在剩下的数中选最小的数和第二位置数交换，
	 * 如此反复，直到倒数第二个数和最后一个数比较位置
	 * */
	public void SelectionSort(int[] data) {
		for(int i=0;i<data.length;i++) {
			int Index=i;
			for(int j=data.length-1;j>i;j--) {
				if(data[j]<data[Index]) {
					Index=j;
				}
			}
			swap(data, Index, i);
			//System.out.println(data[i]);
		}
	}
		
	/**
	 * 把两个数位置交换
	 * */
	public void swap(int[] data, int i, int j) {  
        int temp = data[i];  
        data[i] = data[j];  
        data[j] = temp;  
    }  
}
