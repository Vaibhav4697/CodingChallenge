# Inheritance
Objective
Today, we're delving into Inheritance.

Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

1. A Student class constructor, which has  parameters:
	1. A string, firstName.
	2. A string, lastName.
	3. An integer, id.
	4. An integer array (or vector) of test scores, scores.

2. A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

<pre>
Grading Scale
90 <= average <= 100 --> O
80 <= average < 90 	 --> E
70 <= average < 80 	 --> A
55 <= average < 70 	 --> P
40 <= average < 55 	 --> D
average < 40 		 --> T
</pre>

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains firstName, lastName, and id, respectively. The second line contains the number of test scores. The third line of space-separated integers describes scores.


Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input
<pre>
Heraldo Memelli 8135627
2
100 80
</pre>
Sample Output
<pre>
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
</pre>
Explanation

This student had 2 scores to average: 100 and 80. The student's average grade is 90. An average grade of 90 corresponds to the letter grade O, so our calculate() method should return the character'O'.