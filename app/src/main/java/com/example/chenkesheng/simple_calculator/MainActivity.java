package com.example.chenkesheng.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsubtract, btnmultiply, btndivide, btnresult, btnAC;
    TextView text1, text2, text3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        // show();

    }

    private void init() {
        btn0 = (Button) findViewById(R.id.but0);
        btn1 = (Button) findViewById(R.id.but1);
        btn2 = (Button) findViewById(R.id.but2);
        btn3 = (Button) findViewById(R.id.but3);
        btn4 = (Button) findViewById(R.id.but4);
        btn5 = (Button) findViewById(R.id.but5);
        btn6 = (Button) findViewById(R.id.but6);
        btn7 = (Button) findViewById(R.id.but7);
        btn8 = (Button) findViewById(R.id.but8);
        btn9 = (Button) findViewById(R.id.but9);
        btnadd = (Button) findViewById(R.id.add);
        btnsubtract = (Button) findViewById(R.id.subtract);
        btnmultiply = (Button) findViewById(R.id.multiply);
        btndivide = (Button) findViewById(R.id.divide);
        btnresult = (Button) findViewById(R.id.result);
        btnAC = (Button) findViewById(R.id.butAC);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnresult.setOnClickListener(this);
        btnAC.setOnClickListener(this);
    }

    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but0:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("0");
                } else {
                    text3.append("0");
                }
                break;
            case R.id.but1:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("1");
                } else {
                    text3.append("1");
                }
                break;
            case R.id.but2:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("2");
                } else {
                    text3.append("2");
                }
                break;
            case R.id.but3:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("3");
                } else {
                    text3.append("3");
                }
                break;
            case R.id.but4:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("4");
                } else {
                    text3.append("4");
                }
                break;
            case R.id.but5:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("5");
                } else {
                    text3.append("5");
                }
                break;
            case R.id.but6:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("6");
                } else {
                    text3.append("6");
                }
                break;
            case R.id.but7:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("7");
                } else {
                    text3.append("7");
                }
                break;
            case R.id.but8:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("8");
                } else {
                    text3.append("8");
                }
                break;
            case R.id.but9:
                if (isEmpty(text2.getText().toString())) {
                    text1.append("9");
                } else {
                    text3.append("9");
                }
                break;
            case R.id.add:
                text2.append("+");
                break;
            case R.id.subtract:
                text2.append("-");
                break;
            case R.id.multiply:
                text2.append("*");
                break;
            case R.id.divide:
                text2.append("/");
                break;
            case R.id.butAC:
                text1.setText("");
                text2.setText("");
                text3.setText("");
                break;
            case R.id.result:
                show_result(v);
                break;
        }
    }

    public void show() {

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("0");
                } else {
                    text3.append("0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("1");
                } else {
                    text3.append("1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("2");
                } else {
                    text3.append("2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("3");
                } else {
                    text3.append("3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("4");
                } else {
                    text3.append("4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("5");
                } else {
                    text3.append("5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("6");
                } else {
                    text3.append("6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("7");
                } else {
                    text3.append("7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("8");
                } else {
                    text3.append("8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty(text2.getText().toString())) {
                    text1.append("9");
                } else {
                    text3.append("9");
                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.append("+");
            }
        });
        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.append("-");
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.append("* ");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.append("/");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
                text3.setText("");
            }
        });
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_result(v);
            }

        });
    }

    private void show_result(View v) {
        String str = text1.getText().toString().trim();
        String str2 = text2.getText().toString().trim();
        String str3 = text3.getText().toString().trim();
        Toast.makeText(this, "=", Toast.LENGTH_SHORT).show();
        if (isEmpty(str2) || isEmpty(str) || isEmpty((str3))) {
            Toast.makeText(this, "参数错误", Toast.LENGTH_LONG).show();
            text1.setText("不能为空");
        } else {
            switch (str2) {
                case "+":
                    text1.setText((float) Float.parseFloat(str) + (float) Float.parseFloat(str3) + "");
                    text2.setText("");
                    text3.setText("");
                    break;
                case "-":
                    text1.setText((float) Float.parseFloat(str) - (float) Float.parseFloat(str3) + "");
                    text2.setText("");
                    text3.setText("");
                    break;
                case "*":
                    text1.setText((float) Float.parseFloat(str) * (float) Float.parseFloat(str3) + "");
                    text2.setText("");
                    text3.setText("");
                    break;
                case "/":
                    if (Integer.parseInt(str3) == 0) {
                        Toast.makeText(this, "参数错误", Toast.LENGTH_LONG).show();
                        text1.setText("除数不能为0");
                    } else {
                        text1.setText((float) Float.parseFloat(str) / (float) Float.parseFloat(str3) + "");
                        text2.setText("");
                        text3.setText("");
                    }
                    break;
                default:
                    Toast.makeText(this, "参数错误", Toast.LENGTH_LONG).show();
                    text1.setText("运算错误");
                    break;
            }
        }
    }


}
