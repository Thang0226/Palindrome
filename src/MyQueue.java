import java.util.LinkedList;

public class MyQueue<E> {
	private LinkedList<E> list;

	public MyQueue() {
		list = new LinkedList<>();
	}

	public void enqueue(E e) {
		list.addLast(e);
	}

	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			return list.removeFirst();
		}
	}

	private boolean isEmpty() {
		return list.isEmpty();
	}
}
