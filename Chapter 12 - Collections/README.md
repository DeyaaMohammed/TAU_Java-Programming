# Chapter 12 Independent Exercise - Gradebook

Students were given a pop quiz, and collectively, they didn't do
so great. As a result, the instructor decided to give them a
make-up exam to allow them to improve their scores.

Given two maps of test scores, update the students' grades only
if they did better on the make-up exam.

Print the final grades.

Given two Maps of test scores, which I'm going to give to you, I would like you to update the student's grades only if they did better on the makeup exam. Then print the final grades.

Let me show you the two maps that I'm providing to you.

#### TestResults.java
```java
import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
}
```

You have two methods here. You have one to get the original grades and this returns a `Map`.

And these are the students, and these are their grades. Notice they didn't do so great. I got a really low score.

Then there's another method, `getMakeupGgrades()` that also returns a `Map`. And some folks did better in this one, some folks didn't.

What I would like you to do is make another class, and then you're going to make a call to these methods to get these Maps.

Then I want you to go through these Maps in your code and determine the final grade based on which one of these are higher.

- For example, on test 1, I got a 24, on the 2nd test I got a 97. So, my final grade should be a 97.
- However, for Lizzy she got an 80 on the 1st test, but a 76 on the 2nd one. So, she should keep her 80 score.

That's your assignment, give it a try.

> **_KINDLY NOTE:_**\
> *This is not the official solution; rather, it is my own implementation of the task's solution.*
