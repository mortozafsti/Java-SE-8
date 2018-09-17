package ChapterEight;

public class GradeExam {

    public static void main(String[] args) {

        char[][] answer = {
            {'A', 'D', 'C', 'D', 'A', 'C', 'D', 'D'},
            {'C', 'D', 'D', 'A', 'B', 'C', 'D', 'D'},
            {'A', 'D', 'C', 'D', 'A', 'C', 'D', 'D'},
            {'A', 'D', 'C', 'D', 'A', 'D', 'D', 'D'},
            {'A', 'D', 'C', 'A', 'A', 'A', 'D', 'D'},
            {'A', 'D', 'C', 'A', 'A', 'A', 'D', 'D'},
            {'A', 'C', 'C', 'A', 'A', 'C', 'A', 'D'}
        };
        char[] keys = {'A', 'D', 'C', 'D', 'A', 'C', 'D', 'D'};
        for (int i = 0; i < answer.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answer[i].length; j++) {
                if (answer[i][j] == keys[j]) 
                    correctCount++;
                
            }
            System.out.println("Student: " + i + " and Correct Count is: " + correctCount);
        }
    }
}
