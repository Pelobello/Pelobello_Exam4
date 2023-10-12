
package pelobello_exam4;

import javafx.scene.chart.PieChart;


public class Pelobello_Exam4 {
    
    
private class StackNode {
        String data;
        int quantity;
        StackNode next;
    }
  
    private StackNode top;
    private int size;
    

    private StackNode createNewNode(String element,int quantity) throws Exception {
        StackNode node = new StackNode();
          node.quantity =quantity;
        if (node == null) {
            throw new Exception("Empty!");
        } else {
            node.data = element+"----"+node.quantity;
             
            node.next = null;
             
            return node;
        }
     
    }

    public void push(String element, int quantity) throws Exception {
        StackNode node = createNewNode(element,quantity);
        if (size == 0) {
            top = node;
        } else {
            node.next = top;
            top = node;
           
        }
        size++;
  
    }

    public int pop() throws Exception {
        if (size == 0) {
            throw new Exception("Empty");
       }
   
       
        int temp = peek();
        top = top.next;

        return temp;
    }
    
   

    public int peek() throws Exception {
        if (size == 0) {
            throw new Exception("Empty");
        }
        return top.quantity;
    }

    public void display() throws Exception {
        if (size == 0) {
            throw new Exception("Empty");
        }
        StackNode temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("NULL");
    }
   
    public static void main(String[] args) throws Exception {
       Pelobello_Exam4 stack = new Pelobello_Exam4();
       
       
       stack.push("milo", 2);
       stack.push("Ariel", 2);
        stack.push("Piattos", 3-1);
       
   
       
       stack.display();
    }
    
}
