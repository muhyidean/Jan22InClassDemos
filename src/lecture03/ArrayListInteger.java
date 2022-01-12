package lecture03;

import java.util.Arrays;

public class ArrayListInteger {



        private static final int INITIAL_CAPACITY = 10;
        private Integer [] arr;
        private int size = 0;
        private int capacity;

        public ArrayListInteger() {
            capacity = INITIAL_CAPACITY;
            arr = new Integer[capacity];
        }

        public void insert(Integer num){
            if(size == capacity) {
                reallocate();
            }
            arr[size] = num;
            size++;
        }

        public int size(){
            return size;
        }

        private void reallocate(){
            capacity = capacity * 2;
            arr = Arrays.copyOf(arr,capacity);

        }

        public static void main(String[] args) {

        }



}
