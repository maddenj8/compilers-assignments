import java.util.*;

public class TestTable {
    ArrayList<String> table = new ArrayList<String>();
    public void insert(String var_name) {
        table.add(var_name);
    }
    public boolean check(String var_name) {
        int count = 0;
        for (String var : table) {
            if (var.equals(var_name))
                count++;
        }
        return count > 1;
    }
    public static void main(String [] args) {
        TestTable table = new TestTable();
        table.insert("i");
        table.insert("x");
        System.out.println(table.check("i")); // true
        System.out.println(table.check("x")); // true
        System.out.println(table.check("b")); // false
    }
    public void print () {
        for (String var : table) {
            System.out.println(var);
        }
    }
}