                                                                              # Cuprins #

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# 1. BASICS about numbers, decimals and more in JAVA

❗❗❗❗❗❗
> SHORTCUTS in Java:  -> psvm = public static void main(String[] args) {...}
> ❗❗❗❗❗❗

    ## ✅I. -How to display the numbers: byte,short,int (integer), long
             -Primitives
             -Whole numbers, full numbers
             -How to open 'jshell'. Type in Command: 'jshell'

> With those values, primiteve values we know how much width(store) occupye every primitive (byte[-127, 127], short[-32767, 32767], int[...], long[...])
> Also note that if we need to find the negative value [Byte.MIN_VALUE], an for positive value [Byte.MAX_VALUE]
> Also note that we can't have 2 different ecuations in the same statement, we need to separate them by a comma ';'
> Can be 2 ecuations in the same statement only if they are from the same Primitive value []

> System.out.print("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VAL ")" );
> =======>>>Long Value Range (-9223372036854775808 to 9223372036854775807)

> long myLongValue = 100L;//The L is used to let Java know that this value must be included in the 'long' contion because it'a very large number
> =========>>>>myLongValue ==> 100
>
> byte firstByteValue = Byte.MAX_VALUE;
> ========>>>>firstByteValue ==> 127
>
> short secondShortValue = Short.MAX_VALUE;
> ========>>>>secondShortValue ==> 32767
>
> int thirdIntValue = Integer.MAX*VALUE;
> thirdIntValue ==> 2147483647
> CHALLENGE
> long lastValueLong = (long) 50.000 + 10 * (firstByteValue + secondShortValue + intValue); --- ORRRR --- long lastValueLong = 50.000L + 10L \* (firstByteValue + secondShortValue + ntValue);
> ❗❗❗❗❗ NOTE When we want to convert numbers to Long values we can add a 'suffix' at the end of the number like we see in the second exemple to make the ecuation work. The suffix is 'L' for Long

[Primitive.byte,short,int,long.IMG/documentation.IMAGES]/[Size.of.Primitive.Types.and.Width//documentation.IMAGES]/[Java's.Primitive.Types(whole.number,real.number,single.character,boolean.value//documentation.IMAGES)]

                                                                ❗❗❗ 🌳🌳[DECIMALS]🌳🌳 ❗❗❗

    ## ✅II. -Primitives. Float and Double Primitives;
              -Fractional parts
              -Numbers with decimals

> Floating-point Number Data Types: 'float', 'double'
>
> The FLOAT value/number:
> ----System.out.print("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");----
>
> > > > > > > > > > > > > Float Value Range(1.4E-45 to 3.4028235E38)

> The DOUBLE value/number:
> ----System.out.print("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
>
> > > > > > > > > > > > > > > > > > > > > > > > Double Value Range(4.9E-324 to 1.7976931348623157E308)

> EXEMPLES:

jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue=5;

myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

> ❗❗❗❗❗ NOTE. Any number with a decimal is a double in JAVA. So, 10.5 is a double by default in Java
> ❗❗❗❗❗ NOTE. Same as the Long primitive from the above lesson, here we also need to add a 'suffix' at the end of our value. For 'myFloatValue' = 5.25F, and for 'myDoubleValue' = 5.25D, otherwise we will get an error. It can work without the 'prefix' only for numbers like: 5, 2, etc, if we will have
> numbers with decimals we need to add the specific 'preffix'
>
> How to use 'Casting' and what is it:
> When we want to convert a decimal number to a whole number we can 'Cast' that number
>
> > > > > > > > > > > > > > > > > float myOtherFloatValue = (float) 5.35
> > > > > > > > > > > > > > > > > myOtherFloatValu ==> 5.25

------OR IF WE WANT TO ELIMINATE THE DECIMALS----------

> > > > > > > > > double numarDouble = 10.5F;
> > > > > > > > > int numarIntreg = (int) numarDouble; ---
> > > > > > > > > -------To eliminate the deimals we need to convert the number to an 'int' value/primitive

            ❗❗❗❗❗❗În acest caz, valoarea zecimală 10.5 este convertită la 10 prin eliminarea zecimalelor în timpul procesului de casting.
            Este important să fii atent la casting, deoarece poate duce la pierderea de informație. De exemplu, când convertești un double la int, partea zecimală este eliminată, iar rezultatul poate fi diferit de ceea ce te-ai aștepta.❗❗❗❗❗❗

> Precision of the Float and Double comparative with Int

jshell> myIntValue = 5/2;
myIntValue ==> 2

jshell> myFloatValue = 5f / 2f;
myFloatValue ==> 2.5

jshell> myDoubleValue = 5d / 2d;
myDoubleValue ==> 2.5

> another EXEMPLE

jshell> myIntValue = 5 / 3;
myIntValue ==> 1

jshell> myFloatValue = 5f / 3f;
myFloatValue ==> 1.6666666

jshell> myDoubleValue = 5d / 3d;
myDoubleValue ==> 1.6666666666666667

jshell> myDoubleValue = 5.00 / 3.00;
myDoubleValue ==> 1.6666666666666667

> > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > ❗❗❗❗❗❗ IMPORTANT NOTE ...ALWAYS USE ONLY -----DOUBLE NUMBERS------ ❗❗❗❗❗❗❗ <<<<<<<<>>>>>>>>

> another EXEMPLE: How to transform Pounds to Kilogram >>>

jshell> double numberPoun = 0.45359237d;

jshell> double myPoundNumbers = 200;
myPoundNumbers ==> 200.0

jshell> double convertedToKilograms = myPoundNumbers \* 0.45359237d;
convertedToKilograms ==> 90.718474

[]/[]

                                                           ❗❗❗ 👸👸[FLOAT & DOUBLE PRIMITIVES]👸👸 ❗❗❗

    ## ✅III. -The char and boolean Primitive Data Types

> NOTE . A char can store only a single character. If we compare it to a string witch can store multiple words. Char is used to store just 1 character
> How to find the unique codes for Symbols like letters, numbers, etc: https://symbl.cc/en/unicode/table/
> NOTE !!! that every symbol as letter, numbers, etc have a unique code number

> char myChar = 'D';
> ---myChar ==> 'D'

> Unicode Symbol for 'D': ==> U+0044 ... OR ... &#68

--- jshell> char myUnicode = '\u0044';
--- myUnicode ==> 'D'

---jshell> char myDecimalCodeTest = 68;
---myDecimalCodeTest ==> 'D'

> ❕❕❕❕❕❕❕❕❕❗❗❗❗ BOOLEAN Primitive Type ❕❕❕❕❕❕❕❕❕❗❗❗❗
>
> How to name the Boolen variables, just some exemples:
> -isCutomerOverTwntyOne
> -isEligibleForDiscount
> -hasValidLicense
> -isMarried
> -hasChildren
>
> Boolean gives just 2 options: True || False, Yes || No, 1 || 0;

---jshell> boolean myTrueBooleanValue = true;
myTrueBooleanValue ==> true

---jshell> boolean myFalseBooleanValue = false;
myFalseBooleanValue ==> false

> How to use String:

-jshell> String myString = "This is a string";
myString ==> "This is a string"

-jshell> myString = "I wish I had \u00241,000,000,00";
myString ==> "I wish I had $1,000,000,00"

> EXEMPLE for String:

---jshell> {
...> String numberString = "250.55";
...> numberString = numberString + "49.45";
...> System.out.print(numberString);
...> }
---250.5549.45

> anoter Exemple:

[[[jshell> double doubleNumber = 120.47; lastStrin = lastStrin + doubleNumber;
doubleNumber ==> 120.47
lastStrin ==> "1050120.47"]]]

<> ❗❗❗NOTE❗❗❗ when you want to write multiple statements in Jshell you can do it by separate them with ';', or by opening { ...code ... }

> ❗❗❗NOTE❗❗❗ A String + anything else, gives us a String as a result, concatenating anything after the String as text to the initial String

> [JAVA/DOCUMENTATION.IMAGES/Char.Variable.Methods.for.Values]/[JAVA/DOCUMENTATION.IMAGES/How.to.name.the.boolean.variables]/[JAVA/DOCUMENTATION.IMAGES/All.primitive.data]

                                                                    ❗❗❗ 🔗🔗[BOOLEAN & CHAR]🔗🔗 ❗❗❗

    ## ✅IV. -Operators, Operands and Expressions

> Exemple:

jshell> int result = 1 + 2; // 1 + 2 = 3
result ==> 3

jshell> int previousResult = result;
previousResult ==> 3

jshell> result = result -1; // 3 - 1 = 2
result ==> 2

jshell> System.out.print("previousResult = " + previousResult);
previousResult = 3

> How to concatenate variables to a String. How to concatenate char + char. ❗❗❗NOTE❗❗❗ when we want to concatenate 2 char's the values of the 'char' will be transformed in the 'uniCode', in our ex: A = 65, and B = 66;

jshell> char firstChar = 'A'; char secondChar = 'B';
firstChar ==> 'A'
secondChar ==> 'B'

jshell> System.out.print(firstChar + secondChar);
131

jshell> System.out.print("" + firstChar + secondChar);
AB

> ❗❗NOTE❗❗ all the values that are added with a String value get transformed in to Strings

> The Remainder Operator = how much from the right side Operator it fits inside of the left Operator and what is remain is the result

-jshell> result = result % 4; //the remainder of (5 % 3) = 1
result ==> 1

> How to take decimalls from an Abreviating Operator

jshell> {
...> int result = 10;
...> result-=5.5;
...> System.out.print("Result is " + result);
...> }
Result is 4 //this answer is not a decimal, because is an 'integer'
jshell>

jshell> {
...> double result = 10;
...> result-=5.5;
...> System.out.print("Result is " + result);
...> }
Result is 4.5 //here we obtaine a decimal by using the 'double' above

> The multiplier and the divider

jshell> {
...> double result = 10;
...> result\*=1.5;
...> System.out.print("Result is " + result);
...> }
Result is 15.0
jshell>

jshell> {
...> double result = 10;
...> result/=1.5;
...> System.out.print("Result is " + result);
...> }
Result is 6.666666666666667
jshell>

> [JAVA/DOCUMENTATION.IMAGES/The.Remainder.Operator]/[JAVA/DOCUMENTATION.IMAGES/The.abreviating.Operators]

                                                           ❗❗❗ 📬📬[OPERATORS, OPERANDS AND EXPRESSIONS]📬📬 ❗❗❗

    ## ✅V. -Logical Operators: Boolean values, && operators
            -Ternary Operators

[Hello.java]/[]

                                                           ❗❗❗ 🔬🔬[OPERATOR VALUES]🔬🔬 ❗❗❗

    ## ✅VI. -KeywordsAndExpressions === This is a new project, search on GIT-HUB:'KeywordsAndExpressions'

[Main.java]/[]

                                                           ❗❗❗ 🔐🔐[WORDS AND STATEMENTS]🔐🔐 ❗❗❗

    ## ✅VII. -Statements, Whitespace and Indentation (Code Organization) === This is a new project, search on GIT-HUB:"StatementsWhiteSpaceAndIndentin"

[Main.java]/[]

                                                                ❗❗❗ 🗿🗿[STATEMENTS]🗿🗿 ❗❗❗

    ## ✅VIII. -ofKeywordAndCodeBlock, === another project, search on Git-Hub by this name: "ofKeywordAndCodeBlock"
                -Methods

> How to not duplicate codes in java: we need to use/implement: METHODS


[Main.java]/[MainChallenge.java]

                                                              ❗❗❗ 🏢🏢[KEY-WORDS]🏢🏢 ❗❗❗

    ## ✅IX. -Methods

> If we want to create a Method/function that return something back, some value we neeed to write it like this ❗❗❗"public static int calculateMyAge(int dateOfBirth){ return (2023 - dateOfBirth);}"❗❗❗, we can't include the 'void' because the 'Methods' with 'void' included do not return values
> Check the file ❗❗❗'MainChallenge.java' to see the return Method 'public static int calculateScore (.....){...};'❗❗❗

[MainChallenge.java]/[]

                                                              ❗❗❗ 🌠🌠[METHODS]🌠🌠 ❗❗❗

    ## ✅X. -ORACLE CERTIFICATION 

-There are many shortcuts in JAVA like the Snippets in VsCode. Just look in the 'search LOOP' in the right up 👆 and type for 'tips'
-One tip that you can note is 'psvm', this will write a ['public class FOLDERNAME {...etc...}']

    ## ✅XI. -CHALLENGE.java 

[Challenge.java]

>How to use Methods, how to pass data between methods and call/summon other methods in your Maine method

    ## ✅XII. -More CHALLENGES:

1. Positive, negative or Zero : Write a method called checkNumber with an int parameter named number.
The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0

🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦
public class PositiveNegativeZero {
public static void main(String[] args) {
int number = 0;
checkNumber(number);
}
public static void checkNumber(int number) {
String resultText = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
System.out.println(resultText);
}
}
🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦

2. How to create a Speed Converter: From Miles to Kilometers.
   
   -Check the file [speedConverterChallenge]

3. How to calculate the MegaBytes Converter. Remaining kiloBytes, etc 

   -Check the file [MegaBytesConverter.java]

4. How to create a Barking Dog application where we check if the dog is barking between different hours using boolean and integer hours

    -Check the file [BarkingDogChallenge.java]

5. Leap Year Calculator. How to calculate the remaining/remainder and also to check with multiple if-else statements

    -Check the file [LeapYearCalculator.java]

6. How to compare the first 3 decimals to see if they are equals

   -Check the file [DecimalComparator.java]

7. How to check if a number is between a specific range, let's say between 13 and 19

    -Check the file [TennNumberChecker.java]

8. How to convert from feet to inches and then centimenters

    -Check the file [Centimenters.java]

9. How to transform seconds to minutes and then to hours

    -Check the file [SecondsAndMinutes.java]

10. How to find out the Circle Area and the sides for a rectangle
      
    -Check the file [AreaCalculator.java]
>How to find out the PI. --- Math.PI

11. How to calculate the Minutes and the Years

    -Check the file [MinutesToYearsAndDaysCalculator.java]

12. How to use if, else-if in chalenge where we check if the value is true/false ad the temperature is between some parameters

    -Check the file [PlayingCat.java]


    ## ✅XIII. -NEW PROJECT MethodOverloading, Check on GIT-HUB: "MethodOverloading"

> How to set a method with multiple parameters

[Main.java]/[]

                                                                                 ❗❗❗ 🚇🚇[METHOD-OVERLOADING]🚇🚇 ❗❗❗



# 4. Control-Flow.-Switch: Search on GIT-HUB: Control-Flow.-Switch// FOR-WHILE-etc LOOP

    ## ✅I. -How to use the Switch statement

-In the Switch Statements we can only use: byte, shot, int, char, String and enum
-We can't use: long, float, double or boolean
[Main.java]/[]

                                                                                 ❗❗❗ 🍥🍥[SWITCH-STATEMENT]🍥🍥 ❗❗❗

    ## ✅II. -CHALLENGE, practice with the "switch" statement
              -How to use 'switch' statements in a method with no 'return'/void

[nasaChallenge.java]/[DayOfTheWeekChallenge.java]

              -How to use functions in the "switch"/case statements, Ternary Operators, how to call a method inside of another method, finding the number of days depending on the month and year

[NumberOfDaysInMonth.java]/[]

    ## ✅III. -Loop. While-Loop. 

-How to automatically calculate the percentage using the LOOP
-How to increase the index, "i" with a specific amount for every loop

[TheForLoop.java]/[]
                         
                                                        ❗❗❗ 🔎🔎[FOR-LOOP-WHILE.LOOP]🔎🔎 ❗❗❗

    ## ✅IV. -ThePrimeNumberChallenge. Using the Loop statement

-How to find out how many PRIME numbers are by using a LOOP statement.
-How to use the For LOOP

[ThePrimeNumberChallenge.java]

    ## ✅V. -Challenge. How to use FOR loop to find out the numbers 3 and 5
            -How to find the divided numbers by both 3 and 5
            -How to use the DEGUBBER in the InteliJ
            -To see how to use the Debugger go and check the Section 6, ControlFlow, Lesson: Sum 3 and 5 Challenge and Using IntelliJ's Debugger
            
            -SumOdd, how to find out the our numbers using the FOR Loop, odd/impar

//=====================
Sum 3 and 5 Challenge
=====================

*Create a for loop using a range of numbers from 1 to 1000 inclusive.

*Sum all the numbers that can be divided by both 3 and 5

*Print out the numbers that have met the above conditions

*break out of the loop once you have found 5 numbers that met the conditions.

*After breaking out of the loop, print the sum of the numbers that met the conditions.

*Note: type all code in the main method


[Sum3And5Challenge.java]/[SummOdd.java]

                                                        ❗❗❗ 🔎🔎[CHALLENGE]🔎🔎 ❗❗❗

    ## ✅VI. -WHILE LOOPS

-WHILE: Continue executing code block until the loop expression becomes false.
-DO WHILE: Execute the code block once, then continue executing until the loop condition becomes false

=The difference between the normal LOOP and the WHILE loop is this:
            -normal LOOP: for(init, expression, increment){...}
            -while LOOP: while(expression){...}
            -do while LOOP: do { ... } while (expression);
❕❕❕❕❕❕❕❗❗❗❗❗NOTE ... the "do WHILE LOOP" is very good to use when we want to create the logic for a password, because we run for the first time, and the user typed it wrong, and we want to ask him again until a certain amount of times that we specifie, 3 or 5 times, etc. ❗❗❗❗❗❗❗❕❕❕❕❕❕❕

-How to skip conditions with WHILE LOOP, check [WhileLoopExemple.java]

-How to skip and display some values, let's say the even numbers in a range of array numbers [WhileLoopChallenge.java]

-How to find out the last digit/number in a whole number and how to sum those numbers after we separate them, for ex: 123, last numbers 1 - 2 - 3, sum: 6. [DigitSumChallenge.java]

-Loop theory: FOR loop & WHILE loop: search for IMG "[The While Statement]" in folder "documentation IMAGES" from "JAVA" folder

-How to use CONTINUE and BREAK in a WHILE loop, a very complex and good exemple: [Continue and Beak in a WHILE loop], in folder "documentation IMAGES" from "JAVA" folder

-How to find out if a number is Palindrome or not, how to take numbers from both right and left and compare the final number [NumberPalindrome.java]

-How to find out the first & last digit and sum them [FirstLastDigitSum.java]. how to extract the first digit, the logic behind

-How to find out the Even Digit numbers and sum/calculate the total of them  using a LOOP. Even number = divisible numbers with 2. === how to check if a number is even or not using an IF statement, and then using a WHILE LOOP to destructuring the number  ===== HOW TO implement this method of 
finding the even numbers and sum them by using the normal "FOR" LOOP: FOR(int i = number, i > 0, i /= 10){ ... }, etc [EvenDigitSum.java]

-How to find out if in two numbers we have an equal digit, for ex: number1 = 235, number2 = 361, ===> equalNumber = 3; === also how to use variables to store data and boolean values .[SharedDigit.java]

-How to extract the last digit from a number and compare 3 last digit numbers to see if 2 of those digits are equal. There are 2 solutions, check for both of them, the second one is cleaner and straight to the point[LastDigitChecker.java]

-How to find out the Greatest common divisor inside 2 numbers. Meaning we create a LOOP that will extract all the divisors from our 2 numbers and compare them to find if there are 1 divisor equal in both of the numbers [GreatestCommonDivisor.java]

-How to find out the perfect number. Meaning that we must find the perfect dividers of a number and, if the sum of those dividers is equal with the number itself than this is a perfect number. [PerfectNumber.java]

-FizzBuzz Challenge [FizzBuzz.java]

-How to convert numbers to words, how to return values in revers, how to count numbers, digit count [NumberToWords.java]

-How to use IF ELSE statement, multiple IF statement, IF inside another IF statement, how to declare a variable outside of the method. How to find if 2 values are equals with a total sum, and how to check if they are greater, lower or equal and return true or false depending on some 
specifications [FourPacker.java] ... very good exemple for IF - IF ELSE

-How to find out the largest prime from a number [LargestPrime.java]

-How to parse values and read input using System.console(), how to transform String to numbers/values... How to convert Double Strings to double numbers/values ... How to use "Scanner", how to get Input from Console ... How to use "try" and "catch" method... How to use the Scanner method 
[StringToNumber.java] ... to convert input text, String to numbers we need to use: "Integer.parseInt(variable name)" ... ❗❗❗ How to set parameters that will check the year to not be greater than the current year, and the years of the user to not be greater than 120 (assuming this is  the oldest 
person), also check if there are some negative numbers/years  [🔰🔰[YEAR SETTINGS]🔰🔰] ... /// ❗❗❗ How to check for bad data, bad numbers, wrong years, numbers with letters, etc. ex: BirthOfYear: 199r [📛📛], correct is: 1993 [💚]
-How to check if the user enters characters/letters in the number: [StringToNumber.java]. [🔰🔰[YEAR SETTINGS]🔰🔰]]. Lessons [70-71-72]

-CHALLENGE, how to read the input from the User

-How to take data from the Input user, how to take data from the user ... We must use: "Scanner" este o clasă din Java care este folosită pentru a obține input de la utilizator prin consolă sau din alte surse. and "System.in"

-How to access the code when using the "System.console().readLine()", type in the Terminal: java src/name of the file. Then will display you text from the console and the "println" if there is one

-How to use Scanner, how to use scanner and taking info/values from the Input User, and how to use Scanner by taking data from some files. Check the IMG from folder: 'documentation IMAGES [Instantiating Scanner]' ... to see in practice check the file project [StringToNumber.java] ... how to use 
System.in and System.out with scanner

[WhileDoWhileLoops.java]/[WhileLoopExemple.java]/[WhileLoopChallenge.java]/[DigitSumChallenge.java]

                                                        ❗❗❗ 🥃🥃[WHILE-LOOPS]🥃🥃 ❗❗❗
        
    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 5. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 6. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 7. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 8. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 9. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 10. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 11. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 12. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 13. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 14. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 15. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 16. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 17. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

    ## ✅XXI. subtitlu
    ## ✅XXII. subtitlu
    ## ✅XXIII. subtitlu
    ## ✅XXIV. subtitlu
    ## ✅XXV. subtitlu
    ## ✅XXVI. subtitlu
    ## ✅XXVII. subtitlu
    ## ✅XXVIII. subtitlu
    ## ✅XXIX. subtitlu
    ## ✅XXX. subtitlu
    ## ✅XXXI. subtitlu
    ## ✅XXXII. subtitlu
    ## ✅XXXIII. subtitlu
    ## ✅XXXIV. subtitlu
    ## ✅XXXV. subtitlu
    ## ✅XXXVI. subtitlu
    ## ✅XXXVII. subtitlu
    ## ✅XXXVIII. subtitlu
    ## ✅XXXIX. subtitlu
    ## ✅XL. subtitlu
