package test2;

public class ArrayQueue2 {
	private Object[] obj;
	private int rear;	//尾部
	private int front;	//头部
	private int size;
	
	
	
	public ArrayQueue2(int size){
		this.size=size;
		obj=new Object[size];
		rear=0;
		front=0;
	}
	
	/**
	 * 入队
	 * */
	public void inQueue(Object o){
		
		if(rear<size){
			obj[rear]=o;
			rear++;
		}else{
			System.out.println("队列已经满了");
		}	
	}
	
	/**
	 * 出队
	 * */
	public Object outQueue(){
		Object o = null;
		if(front!=rear){
			o = obj[front];
			obj[front] = null;
			front++;
		}else{
			System.out.println("队列为空,不能出队");
		}
		return o;
	}
	
	/**
	 * 遍历
	 * */
	public void ergodic(){
		for(int i=front;i<rear;i++){
			System.out.println(obj[i]);
		}
	}
}
