package util;

public class SortUtils {
	/**
	 * ð������
	 * ����ԭ�������ڵ����������бȽϣ�������³������ƣ���С������ð����ǰ��
	 * ����������������������෴ʱ������������
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
	 * ��������
	 *����ԭ����Ĭ����һ������������в���һ�������Ӻ�����ǰɨ��
	 *  ������������Ԫ������ƣ�Ϊ����Ԫ���ṩ�ռ�
	 * */
	public void InsertSort(int[] data) {	
		for(int i=1;i<data.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(data[j+1]<data[j]) {
					swap(data, j, j+1);
				}	
			}	
		}
		//����ѭ����ӡ�����
		/*for(int a=0;a<data.length;a++) {
			System.out.println(data[a]);
		}*/
	}
	
	/**
	 * ѡ������
	 * ����˼�룺��һ�����֣�ѡ����С��һλ�����һλ�õ���������
	 * Ȼ����ʣ�µ�����ѡ��С�����͵ڶ�λ����������
	 * ��˷�����ֱ�������ڶ����������һ�����Ƚ�λ��
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
	 * ��������λ�ý���
	 * */
	public void swap(int[] data, int i, int j) {  
        int temp = data[i];  
        data[i] = data[j];  
        data[j] = temp;  
    }  
}