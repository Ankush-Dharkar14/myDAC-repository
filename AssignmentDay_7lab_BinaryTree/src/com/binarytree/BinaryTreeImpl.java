package com.binarytree;

public class BinaryTreeImpl implements BinaryTreeInterface {
	public TreeNode root;
	static int count=0;
	int element=4;
	public BinaryTreeImpl() {
		root=null;
	}


	private int[] PreOrderHelper(TreeNode root) {

		//if root is empty the return null
		if(root==null) {
			return null;
		}

		System.out.print(root.data+ " " );
		if(root.leftChild!=null)
			PreOrderHelper(root.leftChild);
		if(root.rightChild!=null)
			PreOrderHelper(root.rightChild);

		return null;
	}


	private int[] InOrderHelper(TreeNode root) {

		//if root is empty the return null
		if(root==null) {
			return null;
		}


		if(root.leftChild!=null)
			InOrderHelper(root.leftChild);
		System.out.print(root.data+ " ");
		if(root.rightChild!=null)
			InOrderHelper(root.rightChild);

		return null;
	}


	private int[] PostOrderHelper(TreeNode root) {

		//if root is empty the return null
		if(root==null) {
			return null;
		}


		if(root.leftChild!=null)
			PostOrderHelper(root.leftChild);

		if(root.rightChild!=null)
			PostOrderHelper(root.rightChild);
		System.out.print(root.data+ " ");
		return null;
	}


	private int countTotalNodes(TreeNode root) {
		if(root==null) {
			return 0;
		}	
		else {
			return (1+countTotalNodes(root.leftChild)+countTotalNodes(root.rightChild));
		}
	}
	
	private int countLeafNodes(TreeNode root) {
		if(root==null) {
			return 0;
		}	
		
		else if(root.leftChild==null && root.rightChild==null){
			return 1;
		}
		else
			return countLeafNodes(root.leftChild)+countLeafNodes(root.rightChild);
	}
	
	private int countFrequency(TreeNode root) {
		if(root==null) {
			return 0;
		}
		if(root.data==element) {
			count=count+1;
		}
		
		if(root.leftChild!=null && root.leftChild.data==element) {
			count=count+1;
			countFrequency(root.leftChild);
		}
		
		if(root.rightChild!=null && root.rightChild.data==element) {
			count=count+1;
			countFrequency(root.rightChild);
		}
		return count;
		
	}
	
	//--------------------------------------------------------//
	@Override
	public int[] PreOrder() {
		System.out.print("PreOrder Elements are : ");
		return PreOrderHelper(root);
	}

	@Override
	public int[] InOrder() {
		System.out.print("InOrder Elements are : ");
		return InOrderHelper(root);

	}


	@Override
	public int[] PostOrder() {
		System.out.print("PostOrder Elements are : ");
		return PostOrderHelper(root);
	}

	@Override
	public int countTotalNodes() {
		return countTotalNodes(root);
	}
	
	@Override
	public int countLeafNodes() {
		return countLeafNodes(root);
	}
	

	public void CreateBinaryTree() {
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);

		root=first;
		first.leftChild=second;
		first.rightChild=third;

		second.leftChild=fourth;
		second.rightChild=fifth;

	}


	@Override
	public int countFrequency() {
		return countFrequency(root);
	}

}
