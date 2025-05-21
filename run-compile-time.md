```markdown
✅ 1. What is Compile Time?
Compile Time refers to the phase when your source code is converted into bytecode (in Java) by the compiler.

📌 What happens at Compile Time:

1. Syntax checking (missing semicolons, brackets, etc.)
2. Type checking (e.g., assigning a String to an int — compile-time error)
3. Variable declarations
4. Method signatures validation
5. Imports and package resolution

❌ Compile-Time Errors:
int x = "hello"; // ❌ Compile-time error: incompatible types

✅ 2. What is Run Time?
Run Time is when the program is actually executed, after successful compilation.

📌 What happens at Run Time:

1. Program instructions are executed line by line
2. Variables are assigned actual values
3. Objects are created in memory
4. Errors like division by zero, file not found, null pointer, etc., may occur

❌ Run-Time Errors:
int a = 10 / 0; // ❌ Run-time error: ArithmeticException (divide by zero)


| Feature             | Compile Time                       | Run Time                          |
| ------------------- | ---------------------------------- | --------------------------------- |
| When it happens     | Before program runs                | While program runs                |
| Who handles it      | Compiler (e.g., `javac`)           | Java Virtual Machine (JVM)        |
| Type of errors      | Syntax, type errors                | Logic, memory, exceptions         |
| Can stop execution? | Yes, program won’t compile         | Yes, throws exception/crashes     |
| Examples            | Missing semicolon, wrong data type | NullPointerException, divide by 0 |

```