package com.tce.leetcodeSolution;

import java.util.LinkedList;
import java.util.List;

/*官方题解*/
public class sol257 {
	private void construct_paths(TreeNode root,String path,LinkedList<String> paths) {
		if(root!=null) {
			path += Integer.toString(root.val);
			if((root.left==null)&&(root.right==null))	//当前节点是叶子节点
				paths.add(path);
			else {
				path +="->";
				construct_paths(root.left,path, paths);
				construct_paths(root.right, path, paths);
			}
		}
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
		LinkedList<String> paths = new LinkedList<String>();
		construct_paths(root, "", paths);
		return paths;
	}
}
