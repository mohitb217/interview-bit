
class MyStack<T>{
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next=null;

		StackNode(T data){
			this.data = data;
		}
	}

	private StackNode<T> top;

	public T pop(){
		if(top!=null){
			T item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}

	public void push(T data){
		StackNode<T> newNode = new StackNode<T>(data);
		newNode.next=top;
		top = newNode;  
	}
	
}