package firstpackage;

public class BTNode {
char data;
BTNode left, right;
public BTNode(char _data, BTNode _left, BTNode _right) {
	data = _data;
	left = _left;
	right = _right;
}
public void PreOrderPrint(BTNode root) {
	if(root == null)
		return;
	System.out.println(root.data);
	PreOrderPrint(root.left);
	PreOrderPrint(root.right);	
}
public void InOrderPrint(BTNode root) {
	if(root == null)
		return;
	InOrderPrint(root.left);
	System.out.println(root.data);
	InOrderPrint(root.right);	
}
public void PostOrderPrint(BTNode root) {
	if(root == null)
		return;
	PostOrderPrint(root.right);	
	System.out.println(root.data);
	PostOrderPrint(root.left);
}
public int getHeight(BTNode root) {
	if (root == null) {
		return 0;
	}
	int l_h = getHeight(root.left);
	int r_h = getHeight(root.right);
	return Math.max(l_h, r_h);
}
public boolean contains(BTNode root, char find) {
	if (root == null) {
		return false;
	}
	if(root.data == find) 
		return true;
	if(contains(root.left, find))
		return true;
	return contains(root.right, find);
//	return (contains(root.left, find) || contains(root.right, find);
}
}
