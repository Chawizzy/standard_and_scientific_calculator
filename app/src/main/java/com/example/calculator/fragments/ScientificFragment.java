package com.example.calculator.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.calculator.R;

public class ScientificFragment extends Fragment {
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button clearButton, backspaceButton, dotButton, plusMinusButton, equalsButton;
    private Button log10Button, x10Button, sin1Button, sinButton, cos1Button, cosButton, tan1Button, tanButton, x1Button, x1yButton, lnButton, exButton, xyButton, decButton, binButton;
    private Button x2Button, additionButton, subtractionButton, multiplicationButton, divisionButton;
    private TextView textView1, textView2;

    private double number = 0, answer = 0;
    private int number2, answer2;
    private int option;

    public void operation() {
        switch (option) {
            case 1:
                answer = number + Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 2:
                answer = number - Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 3:
                answer = number * Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 4:
                answer = number / Double.parseDouble(String.valueOf(textView2.getText()));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 5:
                answer = Math.pow(number, 2);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 6:
                answer = Math.pow(10, number);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 7:
                answer = 1 / number;

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 8:
                answer = Math.log10(number);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;
            case 9:
                answer = Math.pow(number, (1 / Double.parseDouble(String.valueOf(textView2.getText()))));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 10:
                answer = Math.sin(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 11:
                answer = Math.cos(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 12:
                answer = Math.tan(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 13:
                answer = Math.asin(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 14:
                answer = Math.acos(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 15:
                answer = Math.atan(Math.toRadians(number));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 16:
                answer = Math.log(number);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 17:
                answer = Math.exp(number);

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 18:
                answer = Math.pow(number, Double.parseDouble(String.valueOf(textView2.getText())));

                if (answer % 1 == 0) {
                    int answerAsInt = (int) answer;
                    textView2.setText(Integer.toString(answerAsInt));
                } else {
                    textView2.setText(Double.toString(answer));
                }
                break;

            case 19:
                answer2 = Integer.parseInt(String.valueOf(number2), 2);


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
    }


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
        x1yButton = view.findViewById(R.id.x1yButton);
        sinButton = view.findViewById(R.id.sinButton);
        cosButton = view.findViewById(R.id.cosButton);
        tanButton = view.findViewById(R.id.tanButton);
        sin1Button = view.findViewById(R.id.sin1Button);
        cos1Button = view.findViewById(R.id.cos1Button);
        tan1Button = view.findViewById(R.id.tan1Button);
        lnButton = view.findViewById(R.id.lnButton);
        exButton = view.findViewById(R.id.exButton4);
        xyButton = view.findViewById(R.id.xyButton);
        decButton = view.findViewById(R.id.decButton);
        binButton = view.findViewById(R.id.binButton);

        inIt();

        return view;
    }

    private void inIt() {
        button0.setOnClickListener(v -> {
            if (textView2.getText().length() <= 8 ) {
                textView2.setText(textView2.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "1");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().length() <= 8) {
                    textView2.setText(textView2.getText() + "9");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                textView2.setText("");
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsp = null;

                if (textView2.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(textView2.getText());
                    stringBuilder.deleteCharAt(textView2.getText().length() - 1);
                    bsp = stringBuilder.toString();
                    textView2.setText(bsp);
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView2.getText().toString().contains(".")) {
                    textView2.setText(textView2.getText() + ".");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    number = number * (-1);

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView2.setText(Integer.toString(numberAsInt));
                    } else {
                        textView2.setText(Double.toString(number));
                    }
                } else {
                    textView2.setText("-");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
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
        ////////////////////////////////////////////////////////////////////////////////////////////

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
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
        ////////////////////////////////////////////////////////////////////////////////////////////

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
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
        ////////////////////////////////////////////////////////////////////////////////////////////

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
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

        x10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 6;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("10^" + Integer.toString(numberAsInt));
                    } else {
                        textView1.setText("10^" + Double.toString(number));
                    }
                } else {
                    textView1.setText("10^0");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        x1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 7;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("1/" + Integer.toString(numberAsInt));
                    } else {
                        textView1.setText("1/" + Double.toString(number));
                    }
                } else {
                    textView1.setText("1/0");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        log10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 8;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("log10(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("log10(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("log10(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        x1yButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 9;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + "^1/");
                    } else {
                        textView1.setText(Double.toString(number) + "^1/");
                    }
                } else {
                    textView1.setText("0^1/");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 10;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("sin(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("sin(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("sin(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 11;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("cos(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("cos(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("cos(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        tanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 12;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("tan(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("tan(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("tan(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        sin1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 13;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("sin1(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("sin1(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("sin1(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        cos1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 14;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("cos1(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("cos1(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("cos1(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        tan1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 15;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("tan1(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("tan1(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("tan1(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        lnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 16;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("ln(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("ln(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("ln(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        exButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 17;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText("e(" + Integer.toString(numberAsInt) + ")");
                    } else {
                        textView1.setText("e(" + Double.toString(number) + ")");
                    }
                } else {
                    textView1.setText("e(0)");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        xyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number = Double.parseDouble(text);
                    option = 18;
                    textView2.setText("");

                    if (number % 1 == 0) {
                        int numberAsInt = (int) number;
                        textView1.setText(Integer.toString(numberAsInt) + "^");
                    } else {
                        textView1.setText(Double.toString(number) + "^");
                    }
                } else {
                    textView1.setText("0^");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number2 = Integer.parseInt(text);
                    option = 19;
                    textView2.setText("");

                    textView1.setText(Integer.toString(number2));

                } else {
                    textView1.setText("0");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        binButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(textView2.getText());

                if (text != "") {
                    number2 = Integer.parseInt(text);
                    option = 20;
                    textView2.setText("");

                    textView1.setText(Integer.toString(number2));

                } else {
                    textView1.setText("0");
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

    }

    private void adjustTextSize() {
        // Set a maximum width for the TextView
        int maxWidth = textView2.getWidth() - textView2.getPaddingLeft() - textView2.getPaddingRight();

        // Get the Paint object from the TextView to measure the text width
        TextPaint textPaint = textView2.getPaint();

        // Get the current text from the TextView
        CharSequence text = textView2.getText();

        // Measure the width of the text
        float textWidth = Layout.getDesiredWidth(text, textPaint);

        // Adjust text size if it exceeds the maximum width
        while (textWidth > maxWidth && textView2.getTextSize() > 0) {
            float textSize = textView2.getTextSize();
            textView2.setTextSize(textSize - 1);
            textWidth = Layout.getDesiredWidth(text, textPaint);
        }
    }
}