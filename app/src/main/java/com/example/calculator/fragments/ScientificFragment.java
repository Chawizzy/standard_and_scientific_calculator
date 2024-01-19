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

public class ScientificFragment extends Fragment {
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
    private Button log10Button, x10Button, sinButton, cosButton, tanButton, x1Button, lnButton, exButton, decButton, binButton;
    private Button x2Button, additionButton, subtractionButton, multiplicationButton, divisionButton;

    private double firstNumber = 0;
    private int number2;
    private int option;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scientific, container, false);

        textView1 = view.findViewById(R.id.textView1);
        textView2 = view.findViewById(R.id.textView2);

        button0 = view.findViewById(R.id.button0);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        button7 = view.findViewById(R.id.button7);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);

        clearButton = view.findViewById(R.id.clearButton);
        backspaceButton = view.findViewById(R.id.backspaceButton);
        plusMinusButton = view.findViewById(R.id.plusminusButton);
        dotButton = view.findViewById(R.id.dotButton);
        additionButton = view.findViewById(R.id.additionButton);
        subtractionButton = view.findViewById(R.id.subtractionButton);
        multiplicationButton = view.findViewById(R.id.multiplicationButton);
        divisionButton = view.findViewById(R.id.divisionButton);
        x2Button = view.findViewById(R.id.x2Button);
        equalsButton = view.findViewById(R.id.equalsButton);
        x10Button = view.findViewById(R.id.x10Button);
        x1Button = view.findViewById(R.id.x1Button);
        log10Button = view.findViewById(R.id.log10Button);
        sinButton = view.findViewById(R.id.sinButton);
        cosButton = view.findViewById(R.id.cosButton);
        tanButton = view.findViewById(R.id.tanButton);
        lnButton = view.findViewById(R.id.lnButton);
        exButton = view.findViewById(R.id.exButton4);
        decButton = view.findViewById(R.id.decButton);
        binButton = view.findViewById(R.id.binButton);

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

        x10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 6;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "10^" + "%d", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "10^" + "%.2f", firstNumber));
                    }
                } else {
                    textView1.setText("10^0");
                }
            }
        });

        x1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 7;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "1/(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "1/(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("1/0");
                }
            }
        });

        log10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 8;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "log10(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "log10(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("log10(0)");
                }
            }
        });

        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 10;

                    if (firstNumber % 1 == 0) {
                        int numberAsInt = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "sin(" + "%d" + ")", numberAsInt));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "sin(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("sin(0)");
                }
            }
        });

        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 11;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "cos(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "cos(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("cos(0)");
                }
            }
        });

        tanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 12;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "tan(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "tan(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("tan(0)");
                }
            }
        });

        lnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 16;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "in(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "in(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("ln(0)");
                }
            }
        });

        exButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Double.parseDouble(currentText);
                    textView2.setText("");
                    option = 17;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "e(" + "%d" + ")", newIntegerValue));
                    } else {
                        textView1.setText(String.format(Locale.getDefault(), "e(" + "%.2f" + ")", firstNumber));
                    }
                } else {
                    textView1.setText("e(0)");
                }
            }
        });

        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Integer.parseInt(currentText);
                    textView2.setText("");
                    option = 19;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d", newIntegerValue));
                    } else {
                        textView2.setText("Error");
                    }

                } else {
                    textView1.setText("0");
                }
            }
        });

        binButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView2.getText().toString().trim();

                if (!TextUtils.isEmpty(currentText)) {
                    firstNumber = Integer.parseInt(currentText);
                    textView2.setText("");
                    option = 20;

                    if (firstNumber % 1 == 0) {
                        int newIntegerValue = (int) firstNumber;

                        textView1.setText(String.format(Locale.getDefault(), "%d", newIntegerValue));
                    } else {
                        textView2.setText("Error");
                    }

                } else {
                    textView1.setText("0");
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

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                textView1.setText("");
            }
        });
    }

    private void appendNumber(String number) {
        textView2.append(number);

        adjustTextSize();
    }

    public void operation() {
        double secondNumber = 0;
        double answer = 0;

        if (option < 5 && option > 0) {
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
            case 6:
                answer = Math.pow(10, firstNumber);
                break;
            case 7:
                answer = 1 / firstNumber;
                break;
            case 8:
                answer = Math.log10(firstNumber);
                break;
            case 9:
                answer = Math.pow(firstNumber, (1 / secondNumber));
                break;

            case 10:
                answer = Math.sin(Math.toRadians(firstNumber));
                break;

            case 11:
                answer = Math.cos(Math.toRadians(firstNumber));
                break;

            case 12:
                answer = Math.tan(Math.toRadians(firstNumber));
                break;

            case 13:
                answer = Math.asin(Math.toRadians(firstNumber));
                break;

            case 14:
                answer = Math.acos(Math.toRadians(firstNumber));
                break;

            case 15:
                answer = Math.atan(Math.toRadians(firstNumber));
                break;

            case 16:
                answer = Math.log(firstNumber);
                break;

            case 17:
                answer = Math.exp(firstNumber);
                break;

            case 18:
                answer = Math.pow(firstNumber, secondNumber);
                break;

            case 19:
                int answer2 = Integer.parseInt(String.valueOf(number2), 2);

                textView2.setText(Integer.toString(answer2));

                break;

            case 20:
                int count = 0;
                int[] binary = new int[100];

                while (number2 != 0) {
                    binary[count] = number2 % 2;
                    number2 = number2 / 2;
                    count++;
                }

                for (int x = count - 1; x > 0; x--) {
                    textView2.setText(textView2.getText() + Integer.toString(binary[x]));
                }

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