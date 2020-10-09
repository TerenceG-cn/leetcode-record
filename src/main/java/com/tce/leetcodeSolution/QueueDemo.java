package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 基于队列的遍历算法，广度优先
 * 相对的栈的应用是 深度优先
 */
public class QueueDemo {
    public static void main(String[] args) {
        Node root=new Node(1);

        List<Integer> values = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node nextNode = queue.remove();
            values.add(nextNode.val);
            for (Node child : nextNode.children) {
                queue.add(child);
            }
        }

    }
}
