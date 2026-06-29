package Stack;

class stack_creation {
    public int[] arr;
    public int capacity;
    public int top;

    stack_creation(int size) {
        capacity = size;
        top = -1;
        arr = new int[capacity];
    }

    public void push(int x){
        if (top == capacity - 1){
            System.out.println("Stack full");
            return;
        }
        arr[++top] = x;
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == capacity - 1;
    }

    int size(){
        return top + 1;
    }

    public static void main(String[] args){
        stack_creation st = new stack_creation(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.pop();

        System.out.println(st.pop());   // 30
        System.out.println(st.peek());  // 20
        System.out.println(st.isFull());
        System.out.println(st.size());

    }
}


