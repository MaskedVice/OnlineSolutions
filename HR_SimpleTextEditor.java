import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class HR_SimpleTextEditor {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int q = Integer.valueOf(scan.nextLine());
        TextEditor te = new TextEditor();
        for(int i = 0; i < q; i++){
            int type = scan.nextInt();
            
            if(type == 1){
                te.append(scan.next());
            } else if(type == 2){
                te.deleteAt(scan.nextInt());
            } else if(type == 3){
                te.printAt(scan.nextInt());
            } else if(type == 4){
                te.undo();
            }
        }
        writer.write(te.getStr(),0,te.getStr().length());
        writer.flush();
        writer.close();
        scan.close();
        
    }
}

class TextEditor{
    Stack<String> stack = new Stack<>();
    StringBuilder builder = new StringBuilder();
    StringBuilder writer = new StringBuilder();
    
    public TextEditor(){
        builder.append("");
    }
    
    public void append(String w){
        stack.push(builder.toString());
        builder.append(w);
    }

    public void deleteAt(int k){
        stack.push(builder.toString());
        builder.delete(builder.length()-k, builder.length());
    }
    
    public void printAt(int k){
        // System.out.println(builder.charAt(k-1));
        writer.append(builder.charAt(k-1)).append("\n");
    }
    
    public String getStr(){
        return writer.toString();
    }
    
    public void undo(){
        if(stack.size() == 0) return;
        builder.setLength(0);
        builder.append(stack.pop()); 
    }
}
