package com.interview.iterator;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class EvenIterator implements Iterator<Integer> {
	Queue<Integer> queue = new ArrayDeque<>();
	
	public EvenIterator(List<Integer> list) {
		for (Integer i : list) {
			if (i % 2 == 0) this.queue.add(i);
		}
	}

	@Override
	public boolean hasNext() {
		return queue.size() > 0;
	}

	@Override
	public Integer next() {
		return queue.remove();
	}
}
