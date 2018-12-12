import java.util.*;

public class SymbolTable {
    Stack<String> stack = new Stack<String>();
    Map<String, String> table = new Map<String, String>(); // continue with this idea later.

    public SymbolTable() {
        stack.push("$");
    }
    public void insert(String type, String varName) {
        table.put(type, varName); 
        stack.push(type + " " + varName);
    }
    public String get(String varName) {
        for (Object o : table.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            if (entry.getValue().equals(varName)) {return entry.getKey().toString();}
        }
        return null;
    }
    public Boolean check(String varName) {
        int count = 0;
        for (Object o : table.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            if (entry.getValue().equals(varName))
                count++;
        }
        return count > 1;
    }
    public void newScope() {
        table.clear();
        // start symbol for new scope
        stack.push("$"); 
    }
    public void print() {
        for (Object o:table.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getValue());
        }
    }
    public void endScope() {
        /*
         * Get rid of everything in the current scope
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
            stackItem = tmp.pop();
        }
        /*
         * now the stack has the proper scope from before the new scope was made
         * and the table is populated with the scope from before the new scope was made.
         */
    }

    public static void main(String [] args) {
        try {
            SymbolTable symbolTable = new SymbolTable();
            symbolTable.insert("int", "a");
            symbolTable.insert("String", "i");
            // symbolTable.insert("String", "a"); // should throw an error
            System.out.println(symbolTable.check("i")); // true
            symbolTable.newScope();
            System.out.println("NEW SCOPE STARTED");
            System.out.println(symbolTable.check("a")); // false
            symbolTable.insert("int", "a");
            System.out.println(symbolTable.check("i")); // false
            System.out.println(symbolTable.check("a")); // true
            symbolTable.endScope();
            System.out.println("END SCOPE");
            System.out.println(symbolTable.check("i")); // true
            System.out.println(symbolTable.check("a")); // true
            System.out.println(symbolTable.get("a")); // int
            System.out.println(symbolTable.get("b")); // null
        }
        catch (Exception e) {e.printStackTrace();}
    }
}