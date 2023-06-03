package Opgave2;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		Node current = start;

		while(current.next != null) {
			if(current.next.key == key) {
			return current.next.value;
			} else {
				current = current.next;
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		Node newNode = new Node();
		newNode.key = key;
		newNode.value = value;

		if (start == null) {
			start = newNode;
			size++;
		} else {
			Node current = start;
			while (current.next != null && current.key != key) {
				current = current.next;

				if (current.key == key) {
					V oldValue = current.value;
					//Assign the current value to the determined value input
					current.value = value;
					return oldValue;
				}
			}
			current.next = newNode;
			size++;
		}
		return null;
	}

	@Override
	public V remove(K key) {
		Node current = start;

		if (current.key == key) {
			Node temp = start;
			start = current.next;
			size--;
			return temp.value;
		}
		while (current.next != null) {
			if(current.next.key == key) {
				Node temp = current.next;
				current.next = current.next.next;
				size--;
				return temp.value;
			} else {
				current = current.next;
			}
		}
		return null;
	}

	@Override
	public int size() {

		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
