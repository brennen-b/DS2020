import java.util.Scanner;
public class SymbolBalance implements SymbolBalanceInterface{
    
    	public void setFile(String filename){
            
       
            
            char [] parseFile = new char [filename.length()];
           
            int size = parseFile.length;
          
            for (int i=0; i<parseFile.length-1; i++){
                char temp = filename.charAt(i);
                parseFile[i]=temp;
            }
            
            
        }
       public BalanceError checkFile(){
            
           
           
            
            return MismatchError();
            
            
        } // returns either MismatchError(int lineNumber, char currentSymbol, char symbolPopped)
					 //                EmptyStackError(int lineNumber), 
					 //                NonEmptyStackError(char topElement, int sizeOfStack). 
					 // All three classes implement BalanceError
       // public MismatchError( int lineNumber, char currentSymbol, char SymbolPopped){
            
            
     //   }
    
}