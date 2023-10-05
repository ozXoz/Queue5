/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationqueue5;

/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PriorityQueue
        //insert(2)
        //[1,2,3,5,7]
        // 0 1 2 3 4
        // items[i+1] = items[i]
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(1);
        queue.add(-1);
        queue.add(6);

        System.out.println(queue);

        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
    
}
