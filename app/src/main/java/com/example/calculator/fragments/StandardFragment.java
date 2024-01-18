package com.example.calculator.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.example.calculator.R;

public class StandardFragment extends Fragment {
    private TextView textView1;
    private TextView textView2;

    private AppCompatButton button0;
    private AppCompatButton button1;
    private AppCompatButton button2;
    private AppCompatButton button3;
    private AppCompatButton button4;
    private AppCompatButton button5;
    private AppCompatButton button6;
    private AppCompatButton button7;
    private AppCompatButton button8;
    private AppCompatButton button9;

    private Button clearButton, backspaceButton, dotButton, plusMinusButton, equalsButton;
    private Button x2Button, additionButton, subtractionButton, multiplicationButton, divisionButton;


    private double answer = 0;
    private double number = 0;
    private int option;

    public void operation() {
        switch (option) {
            case 1:
                answer = number + Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(Math.round(answer * 10000d) / 10000d));
                }
                break;
            case 2:
                answer = number - Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(Math.round(answer * 10000d) / 10000d));
                }
                break;
            case 3:
                answer = number * Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(Math.round(answer * 10000d) / 10000d));
                }
                break;
            case 4:
                answer = number / Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {

                    textView2.setText(Double.toString(Math.round(answer * 10000d) / 10000d));
                }
                break;
            case 5:
                answer = Math.pow(number, 2);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(Math.round(answer * 10000d) / 10000d));
                }
                break;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_standard, container, false);

        textView1 = view.findViewById(R.id.text_view_1);
        textView2 = view.findViewById(R.id.text_view_2);

        button0 = view.findViewById(R.id.button_0);
        button1 = view.findViewById(R.id.button_1);
        button2 = view.findViewById(R.id.button_2);
        button3 = view.findViewById(R.id.button_3);
        button4 = view.findViewById(R.id.button_4);
        button5 = view.findViewById(R.id.button_5);
        button6 = view.findViewById(R.id.button_6);
        button7 = view.findViewById(R.id.button_7);
        button8 = view.findViewById(R.id.button_8);
        button9 = view.findViewById(R.id.button_9);

        clearButton = view.findViewById(R.id.clear_button);
        backspaceButton = view.findViewById(R.id.backspace_button);
        plusMinusButton = view.findViewById(R.id.plusminus_button);
        dotButton = view.findViewById(R.id.dot_button);
        additionButton = view.findViewById(R.id.addition_button);
        subtractionButton = view.findViewById(R.id.subtraction_button);
        multiplicationButton = view.findViewById(R.id.multiplication_button);
        divisionButton = view.findViewById(R.id.division_button);
        x2Button = view.findViewById(R.id.x2_button);
        equalsButton = view.findViewById(R.id.equals_button);

        inIt();

        return view;
    }

    private void inIt() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("9");
            }
        });


        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.append(".");
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    try {
                        double currentNumber = Double.parseDouble(currentText);

                        if (currentNumber % 1 == 0) {
                            int integerValue = (int) currentNumber;
                            int newValue = -integerValue;

                            textView2.setText(String.valueOf(newValue));
                        } else {
                            double newValue = -currentNumber;

                            textView2.setText(String.valueOf(newValue));
                        }

                        adjustTextSize();
                    } catch (NumberFormatException e) {
                        textView2.setText("Error");
                    }
                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    number = Double.parseDouble(currentText);
                    option = 1;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;

                        textView1.setText(Integer.toString(numberAsInt) + " + ");
                    } else {
                        textView1.setText(Double.toString(number) + " + ");
                    }
                } else {
                    textView1.setText("0 +");
                }
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    number = Double.parseDouble(currentText);
                    option = 2;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + " - ");
                    } else {
                        textView1.setText(Double.toString(number) + " - ");
                    }
                } else {
                    textView1.setText("0 -");
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    number = Double.parseDouble(currentText);
                    option = 3;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + " × ");
                    } else {
                        textView1.setText(Double.toString(number) + " × ");
                    }
                } else {
                    textView1.setText("0 ×");
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    number = Double.parseDouble(currentText);
                    option = 4;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + " ÷ ");
                    } else {
                        textView1.setText(Double.toString(number) + " ÷ ");
                    }
                } else {
                    textView1.setText("0 ÷");
                }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        x2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 5;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + "^2");
                    } else {
                        textView1.setText(Double.toString(number) + "^2");
                    }
                } else {
                    textView1.setText("0^2");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                textView1.setText("");
                number = 0;
                answer = 0;
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////


        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentNumber = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentNumber)) {
                    textView2.setText(currentNumber.substring(0, currentNumber.length() - 1));
                    adjustTextSize();
                }
            }
        });


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                textView2.setText("");
            }
        });

    }

    private void appendNumber(String number) {
        textView2.append(number);

        adjustTextSize();
    }

    private void adjustTextSize() {
        int maxLength = 8;
        int defaultTextSize = 60;

        int length = textView2.getText().toString().trim().length();

        if (length > maxLength) {
            float newTextSize = defaultTextSize * (float) maxLength / length;
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, newTextSize);
        } else {
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, defaultTextSize);
        }
    }
}