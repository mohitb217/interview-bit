class SplayTree{
	Node head;
	SplayTree(){
		head = new Node();
	}

	Node rightRotate(Node x){
		Node temp = x.left.right;
		Node leftNode = x.left;

		//rotate
		x.left = temp;
		leftNode.right = x;

		return leftNode;

	}
	Node leftRotate(Node x){
		Node temp = x.right.left;
		Node rightNode = x.right;

		x.right = temp;
		rightNode.left = x;

		return rightNode;
	}

	Node splay(Node head, int data){
		if( head == NULL || head.data == data)
			return head;
		if(head.data>data){
			if(head.left == NULL)
				return head;
			if(head.left.data > data){
				head.left.left = splay(head.left.left,data);
				head = rightRotate(head);
			}
			else if (head.left.data<data) {
				head.left.right = splay(head.left.right,data);
				if(head.left.right!=NULL)
					head.left = leftRotate(head.left);
			}
			if (head.left==NULL) {
				return head;
			}
			else {
				return rightRotate(head);
			}
		}


		else {
			if(head.right==NULL) 
				return head;
			if(head.right.data>data){
				head.right.left = splay(head.right.left,data);
				if(head.right.left!=NULL)
					head.right = rightRotate(head.right);
			}
			else if(head.right.data<data){
				head.right.right = splay(head.right.right,data);
				head = leftRotate(head);
			}
			if(head.right==NULL){
				return head;
			}
			else{
				return leftRotate(head);
			}
		}
	}

	Node newNode(int data){
		Node node = new Node();
		node.data = data;
		return node;
	}


	Node insert(Node head, int data){
		if(head==NULL)
			return newNode(data);
		head = splay(head,data);

		if(head.data == data)
			return head;
		Node newnode = newNode(data);

		if(head.data>data){
			newnode.right = head;
			newnode.left = head.left;
			head.left  = NULL;
		}
		else{
			newnode.left = head;
			newnode.right = head.right;
			head.right = NULL;
		}
		return newnode;
	}

	void inOrder(Node head){
		if(head!=null){
			inOrder(head.left);
			System.out.println(head.key);
			inOrder(head.right);
		}
	}
}

class Node{
	int data = 0;
	Node left = NULL;
	Node right = NULL;
}