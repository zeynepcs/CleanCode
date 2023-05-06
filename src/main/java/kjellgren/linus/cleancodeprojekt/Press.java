package kjellgren.linus.cleancodeprojekt;

public class Press {

    double x, y;
    int c;
    boolean clear = true;
    final IFrameComponents ifc;

    public Press(IFrameComponents ifc) {
        this.ifc = ifc;
        off();
    }

    public void connectButton() {
        ifc.getButtonRb2().addActionListener(evt5 -> pressButtonOnPower());
        ifc.getButtonRb1().addActionListener(evt6 -> pressButtonSetOn());
        ifc.getButtonBack().addActionListener(evt1 -> pressButtonBack());
        ifc.getButtonClear().addActionListener(evt1 -> pressButtonClear());
        ifc.getButtonPlus().addActionListener(evt5 -> pressButtonPlus());
        ifc.getButtonSeven().addActionListener(evt5 -> pressButtonSeven());
        ifc.getButtonEight().addActionListener(evt2 -> pressButtonEight());
        ifc.getButtonNine().addActionListener(evt4 -> pressButtonNine());
        ifc.getButtonFour().addActionListener(evt3 -> pressButtonFour());
        ifc.getButtonFive().addActionListener(evt2 -> pressButtonFive());
        ifc.getButtonSix().addActionListener(evt4 -> pressButtonSix());
        ifc.getButtonOne().addActionListener(evt3 -> pressButtonOne());
        ifc.getButtonTwo().addActionListener(evt4 -> pressButtonTwo());
        ifc.getButtonThree().addActionListener(evt3 -> pressButtonThree());
        ifc.getButtonMinus().addActionListener(evt2 -> pressButtonMinus());
        ifc.getButtonMultiply().addActionListener(evt -> pressButtonMultiply());
        ifc.getButtonDivide().addActionListener(evt1 -> pressButtonDiv());
        ifc.getButtonDot().addActionListener(evt1 -> pressButtonDot());
        ifc.getButtonZero().addActionListener(evt1 -> pressButtonZ());
        ifc.getButtonEquel().addActionListener(evt -> pressButtonCalculate());

    }

    public void math() {
        System.out.println(ifc.getButtonText().getText());
        if (c == 1) {
            y = CalculatorFunction.addition(x, ifc);
        }
        if (c == 2) {
                y = CalculatorFunction.subtraction(x, ifc);
            }
                if (c == 3) {
                    y = CalculatorFunction.multiplication(x, ifc);
                }
                    if (c == 4) {
                        y = y = CalculatorFunction.division(x, ifc);
                    }


        System.out.println("=");
        System.out.println(y);

    }

    protected void uTF(javax.swing.JButton button) {
        ifc.getButtonText().setText(ifc.getButtonText().getText() + button.getText());
        on();
    }

    public void enable() {
        ifc.getButtonText().setEnabled(true);
        ifc.getButtonBack().setEnabled(true);
        ifc.getButtonClear().setEnabled(true);
        ifc.getButtonPlus().setEnabled(true);
        ifc.getButtonSeven().setEnabled(true);
        ifc.getButtonEight().setEnabled(true);
        ifc.getButtonNine().setEnabled(true);
        ifc.getButtonFour().setEnabled(true);
        ifc.getButtonFive().setEnabled(true);
        ifc.getButtonSix().setEnabled(true);
        ifc.getButtonOne().setEnabled(true);
        ifc.getButtonTwo().setEnabled(true);
        ifc.getButtonThree().setEnabled(true);
        ifc.getButtonMinus().setEnabled(true);
        ifc.getButtonMultiply().setEnabled(true);
        ifc.getButtonDivide().setEnabled(true);
        ifc.getButtonDot().setEnabled(true);
        ifc.getButtonZero().setEnabled(true);
        ifc.getButtonEquel().setEnabled(true);
        ifc.getButtonRb1().setEnabled(false);
        ifc.getButtonRb2().setEnabled(true);
    }

    public void disable() {
        ifc.getButtonText().setEnabled(false);
        ifc.getButtonBack().setEnabled(false);
        ifc.getButtonClear().setEnabled(false);
        ifc.getButtonPlus().setEnabled(false);
        ifc.getButtonSeven().setEnabled(false);
        ifc.getButtonEight().setEnabled(false);
        ifc.getButtonNine().setEnabled(false);
        ifc.getButtonFour().setEnabled(false);
        ifc.getButtonFive().setEnabled(false);
        ifc.getButtonSix().setEnabled(false);
        ifc.getButtonOne().setEnabled(false);
        ifc.getButtonTwo().setEnabled(false);
        ifc.getButtonThree().setEnabled(false);
        ifc.getButtonMinus().setEnabled(false);
        ifc.getButtonMultiply().setEnabled(false);
        ifc.getButtonDivide().setEnabled(false);
        ifc.getButtonDot().setEnabled(false);
        ifc.getButtonZero().setEnabled(false);
        ifc.getButtonEquel().setEnabled(false);
        ifc.getButtonRb1().setEnabled(true);
        ifc.getButtonRb2().setEnabled(false);
    }

    public void off() {
        ifc.getButtonBack().setEnabled(false);
        ifc.getButtonPlus().setEnabled(false);
        ifc.getButtonMinus().setEnabled(false);
        ifc.getButtonMultiply().setEnabled(false);
        ifc.getButtonDivide().setEnabled(false);
        ifc.getButtonDot().setEnabled(false);
        ifc.getButtonEquel().setEnabled(false);
    }

    public void on() {
        ifc.getButtonBack().setEnabled(true);
        ifc.getButtonPlus().setEnabled(true);
        ifc.getButtonMinus().setEnabled(true);
        ifc.getButtonMultiply().setEnabled(true);
        ifc.getButtonDivide().setEnabled(true);
        ifc.getButtonDot().setEnabled(true);
        ifc.getButtonEquel().setEnabled(true);
    }

    protected void pressButtonMultiply() {
        if (Double.parseDouble(ifc.getButtonText().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText("Multiplication By Zero");
            off();
            clear = true;
        }
            if (!clear) {
                math();
            }
            System.out.println(ifc.getButtonText().getText());
            System.out.println("*");
            clear = false;
            x = Double.parseDouble(ifc.getButtonText().getText());
            c = 3;
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText(x + "*");
        }


    protected void pressButtonOne() {
        uTF(ifc.getButtonOne());
    }

    protected void pressButtonTwo() {
        System.out.println((x+99));
        uTF(ifc.getButtonTwo());
    }

    protected void pressButtonThree() {
        uTF(ifc.getButtonThree());
    }

    protected void pressButtonFour() {
        uTF(ifc.getButtonFour());
    }

    protected void pressButtonFive() {
        uTF(ifc.getButtonFive());
    }

    protected void pressButtonSix() {
        uTF(ifc.getButtonSix());
    }

    protected void pressButtonSeven() {
        uTF(ifc.getButtonSeven());
    }

    protected void pressButtonEight() {
        uTF(ifc.getButtonEight());
    }

    protected void pressButtonNine() {
        uTF(ifc.getButtonNine());
    }

    protected void pressButtonZ() {
        uTF(ifc.getButtonZero());
    }

    protected void pressButtonPlus() {

        if (!clear) {
            math();
        }
        System.out.println(ifc.getButtonText().getText());
        System.out.println("+");
        clear = false;
        x = Double.parseDouble(ifc.getButtonText().getText());
        c = 1;
        ifc.getButtonText().setText("");
        ifc.getButtonLabel().setText(x + "+");
    }

    protected void pressButtonMinus() {
        if (!clear) {
            math();
        }
        System.out.println(ifc.getButtonText().getText());
        System.out.println("-");
        clear = false;
        x = Double.parseDouble(ifc.getButtonText().getText());
        c = 2;
        ifc.getButtonText().setText("");
        ifc.getButtonLabel().setText(x + "-");
    }

    protected void pressButtonDiv() {
        if (Double.parseDouble(ifc.getButtonText().getText()) == 0.0) {
            System.out.println("Division By Zero");
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText("Division By Zero");
            off();
            clear = true;
        }
            if (!clear) {
                math();
            }
            System.out.println(ifc.getButtonText().getText());
            System.out.println("/");
            clear = false;
            x = Double.parseDouble(ifc.getButtonText().getText());
            c = 4;
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText(x + "/");

        }



    protected void pressButtonDot() {
        uTF(ifc.getButtonDot());
    }

    protected void pressButtonClear() {
        ifc.getButtonText().setText("");
        off();
    }

    protected void pressButtonSetOn() {
        enable();
    }

    protected void pressButtonOnPower() {
        disable();
    }

    protected void pressButtonBack() {
        int length = ifc.getButtonText().getText().length();
        int number = ifc.getButtonText().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(ifc.getButtonText().getText());
            back.deleteCharAt(number);
            store = back.toString();
            ifc.getButtonText().setText(store);
        }
        if (ifc.getButtonText().getText().length() <= 0) {
            off();
        }
    }

    protected void pressButtonCalculate() {
        math();
        clear = true;
        ifc.getButtonLabel().setText("");
    }
}
