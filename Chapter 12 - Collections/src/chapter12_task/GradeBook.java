package chapter12_task;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> secondTest = TestResults.getMakeUpGrades();

        for(var student : secondTest.entrySet()){
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = secondTest.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }

            System.out.println("Student: " + student.getKey()
                    + ", Grade:" + gradeBook.get(student.getKey()));
        }
    }
}
