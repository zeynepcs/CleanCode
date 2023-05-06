package kjellgren.linus.cleancodeprojekt;

import java.awt.*;

import static java.awt.Font.BOLD;

public class JFrame extends javax.swing.JFrame {

    private final IFrameComponents ifc;

    public JFrame() {
        ifc = new IFrameComponents();
        initComponents();
        Press ac = new Press(ifc);
        ac.connectButton();
        ifc.getButtonRb1().setEnabled(false);
    }
    
    

//<editor-fold defaultstate="collapsed" desc="initComponents()">
    protected void initComponents() {
        /* 
            This is Auto-Generated code from a netbeans 
            JFrame Form that I, Linus has then changed names in
            and moved some code elsewhere.
        */
        ifc.setButtonBg1(new javax.swing.ButtonGroup());
        ifc.setButtonText(new javax.swing.JTextField());
        ifc.setButtonRb1(new javax.swing.JRadioButton());
        ifc.setButtonRb2(new javax.swing.JRadioButton());
        ifc.setButtonBack(new javax.swing.JButton());
        ifc.setButtonClear(new javax.swing.JButton());
        ifc.setButtonPlus(new javax.swing.JButton());
        ifc.setButtonSeven(new javax.swing.JButton());
        ifc.setButtonEight(new javax.swing.JButton());
        ifc.setButtonNine(new javax.swing.JButton());
        ifc.setButtonFour(new javax.swing.JButton());
        ifc.setButtonFive(new javax.swing.JButton());
        ifc.setButtonSix(new javax.swing.JButton());
        ifc.setButtonOne(new javax.swing.JButton());
        ifc.setButtonTwo(new javax.swing.JButton());
        ifc.setButtonThree(new javax.swing.JButton());
        ifc.setButtonMinus(new javax.swing.JButton());
        ifc.setButtonMultiply(new javax.swing.JButton());
        ifc.setButtonDivide(new javax.swing.JButton());
        ifc.setButtonDot(new javax.swing.JButton());
        ifc.setButtonZero(new javax.swing.JButton());
        ifc.setButtonEquel(new javax.swing.JButton());
        ifc.setButtonLabel(new javax.swing.JLabel());
        
        //Set program to end on closing window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Sets iframe above everything
        setAlwaysOnTop(true);
        //Sets name on window
        setTitle("projektJframe");
        setLocation(new java.awt.Point(500, 250));
        //Sets window to not resizeable
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        //Sets numbers test frame to not editable
        ifc.getButtonText().setEditable(false);
        //Set Font
        ifc.getButtonText().setFont(new java.awt.Font("Tahoma", BOLD, 23)); // NOI18N
        ifc.getButtonText().setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ifc.getButtonBg1().add(ifc.getButtonRb1());
        //Set Font
        ifc.getButtonRb1().setFont(new java.awt.Font("Tahoma", BOLD, 11)); // NOI18N
        ifc.getButtonRb1().setText("On");

        ifc.getButtonBg1().add(ifc.getButtonRb2());
        //Set Font
        ifc.getButtonRb2().setFont(new java.awt.Font("Tahoma", BOLD, 11)); // NOI18N
        ifc.getButtonRb2().setText("Off");

        //Set Font
        ifc.getButtonBack().setFont(new java.awt.Font("Tahoma", BOLD, 14)); // NOI18N
        ifc.getButtonBack().setText("<--");

        //Set Font
        ifc.getButtonClear().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonClear().setText("C");

        //Set Font
        ifc.getButtonPlus().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonPlus().setText("+");

        //Set Font
        ifc.getButtonSeven().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonSeven().setText("7");

        //Set Font
        ifc.getButtonEight().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonEight().setText("8");

        //Set Font
        ifc.getButtonNine().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonNine().setText("9");

        //Set Font
        ifc.getButtonFour().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonFour().setText("4");

        //Set Font
        ifc.getButtonFive().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonFive().setText("5");

        //Set Font
        ifc.getButtonSix().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonSix().setText("6");

        //Set Font
        ifc.getButtonOne().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonOne().setText("1");

        //Set Font
        ifc.getButtonTwo().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonTwo().setText("2");

        //Set Font
        ifc.getButtonThree().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonThree().setText("3");

        //Set Font
        ifc.getButtonMinus().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonMinus().setText("-");

        //Set Font
        ifc.getButtonMultiply().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonMultiply().setText("*");

        //Set Font
        ifc.getButtonDivide().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonDivide().setText("/");

        //Set Font
        ifc.getButtonDot().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonDot().setText(".");

        //Set Font
        ifc.getButtonZero().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonZero().setText("0");

        //Set Font
        ifc.getButtonEquel().setFont(new java.awt.Font("Tahoma", BOLD, 20)); // NOI18N
        ifc.getButtonEquel().setText("=");

        //Set Font
        ifc.getButtonLabel().setFont(new java.awt.Font("Tahoma", Font.PLAIN, 11)); // NOI18N
        //Set Font Color
        ifc.getButtonLabel().setForeground(new java.awt.Color(255, 68, 51));
        ifc.getButtonLabel().setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        // Set Empty text
        ifc.getButtonLabel().setText(" ");

        
        //This sets upp the layout for the JFrame. Its autogenerated in the JFrame Form.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getButtonText())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getButtonRb1())
                                                                .addComponent(ifc.getButtonRb2()))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getButtonBack(), javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ifc.getButtonClear(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getButtonPlus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(ifc.getButtonDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getButtonZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ifc.getButtonEquel(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getButtonSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getButtonFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(ifc.getButtonOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(ifc.getButtonThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ifc.getButtonMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getButtonMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ifc.getButtonDivide(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getButtonLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ifc.getButtonLabel())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ifc.getButtonText(), javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getButtonRb1())
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getButtonRb2()))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ifc.getButtonClear(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getButtonPlus(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ifc.getButtonBack(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getButtonSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getButtonEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getButtonNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ifc.getButtonFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getButtonFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ifc.getButtonSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ifc.getButtonMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ifc.getButtonMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ifc.getButtonOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getButtonTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ifc.getButtonThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ifc.getButtonDivide(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ifc.getButtonDot(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getButtonZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ifc.getButtonEquel(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }
//</editor-fold>

}
