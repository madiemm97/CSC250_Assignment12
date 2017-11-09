package com.example.madiemm97.csc250_assignment12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        //MVC - linking interface widget to local variable

    }

    public void onChangeButtonPressed(View v)
    {
        //v will be the widget that calls this function
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        String s1 = inputET.getText.toString();
        String s2 = inputET2.getText.toString();
        String s1real = "";
        String s2real = "";
        for(int i = s1.length()-1; i >= 0; i--)
        {
            s1real = s1.charAt(i);
        }
        for(int i = s2.length()-1; i >= 0; i--)
        {
            s2real = s2.charAt(i);
        }
        String concat2strings = s1real + s2real;
        myLabel.setText(concat2strings);
    }
}
