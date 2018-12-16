/*
 * so I solved the initial problem but now there is the problem that if there is a duplicate added to the
 * symbol table I won't be able to see if because the previous value is just overwritten and not added. This
 * means I can't just simply count the occurances to see if there is duplicates. Sort this out next.
 * CHECK THE LENGTH OF THE ARRAY THAT IS THE VALUE OF THE VARNAME KEY!!!
 */

import java.util.*;

public class SymbolTable {
    Stack<HashMap<String, ArrayList<String>>> stack = new Stack<HashMap<String, ArrayList<String>>>();
    HashMap<String, ArrayList<String>> scope = new HashMap<String, ArrayList<String>>();
    HashMap<String, ArrayList<String>> globalScope = new HashMap<String, ArrayList<String>>();
    Boolean gscope = true; // keep track of whether to insert into global or current scope

    public SymbolTable () {
        stack.push(new HashMap<String, ArrayList<String>>()); // empty scope to start the stack
    }
    public ArrayList<String> get(String varName) {
        ArrayList<String> result = scope.get(varName);
        if (result == null) 
            result = globalScope.get(varName);
        return result;
    }

    public Boolean check(String varName) {
        return get(varName) != null;
    }

    public void insert(String varName, String type) {
        System.out.println("varName " + varName + " type " + type);
        if (check(varName)) {
            if (gscope)
                globalScope.get(varName).add(type);
            else {
                scope.get(varName).add(type);        
            }
        }
        else {
            ArrayList<String> array = new ArrayList<String>();
            array.add(type);
            if (gscope)
                globalScope.put(varName, array);
            else
                scope.put(varName, array);
        }
    }

    public void insertArgs(String varName) { 
        // make sure you check not to overwrite anything that is already defined (for the type checker to point out)
        ArrayList var = new ArrayList<String>();
        var.add("param");
        scope.put(varName, var);
    }

    public void insertFunction(String funcName) {
        // make sure you check not to overwrite anything that is already defined (for the type checker to point out)
        if (check(funcName)) {
            get(funcName).add("function");
            return;
        }
                
        ArrayList func = new ArrayList<String>();
        func.add("function");
        globalScope.put(funcName, func);
    }

    public void newScope() {
        if (gscope) 
            gscope = false; // don't need to do anything to scope as it should be empty at this point.
        else {
            stack.push(scope);
            scope.clear();
        }
    }

    public void endScope() {
        scope = stack.pop(); // get old scope back
    }

    public void print() {
        for (Object o : scope.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getValue());
        }
        System.out.println("<<<<<<<<");
    }

    public static void main(String [] args) {
        SymbolTable ST = new SymbolTable();
        ST.insert("a", "int");
        ST.insert("b",  "String");
        System.out.println(ST.check("a")); // true
        System.out.println(ST.check("b")); // true
        System.out.println(ST.check("x")); // false
        ST.insert("a", "String");
        System.out.println(ST.get("a")); // [int, String]   
        ST.newScope();
        System.out.println(ST.check("a")); // true
        System.out.println(ST.check("b")); // true
        System.out.println(ST.check("x")); // false
        ST.insert("i", "int");
        System.out.println(ST.scope.get("i"));
        ST.endScope();
        System.out.println(ST.scope.get("i"));
        System.out.println(ST.check("a")); // true
        System.out.println(ST.check("b")); // true
        System.out.println(ST.check("x")); // false
        System.out.println(ST.check("i")); // false
        
    }
}