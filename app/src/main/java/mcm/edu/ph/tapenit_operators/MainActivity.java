package mcm.edu.ph.tapenit_operators;

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

        int birthYear = 2001;
        int birthMonth = 11;
        int birthday = 30;

        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 27;

        int ageInYears, ageInMonths, ageInDays;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }

        if(birthday > currentDay){
            currentDay += 30;
            currentMonth -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthday;


            display.setText("My precise age is"+
                String.valueOf(ageInYears)+
                " Years,\n "+
                String.valueOf(ageInMonths)+
                " Months,\n "+
                String.valueOf(ageInDays)+
                " Days ");


    }
}