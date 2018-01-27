package com.example.android.friendsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    * Variable for quiz score
    */
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * This method is called when Submit button was clicked.
    *
    * @param name for the username in EditText.
    * @param answer1_1 is whether the user has checked the first radiobutton in question 1.
    * @param answer1_2 is whether the user has checked the second radiobutton in question 1.
    * @param answer1_3 is whether the user has checked the third radiobutton in question 1.
    * @param answer1_4 is whether the user has checked the fourth radiobutton in question 1.
    * @param answer2_1 is whether the user has checked the first radiobutton in question 2.
    * @param answer2_2 is whether the user has checked the second radiobutton in question 2.
    * @param answer2_3 is whether the user has checked the third radiobutton in question 2.
    * @param answer2_4 is whether the user has checked the fourth radiobutton in question 2.
    * @param answer3_1 is whether the user has checked the first radiobutton in question 3.
    * @param answer3_2 is whether the user has checked the second radiobutton in question 3.
    * @param answer3_3 is whether the user has checked the third radiobutton in question 3.
    * @param answer3_4 is whether the user has checked the fourth radiobutton in question 3.
    * @param answer4_1 is whether the user has checked the first radiobutton in question 4.
    * @param answer4_2 is whether the user has checked the second radiobutton in question 4.
    * @param answer4_3 is whether the user has checked the third radiobutton in question 4.
    * @param answer4_4 is whether the user has checked the fourth radiobutton in question 4.
    * @param answer5_1 is whether the user has checked the first radiobutton in question 5.
    * @param answer5_2 is whether the user has checked the second radiobutton in question 5.
    * @param answer5_3 is whether the user has checked the third radiobutton in question 5.
    * @param answer5_4 is whether the user has checked the fourth radiobutton in question 5.
    * @param answer6_1 is whether the user has checked the first radiobutton in question 6.
    * @param answer6_2 is whether the user has checked the second radiobutton in question 6.
    * @param answer6_3 is whether the user has checked the third radiobutton in question 6.
    * @param answer7_1 is whether the user has checked the first checkbox in question 7.
    * @param answer7_2 is whether the user has checked the second checkbox in question 7.
    * @param answer7_3 is whether the user has checked the third checkbox in question 7.
    * @param answer7_4 is whether the user has checked the fourth checkbox in question 7.
    * @param answer8_1 is whether the user has checked the first radiobutton in question 8.
    * @param answer8_2 is whether the user has checked the second radiobutton in question 8.
    * @param answer8_3 is whether the user has checked the third radiobutton in question 8.
    * @param answer8_4 is whether the user has checked the fourth radiobutton in question 8.
    * @param answer9_1 for the answer in the question 9 (EditText)
    * @param answer10_1 is whether the user has checked the first radiobutton in question 10.
    * @param answer10_2 is whether the user has checked the second radiobutton in question 10.
    * @param answer10_3 is whether the user has checked the third radiobutton in question 10.
    * @param answer10_4 is whether the user has checked the fourth radiobutton in question 10.
    *
    */
    public void submitAnswers(View view) {

        //Reset score after every click Submit button
        score = 0;

        //Gets the username from the EditText
        EditText userName = findViewById(R.id.user_name);
        String name = userName.getText().toString();

        // Checks whether the user entered the name
        if (name.isEmpty()) {
            Toast.makeText(this, getString(R.string.emptyName), Toast.LENGTH_LONG).show();
        } else {
            //Checks which radio button has been selected in question 1
            RadioButton button1_1 = findViewById(R.id.answer1_1);
            boolean answer1_1 = button1_1.isChecked();
            RadioButton button1_2 = findViewById(R.id.answer1_2);
            boolean answer1_2 = button1_2.isChecked();
            RadioButton button1_3 = findViewById(R.id.answer1_3);
            boolean answer1_3 = button1_3.isChecked();
            RadioButton button1_4 = findViewById(R.id.answer1_4);
            boolean answer1_4 = button1_4.isChecked();

            //Checks is any button has been selected in question 1
            if (!(answer1_1 || answer1_2 || answer1_3 || answer1_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question1Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 2
            RadioButton button2_1 = findViewById(R.id.answer2_1);
            boolean answer2_1 = button2_1.isChecked();
            RadioButton button2_2 = findViewById(R.id.answer2_2);
            boolean answer2_2 = button2_2.isChecked();
            RadioButton button2_3 = findViewById(R.id.answer2_3);
            boolean answer2_3 = button2_3.isChecked();
            RadioButton button2_4 = findViewById(R.id.answer2_4);
            boolean answer2_4 = button2_4.isChecked();

            //Checks is any button has been selected in question 2
            if (!(answer2_1 || answer2_2 || answer2_3 || answer2_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question2Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 3
            RadioButton button3_1 = findViewById(R.id.answer3_1);
            boolean answer3_1 = button3_1.isChecked();
            RadioButton button3_2 = findViewById(R.id.answer3_2);
            boolean answer3_2 = button3_2.isChecked();
            RadioButton button3_3 = findViewById(R.id.answer3_3);
            boolean answer3_3 = button3_3.isChecked();
            RadioButton button3_4 = findViewById(R.id.answer3_4);
            boolean answer3_4 = button3_4.isChecked();

            //Checks is any button has been selected in question 3
            if (!(answer3_1 || answer3_2 || answer3_3 || answer3_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question3Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }


            //Checks which radio button has been selected in question 4
            RadioButton button4_1 = findViewById(R.id.answer4_1);
            boolean answer4_1 = button4_1.isChecked();
            RadioButton button4_2 = findViewById(R.id.answer4_2);
            boolean answer4_2 = button4_2.isChecked();
            RadioButton button4_3 = findViewById(R.id.answer4_3);
            boolean answer4_3 = button4_3.isChecked();
            RadioButton button4_4 = findViewById(R.id.answer4_4);
            boolean answer4_4 = button4_4.isChecked();

            //Checks is any button has been selected in question 4
            if (!(answer4_1 || answer4_2 || answer4_3 || answer4_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question4Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 5
            RadioButton button5_1 = findViewById(R.id.answer5_1);
            boolean answer5_1 = button5_1.isChecked();
            RadioButton button5_2 = findViewById(R.id.answer5_2);
            boolean answer5_2 = button5_2.isChecked();
            RadioButton button5_3 = findViewById(R.id.answer5_3);
            boolean answer5_3 = button5_3.isChecked();
            RadioButton button5_4 = findViewById(R.id.answer5_4);
            boolean answer5_4 = button5_4.isChecked();

            //Checks is any button has been selected in question 5
            if (!(answer5_1 || answer5_2 || answer5_3 || answer5_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question5Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 6
            RadioButton button6_1 = findViewById(R.id.answer6_1);
            boolean answer6_1 = button6_1.isChecked();
            RadioButton button6_2 = findViewById(R.id.answer6_2);
            boolean answer6_2 = button6_2.isChecked();
            RadioButton button6_3 = findViewById(R.id.answer6_3);
            boolean answer6_3 = button6_3.isChecked();

            //Checks is any button has been selected in question 6
            if (!(answer6_1 || answer6_2 || answer6_3)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question6Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which checkboxes have been selected in question 7
            CheckBox button7_1 = findViewById(R.id.answer7_1);
            boolean answer7_1 = button7_1.isChecked();
            CheckBox button7_2 = findViewById(R.id.answer7_2);
            boolean answer7_2 = button7_2.isChecked();
            CheckBox button7_3 = findViewById(R.id.answer7_3);
            boolean answer7_3 = button7_3.isChecked();
            CheckBox button7_4 = findViewById(R.id.answer7_4);
            boolean answer7_4 = button7_4.isChecked();

            //Checks is any checkbox has been selected in question 7
            if (!(answer7_1 || answer7_2 || answer7_3 || answer7_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question7Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 8
            RadioButton button8_1 = findViewById(R.id.answer8_1);
            boolean answer8_1 = button8_1.isChecked();
            RadioButton button8_2 = findViewById(R.id.answer8_2);
            boolean answer8_2 = button8_2.isChecked();
            RadioButton button8_3 = findViewById(R.id.answer8_3);
            boolean answer8_3 = button8_3.isChecked();
            RadioButton button8_4 = findViewById(R.id.answer8_4);
            boolean answer8_4 = button8_4.isChecked();

            //Checks is any button has been selected in question 6
            if (!(answer8_1 || answer8_2 || answer8_3 || answer8_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question8Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Gets the answer for question 9 from the EditText
            EditText textField9 = findViewById(R.id.answer9_1);
            String answer9_1 = textField9.getText().toString();

            // Checks whether the user entered the value for question 9
            if (answer9_1.isEmpty()) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question9Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            //Checks which radio button has been selected in question 10
            RadioButton button10_1 = findViewById(R.id.answer10_1);
            boolean answer10_1 = button10_1.isChecked();
            RadioButton button10_2 = findViewById(R.id.answer10_2);
            boolean answer10_2 = button10_2.isChecked();
            RadioButton button10_3 = findViewById(R.id.answer10_3);
            boolean answer10_3 = button10_3.isChecked();
            RadioButton button10_4 = findViewById(R.id.answer10_4);
            boolean answer10_4 = button10_4.isChecked();

            //Checks is any button has been selected in question 10
            if (!(answer10_1 || answer10_2 || answer10_3 || answer10_4)) {
                Toast.makeText(this, getString(R.string.question) + " " + getString(R.string.question10Number) + " " + getString(R.string.noAnswerSelected), Toast.LENGTH_SHORT).show();
            }

            // Calculate final score for quiz
            int quizFinalScore = calculateScore(answer9_1, answer1_2, answer2_1, answer3_3, answer4_3, answer5_1, answer6_2, answer7_1, answer7_2,  answer7_3, answer7_4, answer8_2, answer10_4);

            //Checks if the user obtained a result less than or equal to 6. If so, it shows the first toast. If it doesn't, show the second toast.
            if (score <= 6) {
                Toast.makeText(this, name + getString(R.string.yourScore) + " " + quizFinalScore + "\n" + getString(R.string.notGoodKnowledge), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, name + getString(R.string.yourScore) + " " + quizFinalScore + "\n" + getString(R.string.goodJob) + "\n" + getString(R.string.goodKnowledge), Toast.LENGTH_LONG).show();
            }
        }
    }

    /*
    * This method is called to calculate final score in quiz.
    *
    * @param answer9_1 for the answer in the question 9 (EditText)
    * @param answer1_2 is whether the user has checked the second radiobutton in question 1 - correct answer.
    * @param answer2_1 is whether the user has checked the first radiobutton in question 2 - correct answer.
    * @param answer3_3 is whether the user has checked the third radiobutton in question 3 - correct answer.
    * @param answer4_3 is whether the user has checked the third radiobutton in question 4 - correct answer.
    * @param answer5_1 is whether the user has checked the first radiobutton in question 5 - correct answer.
    * @param answer6_2 is whether the user has checked the second radiobutton in question 6 - correct answer.
    * @param answer7_1 is whether the user has checked the first checkbox in question 7 - incorrect answer.
    * @param answer7_2 is whether the user has checked the second checkbox in question 7 - correct answer.
    * @param answer7_3 is whether the user has checked the third checkbox in question 7 - incorrect answer.
    * @param answer7_4 is whether the user has checked the fourth checkbox in question 7 - correct answer.
    * @param answer8_2 is whether the user has checked the second radiobutton in question 8 - correct answer.
    * @param answer10_4 is whether the user has checked the fourth radiobutton in question 10 - correct answer.
    *
    * @return final score for quiz
    *
    */
    public int calculateScore(String answer9_1, boolean answer1_2, boolean answer2_1, boolean answer3_3,
                              boolean answer4_3, boolean answer5_1, boolean answer6_2,
                              boolean answer7_1, boolean answer7_2, boolean answer7_3, boolean answer7_4,
                              boolean answer8_2, boolean answer10_4) {
        if (answer1_2) {
            score += 1;
        }
        if (answer2_1) {
            score += 1;
        }
        if (answer3_3) {
            score += 1;
        }
        if (answer4_3) {
            score += 1;
        }
        if (answer5_1) {
            score += 1;
        }
        if (answer6_2) {
            score += 1;
        }
        //Two checkboxes must be checked
        if (answer7_2 && answer7_4 && !answer7_1 && !answer7_3) {
            score += 1;
        }
        if (answer8_2) {
            score += 1;
        }
        if (answer9_1.equals("11")) {
            score += 1;
        }
        if (answer10_4) {
            score += 1;
        }


        return (score);
    }

    /*
    * This method is called when Reset button was clicked. The answers and username will be cleared.
    */
    public void clearAllAnswers(View view) {

        //Clear user name
        EditText name = findViewById(R.id.user_name);
        name.setText("");

        //Clear answers in question 1
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.clearCheck();

        //Clear answers in question 2
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.clearCheck();

        //Clear answers in question 3
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup3.clearCheck();

        //Clear answers in question 4
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.clearCheck();

        //Clear answers in question 5
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup5.clearCheck();

        //Clear answers in question 6
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup6.clearCheck();

        //Clear answers in question 7
        CheckBox checkBox7_1 = findViewById(R.id.answer7_1);
        checkBox7_1.setChecked(false);
        CheckBox checkBox7_2 = findViewById(R.id.answer7_2);
        checkBox7_2.setChecked(false);
        CheckBox checkBox7_3 = findViewById(R.id.answer7_3);
        checkBox7_3.setChecked(false);
        CheckBox checkBox7_4 = findViewById(R.id.answer7_4);
        checkBox7_4.setChecked(false);

        //Clear answers in question 8
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        radioGroup8.clearCheck();

        //Clear answers in question 9
        EditText editText9 = findViewById(R.id.answer9_1);
        editText9.setText("");

        //Clear answers in question 10
        RadioGroup radioGroup10 = findViewById(R.id.radioGroup10);
        radioGroup10.clearCheck();
    }
}
