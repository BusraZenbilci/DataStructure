public class ArrayStack {

    private Employee [] stack;
    private int top;

    public ArrayStack (int capacity) {
        stack = new Employee[capacity];
    }

    public void push (Employee employee) {
        if (top == stack.length) {
            // need to resize the backing array
            Employee [] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack , 0 , newArray , 0 , stack.length);
        }
    }
}
