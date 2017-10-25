package he;

import java.util.Stack;

public class MinStack {
        
        Stack<Integer> stack;  
        Stack<Integer> stack1;  
        public MinStack(){  
            stack=new Stack<Integer>();  
            stack1=new Stack<Integer>();  
        }  
          
        public void push(int number){  
            if(stack.isEmpty()){  
                stack.push(number);  
                stack1.push(number);  
            }else{  
                int num=stack.peek();  
                stack1.push(number);  
                if(num>number){  
                    stack.push(number);  
                }else{  
                    stack.push(num);  
                }  
            }  
        }  
          
        public int pop(){  
            if(stack.isEmpty()){  
                return 0;  
            }else{  
                stack.pop();  
                return stack1.pop();  
            }  
        }  
          
        public int min(){  
            if(stack.isEmpty()){  
                return 0;  
            }else{  
                return stack.peek();  
            }  
        }  
      
      
    }  
