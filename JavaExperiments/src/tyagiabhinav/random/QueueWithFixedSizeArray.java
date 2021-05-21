package tyagiabhinav.random;

import java.util.LinkedList;

public class QueueWithFixedSizeArray {
    LinkedList<int[]> list;
    int frt, frtPtr, bck, bckPtr;

    QueueWithFixedSizeArray(){
        list = new LinkedList<>();
        list.add(new int[5]);
        frt = 0; frtPtr = 0; bck = 0; bckPtr = 0;
    }

    public void enqueue(int num){
        if(bck >= 5){
            bck = 0;
            list.add(new int[5]);
            bckPtr++;
        }
        int[] arr = list.get(bckPtr);
        arr[bck++] = num;
        list.remove(bckPtr);
        list.add(bckPtr, arr);
//        list.set(bckPtr, arr);
    }

    public int dequeue(){
        int ans = -1;
        if(frtPtr < bckPtr || (frtPtr == bckPtr && frt < bck)) {
            ans = (list.get(frtPtr))[frt++];
            if (frt >= 5) {
                frt = 0;
//                list.remove(frtPtr);
                frtPtr++;
            }
        } else {
            System.out.println("can not dequeue");
        }
        return ans;
    }


    public static void main(String[] args) {
        QueueWithFixedSizeArray q = new QueueWithFixedSizeArray();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(11);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
