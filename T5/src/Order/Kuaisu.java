package Order;

public class Kuaisu {
	public static void main(String[] args) {
		int[] a={3,4,9,0,7,2};
		Order(0, a.length-1, a);
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	static void Order(int left,int right,int[] a){
		int i,j,temp,t;
		if(left>right){
			return;
		}
		temp=left;
		i=left;
		j=right;
		
		while(i!=j){
			while(a[j]>a[temp]&&i<j){	//先从右往左
				j--;
			}
			while(a[i]<a[temp]&&i<j){	//再从左往右
				i++;
			}
			
			if(i<j){	//交换位置
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
		/**
		 * 进行分治
		 * */
		a[left]=a[i];
		a[i]=a[temp];
		
		/**
		 * 方法的递归调用
		 * */
		Order(left, i-1, a);
		Order(i+1, right, a);
	}
}
