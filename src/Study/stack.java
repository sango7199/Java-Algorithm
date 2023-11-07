package Study;

public class stack {
    public class IntStack {
        private int[] stk; // 스택용 배열
        private int capacity; // 스택의 크기
        private int ptr; // 스택 포인터

        // 실행시 예외 : 스택이 비어있음
        public class EmptyIntStackException extends RuntimeException {
            public EmptyIntStackException() {
            }
        }

        // 실행시 예외 : 스택이 가득 차있음
        public class OverflowIntStackException extends RuntimeException {
            public OverflowIntStackException() {
            }
        }

        // 생성자
        public IntStack(int maxlen) {
            ptr = 0;
            capacity = maxlen;
            try {
                stk = new int[capacity]; // 스택 본체용 배열을 생성
            } catch (OutOfMemoryError e) { // 생성할 수 없음
                capacity = 0;
            }
        }

        // push
        public int push(int x) throws OverflowIntStackException {
            if (ptr >= capacity) { // 스택이 가득참
                throw new OverflowIntStackException();
            }
            return stk[ptr++] = x;
        }

        // pop (정상에 있는 데이터를 꺼냄)
        public int pop() throws EmptyIntStackException {
            if (ptr <= 0) { // 스택이 빔
                throw new EmptyIntStackException();
            }
            return stk[--ptr];
        }

        // peek (정상에 있는 데이터를 들여다 봄)
        public int peek() throws EmptyIntStackException {
            if (ptr <= 0) { // 스택이 빔
                throw new EmptyIntStackException();
            }
            return stk[ptr - 1];
        }

        // clear (스택을 비움)
        public void clear() { ptr = 0; }

        // indexOf (스택에 해당 값이 있는 지 조사)
        public int indexOf(int x) {
            for (int i = ptr - 1; i >= 0; i++) {
                if (stk[i] == x) {
                    return i; // 검색 성공
                }
            }
            return -1; // 검색 실패
        }

        // getCapaciy (스택의 크기를 반환)
        public int getCapacity() { return capacity; }

        // size (스택에 쌓여있는 데이터 갯수를 반환)
        public int size() { return ptr; }

        // isEmpty (스택이 비어있는가?)
        public boolean isEmpty() { return ptr <= 0; }

        // isFull (스택이 가득 찼는가?)
        public boolean isFull() { return ptr >= capacity; }

        // dump (스택의 바닥부터 모든 데이터 출력)
        public void dump() {
            if (ptr <= 0) {
                System.out.println("스택이 비어있습니다.");
            } else {
                for (int i = 0; i < ptr; i++) {
                    System.out.print(stk[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
