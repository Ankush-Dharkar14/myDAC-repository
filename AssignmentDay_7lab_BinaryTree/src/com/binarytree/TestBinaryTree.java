package com.binarytree;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

 class TestBinaryTree {

	@Test
	void testPreOrder() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		bt.PreOrder();
		// assertEquals(bt.CreateBinaryTree(), ele);

	}

	@Test
	void testInOrder() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		bt.InOrder();
	}
	
	@Test
	void testPostOrder() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		bt.PostOrder();
	}

	
	@Test
	void testCountAllNodes() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		assertTrue(bt.countTotalNodes()==5);
		System.out.println("Total no of nodes are : "+bt.countTotalNodes());
	}
	
	@Test
	void testCountLeafNodes() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		assertTrue(bt.countLeafNodes()==3);
		System.out.println("Total no of leaf nodes are : "+bt.countLeafNodes());
	}
	
	@Test
	void testCountFrequency() {
		BinaryTreeImpl bt = new BinaryTreeImpl();
		bt.CreateBinaryTree();
		assertTrue(bt.countFrequency()==1);
		System.out.println("Frequency of element is : "+bt.countFrequency());
	}

}
