package com.interview.crackingcode.linkedlist;

import java.util.HashMap;

import com.interview.linkedlist.CharNode;

public class RemoveDuplicates {
	
	public static CharNode removeDuplicated(CharNode node) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		CharNode head = node;
		map.put(node.value, 1);
		while (node.next != null) { 
			CharNode node2 = node.next;
			if (map.containsKey(node2.value)) { // if duplicate
				node.next = node2.next;
				node2 = null;
			} else {	
				map.put(node2.value, 1);
				node = node.next;
			}			
		}		
		return head;
	}
}


