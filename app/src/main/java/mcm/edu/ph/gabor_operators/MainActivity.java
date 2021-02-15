package mcm.edu.ph.gabor_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYear = 2002;
        int birthMonth = 9;
        int birthDay = 11;

        int currentYear = 2021;
        int currentMonth = 2;
        int currentDay = 15;

        int ageinYears,ageInMonths,ageInDays;

        if (birthMonth>currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }
        if (birthDay>currentDay) {
            currentDay += 30;
            currentMonth -= 1;
        }

        ageinYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My precise age is \n"
                +String.valueOf(ageinYears)
                +" Years,\n"
                +String.valueOf(ageInMonths)
                +" Months,\n"
                +String.valueOf(ageInDays)
                +" Days.");
        }


    }
