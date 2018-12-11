javac TypeCheckVisitor.java

jjtree Assignment2.jjt
javacc Assignment2.jj
javac SLPParser.java
echo 

echo "Parsing empty_example.cal..."
java SLPParser empty_example.cal
echo 

#boolean test_func(x:integer, y:boolean) is
#    variable x:integer;
#    variable y:integer;
#    x(y, z);
#    x:=-x;
