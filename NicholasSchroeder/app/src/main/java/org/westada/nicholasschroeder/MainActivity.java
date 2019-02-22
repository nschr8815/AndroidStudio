package org.westada.nicholasschroeder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addButton = (Button) findViewById(R.id.button) ;
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt((firstNumEditText.getText().toString()));
                double num2 = Integer.parseInt((secondNumEditText.getText().toString()));
                double result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        Button addButton2 = (Button) findViewById(R.id.button2) ;
        addButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt((firstNumEditText.getText().toString()));
                double num2 = Integer.parseInt((secondNumEditText.getText().toString()));
                double result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });
        Button addButton3 = (Button) findViewById(R.id.button3) ;
        addButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt((firstNumEditText.getText().toString()));
                double num2 = Integer.parseInt((secondNumEditText.getText().toString()));
                double result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
        Button addButton4 = (Button) findViewById(R.id.button4) ;
        addButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt((firstNumEditText.getText().toString()));
                double num2 = Integer.parseInt((secondNumEditText.getText().toString()));
                double result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });

    }
}
