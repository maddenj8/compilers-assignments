javacc Assignment.jj
javac SLPParser.java
echo 

echo "Parsing empty_example.cal..."
java SLPParser empty_example.cal
echo 

echo "Parsing simple_func.cal..."
java SLPParser simple_func.cal
echo 

echo "Parsing diff_scopes.cal..."
java SLPParser diff_scopes.cal
echo 

echo "Parsing func_test.txt..."
java SLPParser func_test.cal
echo 