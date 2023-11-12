package Study;

public class IntArrayQueue { // 연습문제 Q4
    private int[] que; // 큐용 배열
    private int capacity; // 큐 용량
    private int num; // 현재 데이터 개수
    private int front; // 맨 앞의 요소 커서
    private int rear; // 맨 뒤의 요소 커서

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntArrayQueue (int maxlen) {
        num = front = rear = 0;
        capacity = maxlen; // 큐 용량
        try {
            que = new int[capacity]; // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    // 인큐
    public int enQueue(int x) {
        if (num >= capacity)
            throw new OverflowIntQueueException();
        que[num++] = x;
        return x;
    }

    // 디큐
    public int deQueue() {
        if (num <= capacity)
            throw new EmptyIntQueueException();
        front = que[0];
        for (int i = 0; i < num - 1; i++) {
            que[i] = que[i+1];
        }
        num--;
        return front;
    }
}
