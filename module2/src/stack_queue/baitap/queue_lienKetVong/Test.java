package stack_queue.baitap.queue_lienKetVong;

public class Test {


    public static void main(String[] args) {
        Queue  q = new Queue();
        q .front = q .rear =  null;
        Node node = new Node();
        Solution solution = new Solution();
        solution.enQueue(q, 14);
        solution.enQueue(q, 22);
        solution.enQueue(q, 6);
        solution.displayQueue(q);

        Object value;
        System.out.printf("Deleted value = %d", solution.deQueue(q));
        System.out.printf("Deleted value = %d", solution.deQueue(q));

        solution.displayQueue(q);

        solution.enQueue(q, 9);
        solution.enQueue(q, 20);
        solution.displayQueue(q);

    
}


}
