import java.util.HashSet;


class linkedList{
	class node{
		int data = 0;
		node next = null;
	}

	static node head;

	linkedList(){
		head=null;
	}

	void insert(int data){
		node temp = new node();
		temp.data = data;
		if(head==null){
			head = temp;
		}
		else{
			node traversalNode = head;
			
			while(traversalNode.next!=null){
				traversalNode= traversalNode.next;
			}
			traversalNode.next = temp;
		}
	}

	void deleteFront(){
		if(head!=null){
			head = head.next;
		}

	}
	void deleteEnd(){
		node traversalNode = head;
		if(traversalNode!=null){
			node temp = new node();
			if(head.next==null){
				head=null;
			}
			else{
				while(traversalNode.next!=null){
					temp =traversalNode;
					traversalNode = traversalNode.next;
				}
				temp.next=null;					
			}

		}
		
	}

	void deleteValue(int data){
		if(head.data==data){
			head=head.next;
		}
		else{
			node temp = new node();
			node traversalNode = head;
			while(traversalNode.data!=data && traversalNode.next!=null){
				temp = traversalNode;
				traversalNode = traversalNode.next;
			}
			temp.next = traversalNode.next;
		}
	}

	void print(){
		node traversalNode = head;
		while(traversalNode!=null){
			System.out.println(traversalNode.data);
			traversalNode = traversalNode.next;
		}
	}

	void deleteDuplicateValue(int data){
		
		while(head.data==data && head!=null){
			head = head.next;
		}
		node pre = new node();
		node traversalNode = head;
		pre = traversalNode;

		while(traversalNode!=null){
			
			if(traversalNode.data==data){
				pre.next=traversalNode.next;
			}
			else{
				pre = traversalNode;
			}
			traversalNode = pre.next;
		}
	}

	void noRepetition(){
		HashSet<Integer> Set = new HashSet<Integer>();
		node traversalNode = head;
		node pre = traversalNode;

		while(traversalNode!=null){
			if( Set.contains(traversalNode.data) ){
				pre.next = traversalNode.next;
			}
			else{
				Set.add(traversalNode.data);
				pre= traversalNode;
			}
			traversalNode = traversalNode.next;
		}
	}

	void noRepetitionNoBuffer(){
		node traversalNode = head;
		node pre = null;
		while(traversalNode!=null){
			pre = traversalNode;
			while(pre.next!=null){
				if(pre.next.data==traversalNode.data){
					pre.next = pre.next.next;
				}
				else{
					pre = pre.next;
				}
			}
			traversalNode = traversalNode.next;
		}
	}

	void elementFromLast(int k){
		node traversalNode = head;
		node requiredElement = head;
		int count = 0;
		while(traversalNode!=null){
			if(count<k){
				count++;
				traversalNode = traversalNode.next;
			}
			else{
				traversalNode = traversalNode.next;
				requiredElement= requiredElement.next;
			}
		}
		System.out.println("The "+k+"th element from last is "+requiredElement.data);
	}
	void middleElement(){
		node traversalNode = head;
		node middleNode = head;
		while(traversalNode.next!=null){
			traversalNode=traversalNode.next.next;
			if(traversalNode==null){
				break;
			}
			else{
				middleNode=middleNode.next;			
			}
		}
		System.out.println("The middleNode data is " + middleNode.data);
	}

	static void sumLists(linkedList a,linkedList b){
		
		linkedList sumList = new linkedList();
		node aTraversalNode = a.head;
		node bTraversalNode = b.head;
		int count = 0;
		int sum = 0;

		boolean loop = true;
		while(loop){
			if(aTraversalNode!=null && bTraversalNode!=null){
				if(count==0){
					sum = aTraversalNode.data+bTraversalNode.data;
				}
				if(count==1){
					sum = aTraversalNode.data+bTraversalNode.data+1;
					count = 0;
				}
				if(sum>9){
					count = 1;
					sum=sum-10;
				}
				else{
					count =0;
				}
				sumList.insert(sum);
				aTraversalNode=aTraversalNode.next;
				bTraversalNode=bTraversalNode.next;
			}
			else if(aTraversalNode==null && bTraversalNode!=null){
				if(count==0){
					sum = bTraversalNode.data;
				}
				if(count==1){
					sum = bTraversalNode.data+1;
					count = 0;
				}
				if(sum>9){
					count = 1;
					sum=sum-10;
				}
				else{
					count =0;
				}
				sumList.insert(sum);
				if(aTraversalNode!=null){
					aTraversalNode=aTraversalNode.next;
				}
				bTraversalNode=bTraversalNode.next;
			}
			else if(aTraversalNode!=null && bTraversalNode==null){
				if(count==0){
					sum = aTraversalNode.data;
				}
				if(count==1){
					sum = aTraversalNode.data+1;
					count = 0;
				}
				if(sum>9){
					count = 1;
					sum=sum-10;
				}
				else{
					count =0;
				}
				sumList.insert(sum);
				if(bTraversalNode!=null){
					bTraversalNode=bTraversalNode.next;
				}
				aTraversalNode=aTraversalNode.next;
			}
			else{
				if(count==1){
					sumList.insert(1);
				}
				loop=false;	
			}
		}
		sumList.print();

	}

	static void reverse(){
		node currNode = head;
		node pre=null,next = null;
		while(currNode!=null){
			next = currNode.next;
			currNode.next=pre;
			pre= currNode;
			currNode = next;				
		}
		head = pre;
	}

	
	public static void main(String[] args) { 
		linkedList list = new linkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.print();
	}


}