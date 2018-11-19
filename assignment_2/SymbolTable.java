import java.util.*;

public class SymbolTable {
    Stack<String> stack = new Stack<String>();
    Hashtable<String, String> table = new Hashtable<String, String>();
    public void insert(String type, String varName) throws Exception {
        if (check(varName)) {
            table.put(type, varName); 
            stack.push(type + " " + varName);
        }
        else
            throw new Exception("Variable Name already declared in scope"); // throw error
    }
    public Boolean check(String varName) {
        return table.contains(varName);
    }
    public void newScope() {
        table.clear();
        // start symbol for new scope
        stack.push("$"); 
    }
    public void endScope() {
        /*
         *Get rid of everything in the current scope
         * take the top item off the stack to begin.
         * Clear the table of the current scope to be replaced later
         */
        table.clear();
        String stackItem = stack.pop();
        while(stackItem != "$") 
            stackItem = stack.pop();
        /*
         * now we have to get the new current scope into the table
         * make a copy of stack that can be destroyed
         */
        Stack<String> tmp = stack;
        stackItem = tmp.pop();
        while (stackItem != "$") {
            String [] splitItems = stackItem.split(" ");
            table.put(splitItems[0], splitItems[1]);
        }
        /*
         * now the stack has the proper scope from before the new scope was made
         * and the table is populated with the scope from before the new scope was made.
         */
    }

    public static void main(String [] args) {
        System.out.println("Test this later");
    }
}