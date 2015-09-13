package childexam;

import javax.swing.JOptionPane;

/**
 *
 * @author amira_makhloof
 */
public class ChildExam {

    // premetive parameter
    static int score;
    static int r;
    // array of the old question that already asked 
    static int rOld[] = new int[11];

    public static void main(String[] args) {

        // start time 
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {

            // choose random number 1:10
            r = ((int) (Math.random() * 10.0)) + 1;

            // to not repeat the questions
            for (int l = 0; l < 11; l++) {
                if (r == rOld[l]) {
                    System.out.println("founded " + r);
                    r = ((int) (Math.random() * 10.0)) + 1;
                    System.out.println("new one " + r);
                    l = 0;
                }
            }

            // to fill the array ... contain the index of the questions that already asked
            rOld[i] = r;
            System.out.println(r);

            // to print arandom question
            String childAnswer = JOptionPane.showInputDialog(Questions.ques[r - 1]);
//            System.out.println(r-1);
            // to save the answer of this question
            String trueAnswer = Answers.ans[r - 1];
            if (trueAnswer.equals(childAnswer)) {
                score++;
            }
        } // for 
        Long end = System.currentTimeMillis();
        Long time = (end - start) / 1000;
        // end the question ...  show the score
        JOptionPane.showMessageDialog(null, "you get : " + score + " points \nyour time :  " + time + " seconds\nThank u for using this application...");

    }

}
