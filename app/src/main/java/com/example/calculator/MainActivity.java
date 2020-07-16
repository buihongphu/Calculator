package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnReset;
    Button btnCal, btnExit;
    RadioButton rbtC;
    RadioButton rbrT;
    RadioButton rbtN;
    RadioButton rbtCh;
    EditText editA;
    EditText editB;
    TextView txt;
    boolean flag = false;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "";
        b = "";
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnCal = (Button) findViewById(R.id.btnCal);
        btnReset = (Button) findViewById(R.id.btnReset);
        rbtC = (RadioButton) findViewById(R.id.rbtC);
        rbrT = (RadioButton) findViewById(R.id.rbtT);
        rbtN = (RadioButton) findViewById(R.id.rbtN);
        rbtCh = (RadioButton) findViewById(R.id.rbtCh);
        editA = (EditText) findViewById(R.id.editA);
        editB = (EditText) findViewById(R.id.editB);
        txt = (TextView) findViewById(R.id.txt);
        editA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
            }
        });

        editA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        editB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }
        });

        editB.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
    }


    public void so1(View v) {
        if (flag) {
            a += btn1.getText().toString();
            editA.setText(a);
        } else {
            b += btn1.getText().toString();
            editB.setText(b);
        }
    }

    public void so2(View v) {
        if (flag) {
            a += btn2.getText().toString();
            editA.setText(a);
        } else {
            b += btn2.getText().toString();
            editB.setText(b);
        }
    }

    public void so3(View v) {
        if (flag) {
            a += btn3.getText().toString();
            editA.setText(a);
        } else {
            b += btn3.getText().toString();
            editB.setText(b);
        }
    }

    public void so4(View v) {
        if (flag) {
            a += btn4.getText().toString();
            editA.setText(a);
        } else {
            b += btn4.getText().toString();
            editB.setText(b);
        }
    }

    public void so5(View v) {
        if (flag) {
            a += btn5.getText().toString();
            editA.setText(a);
        } else {
            b += btn5.getText().toString();
            editB.setText(b);
        }
    }

    public void so6(View v) {
        if (flag) {
            a += btn6.getText().toString();
            editA.setText(a);
        } else {
            b += btn6.getText().toString();
            editB.setText(b);

        }
    }

    public void so7(View v) {
        if (flag) {
            a += btn7.getText().toString();
            editA.setText(a);
        } else {
            b += btn7.getText().toString();
            editB.setText(b);
        }
    }

    public void so8(View v) {
        if (flag) {
            a += btn8.getText().toString();
            editA.setText(a);
        } else {
            b += btn8.getText().toString();
            editB.setText(b);
        }
    }

    public void so9(View v) {
        if (flag) {
            a += btn9.getText().toString();
            editA.setText(a);
        } else {
            b += btn9.getText().toString();
            editB.setText(b);
        }
    }


    public void rbtC(View v) {
        if (flag) {
            a += rbtC.getText().toString();
            editA.setText(a);
        } else {
            b += rbtC.getText().toString();
            editB.setText(b);
        }
    }
    public void display(View v){
        Double a = Double.parseDouble(editA.getText().toString());
        Double b = Double.parseDouble(editB.getText().toString());
        Double s;
        if (rbtC.isChecked() == true)
            s = a + b;
        else if (rbrT.isChecked() == true)
            s= a-b;
        else if (rbtN.isChecked() == true)
            s= a*b;
        else
            s= a/b;
        txt.setText(String.valueOf(s));
    }

    public void reset(View view){
        a="";
        b="";
        editA.setText("");
        editB.setText("");
    }


    public void exit(View view) {
        System.exit(0);
    }
}





