import javax.swing.*;

public class TechnicalAssessmentGUI {
    public static void main(String[] args) {

        //THIS IS THE WINDOW
        JFrame frame = new JFrame("Prime and Factorial Checker");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //LABEL
        JLabel label = new JLabel("Enter a number: ");
        label.setBounds(30, 30, 120, 25);

        //TEXTBOX
        JTextField numberField = new JTextField();
        numberField.setBounds(150, 30, 180, 25);

        //BUTTON
        JButton checkButton = new JButton("Check");
        checkButton.setBounds(150, 70, 100, 30);

        //IMPROVED: Added RootPane ENTER key; triggers checkButton
        frame.getRootPane().setDefaultButton(checkButton);

        //RESULT AREA
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(30, 120, 300, 100);
        resultArea.setEditable(false);


        // THIS BASICALLY ADDS ALL THE COMPONENT TO THE WINDOW
        frame.add(label);
        frame.add(numberField);
        frame.add(checkButton);
        frame.add(resultArea);

        checkButton.addActionListener(e -> { //THIS BEHAVIOR MEANS, WHEN THE BUTTON IS CLICKED BY THE USER, THE CODE WILL RUN.

            //TRY-CATCH FOR EXCEPTION HANDLING TO AVOID CRASHING OF APP
            try { //TRY MEANS RUN THE CODE; IF SOMETHING FAILS, CATCH WILL HANDLE THE ERROR INSTEAD OF CRASHING.

                String input = numberField.getText(); // THIS MEANS, GET WHAT THE USER TYPED IN TEXTBOX

                int number = Integer.parseInt(input); // THIS CONVERTS STRING TO INTEGER; FROM "INTEGER" TO INTEGER.

                String primeResult =
                        TechnicalAssessment.getPrimeResult(number); //This means, run the getPrimeResult from TechnicalAssessment.class then print the result and return/send to GUI

                String factorialResult =
                        TechnicalAssessment.getFactorialResult(number); //RUN PROGRAM FROM TECHNICALASSESSMENT.CLASS > PRINT RESULT > RETURN TO GUI

                resultArea.setText(
                        primeResult + "\n" + factorialResult); // THIS STORES THE TEXT THAT'S RETURNED FROM TECHNICALASSESSMENT.CLASS

            } catch (NumberFormatException ex) { // THIS METHOD HANDLES THE ERRORS FROM CODES INSIDE THE TRY TO AVOID CRASHING.

                resultArea.setText("Invalid input. Please enter numbers only."); //THIS MEANS (resultArea.setText)PASS-THIS-OBJECT.TO-THIS-FUNCTION > DISPLAY USING SET-TEXT.
            }

        });


        frame.setVisible(true); //TRUE = SHOW THE WINDOW
    }
}
