package com.example.luckylotto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> selected = new ArrayList<>();

    int clickedNumber = 0;
    public int generateNum()
    {
        int numberInt = (int)(Math.ceil(1 + Math.random()*68));
        return numberInt;
    }
    public void reset()
    {
        TextView firstNumText = findViewById(R.id.firstNum);
        TextView secondNumText = findViewById(R.id.secondNum);
        TextView thirdNumText = findViewById(R.id.thirdNum);
        TextView fourthNumText = findViewById(R.id.fourthNum);
        TextView fifthNumText = findViewById(R.id.fifthNum);
        TextView powerBallNumText = findViewById(R.id.powerBallNum);
        Button button = findViewById(R.id.button);
        firstNumText.setText(R.string.first_number);
        secondNumText.setText(R.string.second_number);
        thirdNumText.setText(R.string.third_number);
        fourthNumText.setText(R.string.fourth_number);
        fifthNumText.setText(R.string.fifth_number);
        powerBallNumText.setText(R.string.power_ball_num);
        button.setText(R.string.button);
        selected.removeAll(selected);
        clickedNumber = 0;
    }

    public void getNumbers(View view)
    {

        TextView firstNumText = findViewById(R.id.firstNum);
        TextView secondNumText = findViewById(R.id.secondNum);
        TextView thirdNumText = findViewById(R.id.thirdNum);
        TextView fourthNumText = findViewById(R.id.fourthNum);
        TextView fifthNumText = findViewById(R.id.fifthNum);
        TextView powerBallNumText = findViewById(R.id.powerBallNum);
        Button button = findViewById(R.id.button);
        switch(clickedNumber)
        {
            case 0:
            {
                int num1 = generateNum();
                String random = String.valueOf(num1);
                firstNumText.setText(random);
                button.setText(R.string.button2);
                selected.add(num1);
                clickedNumber+=1;
                break;
            }
            case 1:
            {
                int num2 = generateNum();
                String random = String.valueOf(num2);
                if(!selected.contains(num2))
                {
                    secondNumText.setText(random);
                    button.setText(R.string.button3);
                    selected.add(num2);
                    clickedNumber += 1;
                    break;
                }else
                {
                    secondNumText.setText("?");
                    button.setText(R.string.button7);
                    break;
                }
            }
            case 2:
            {
                int num3 = generateNum();
                String random = String.valueOf(num3);
                if(!selected.contains(num3))
                {
                    thirdNumText.setText(random);
                    button.setText(R.string.button4);
                    selected.add(num3);
                    clickedNumber += 1;
                    break;
                }else
                {
                    thirdNumText.setText("?");
                    button.setText(R.string.button7);
                    break;
                }
            }
            case 3:
            {
                int num4 = generateNum();
                String random = String.valueOf(num4);
                if(!selected.contains(num4))
                {
                    fourthNumText.setText(random);
                    button.setText(R.string.button5);
                    selected.add(num4);
                    clickedNumber += 1;
                    break;
                }else
                {
                    fourthNumText.setText("?");
                    button.setText(R.string.button7);
                    break;
                }

            }
            case 4:
            {
                int num5 = generateNum();
                String random = String.valueOf(num5);
                if(!selected.contains(num5))
                {
                    fifthNumText.setText(random);
                    button.setText(R.string.button6);
                    selected.add(num5);
                    clickedNumber += 1;
                    break;
                }else
                {
                    fifthNumText.setText("?");
                    button.setText(R.string.button7);
                    break;
                }
            }
            case 5:
                {
                    int num6 = (int)Math.ceil(1+ Math.random()*24);
                    String random = String.valueOf(num6);
                    powerBallNumText.setText(random);
                    button.setText(R.string.button8);
                    clickedNumber += 1;
                    break;
                }
            case 6:
            {
                reset();
            }
            default:
            {
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
