package Opgave2;

public class SortedLinkedList {

    private Node first;


	public SortedLinkedList() {
		first = null;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;

        if (first == null) {
            first = newNode;
            newNode.next = null;
            return;
        } else if (e.compareTo(first.data) < 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node current = first.next;
            Node previous = first;
            boolean found = false;
            System.out.println("current: " + current + "previous: " + previous);

            while (current.next != null && !found) {
                if (e.compareTo(current.data) > 0) {
                    previous = current;
                    current = current.next;
                } else {
                    found = true;
                }
            }
            newNode.next = previous.next;
            previous.next = newNode;

        }
    }

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		Node node = new Node();
		while(node != null) {
			System.out.println(node.data);
			System.out.println("yo");
			node = node.next;
		}
	}
	
	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		// TODO
		return -1;
	}

	
	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		// TODO
		return false;
	}
	
	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		// TODO
		return false;
	}

	
	
	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
