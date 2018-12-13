/*
 * so I solved the initial problem but now there is the problem that if there is a duplicate added to the
 * symbol table I won't be able to see if because the previous value is just overwritten and not added. This
 * means I can't just simply count the occurances to see if there is duplicates. Sort this out next.
 */

import java.util.*;

public class SymbolTable {
    Stack<String> stack = new Stack<String>();
    HashMap<String, String> table = new HashMap<String, String>();

    public SymbolTable() {
        stack.push("$");
    }
    public void insert(String varName, String type) {
        table.put(varName, type); 
        stack.push(varName + " " + type);
    }
    public String get(String varName) {
        return table.get(varName);
    }
    public Boolean check(String varName) {
        return get(varName) != null;
    }
    public void newScope() {
        table.clear();
        // start symbol for new scope
        stack.push("$"); 
    }
    public void print() {
        for (Object o:table.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey());
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
            symbolTable.insert("a", "int");
            symbolTable.insert("b", "String");
            symbolTable.insert("i", "String");
            System.out.println(symbolTable.check("i")); // true
            symbolTable.newScope();
            System.out.println("NEW SCOPE STARTED");
            System.out.println(symbolTable.check("a")); // false
            symbolTable.insert("int", "a");
            System.out.println(symbolTable.check("i")); // false
            symbolTable.endScope();
            System.out.println("END SCOPE");
            System.out.println(symbolTable.check("i")); // true
            System.out.println(symbolTable.check("a")); // true
            System.out.println(symbolTable.get("a")); // int
            System.out.println(symbolTable.get("b")); // String
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
            symbolTable.print();
        }
        catch (Exception e) {e.printStackTrace();}
    }
}