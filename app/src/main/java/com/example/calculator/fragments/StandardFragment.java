package com.example.calculator.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.example.calculator.R;

import java.util.Locale;

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

    private Button clearButton;
    private Button backspaceButton;

    private Button dotButton;
    private Button plusMinusButton;

    private Button equalsButton;

    private Button x2Button;
    private Button divisionButton;
    private Button additionButton;
    private Button subtractionButton;
    private Button multiplicationButton;

    private double firstNumber = 0;
    private int option = 0;

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

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    try {
                        double currentDoubleNumber = Double.parseDouble(currentText);

                        if (currentDoubleNumber % 1 == 0) {
                            int integerValue = (int) currentDoubleNumber;
                            int newValue = -integerValue;

                            textView2.setText(String.valueOf(newValue));
                        } else {
                            double newValue = -currentDoubleNumber;

                            textView2.setText(String.valueOf(newValue));
                        }

                        adjustTextSize();
                    } catch (NumberFormatException e) {
                        textView2.setText(R.string.error);
                    }
                }
            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 1;


                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d" + " +", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "%.2f" + " +", firstNumber));
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
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 2;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d" + " -", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "%.2f" + " -", firstNumber));
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
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 3;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d" + " ×", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "%.2f" + " ×", firstNumber));
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
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 4;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d" + " ÷", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "%.2f" + " ÷", firstNumber));
                    }
                } else {
                    textView1.setText("0 ÷");
                }
            }
        });

        x2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 5;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "sqr(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "sqr(" + "%.2f" + ")", firstNumber));
                    }

                    Toast.makeText(getContext(), "On Click Listener", Toast.LENGTH_LONG).show();
                } else {
                    textView1.setText(R.string.square_number);
                }
            }
        });

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

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Equals", Toast.LENGTH_LONG).show();

                operation();


                textView1.setText("");


            }
        });
    }

    private void appendNumber(String number) {
        textView2.append(number);

        adjustTextSize();
    }

    private void operation() {
        double secondNumber = 0;
        double answer = 0;

        if(option < 5 && option > 0) {
            secondNumber = Double.parseDouble(String.valueOf(textView2.getText()).trim());
        }

        switch (option) {
            case 1:
                answer = firstNumber + secondNumber;
                break;
            case 2:
                answer = firstNumber - secondNumber;
                break;
            case 3:
                answer = firstNumber * secondNumber;
                break;
            case 4:
                answer = firstNumber / secondNumber;
                break;
            case 5:
                answer = Math.pow(firstNumber, 2);
                break;
        }

        displayAnswer(answer);
    }

    private void displayAnswer(double answer) {
        if (answer % 1 == 0) {
            int newIntegerValue = (int) answer;

            textView2.setText(String.format(Locale.getDefault(), "%d", newIntegerValue));
        } else {
            textView2.setText(String.format(Locale.getDefault(), "%.2f", answer));
        }

        adjustTextSize();
    }

    private void adjustTextSize() {
        int length = textView2.getText().toString().trim().length();
        int defaultTextSize = 60;
        int maxLength = 8;

        if (length > maxLength) {
            float newTextSize = defaultTextSize * (float) maxLength / length;

            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, newTextSize);
        } else {
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, defaultTextSize);
        }
    }
}