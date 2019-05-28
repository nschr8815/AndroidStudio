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



    Button addButton = (Button) findViewById(R.id.button);
        addButton.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            double result = Variable1() + Variable2();
        resultTextView.setText(result + "");
    }
    });


    Button addButton2 = (Button) findViewById(R.id.button2);
        addButton2.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double result = Variable1() - Variable2();
        resultTextView.setText(result + "");
    }
    });


    Button addButton3 = (Button) findViewById(R.id.button3);
        addButton3.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){

        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double result = Variable1() * Variable2();
        resultTextView.setText(result + "");
    }
    });


    Button addButton4 = (Button) findViewById(R.id.button4);
        addButton4.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double result = Variable1() / Variable2();
        resultTextView.setText(result + "");
    }
    });


    Button addButton5 = (Button) findViewById(R.id.button5);
        addButton5.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double result = Math.pow(Variable1(), 2.0);
        resultTextView.setText(result + "");
    }
    });


    Button addButton6 = (Button) findViewById(R.id.button6);
        addButton6.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double result = Math.sqrt(Variable1());
        resultTextView.setText(result + "");
        //resultTextView.setText(result + "");
    }
    });
}

    public double Variable1()
    {
        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double num1 = Double.parseDouble((firstNumEditText.getText().toString()));
        return num1;

    };
    public double Variable2()
    {
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        double num2 = Double.parseDouble((secondNumEditText.getText().toString()));
        return num2;

    };


}
