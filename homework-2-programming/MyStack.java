public class MyStack<T> implements MyStackInterface<T>{
    
    //ArrayList<T> arr = new ArrayList<T>;
   
T[] arr;
    
    public MyStack(T[] arr){
        
        
         final int INIT_SIZE = 10;
         int size=0;
        //stack[] = new int[INIT_SIZE];
     
        
    
      arr [] stack = new T[INIT_SIZE];
       
    }
    
    
    public void push(T x){
        if (size ==stack.length()){
            increaseSize();
        }
         stack[size] = x;
    }
    
	public T pop(){
        if (T.isEmpty == true){
            throw ArrayIndexOutOfBoundsException();
        }
        
        int val = stack[size-1];
        size--;
        return T[size];
        
    }
    
	public T peek(){
        return T[size-1];
    }
    
	public boolean isEmpty(){
        if (size ==0){
           return true;
        }
        
        
    }
    
	public int size(){
        return size;
    }
    
    private void increaseSize(){
        if (size==stack.length()){
            int newSize = stack.length()*2;
            int newStack = new int[newSize];
            
            for (int i=0; i<stack.length(); i++){
                newStack[i] = stack[i];
                
                
                
            }
        }
    }
    
}