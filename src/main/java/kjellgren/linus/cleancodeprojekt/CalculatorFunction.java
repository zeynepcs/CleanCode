package kjellgren.linus.cleancodeprojekt;

public class CalculatorFunction {
    
    public static double addition(double num, IFrameComponents ifc){
        double ans = Double.sum(num, Double.parseDouble(ifc.getButtonText().getText()));
        ifc.getButtonText().setText(Double.toString(ans));
        return ans;
    }
    public static double subtraction(double num, IFrameComponents ifc){
        double ans = num - Double.parseDouble(ifc.getButtonText().getText());
        ifc.getButtonText().setText(Double.toString(ans));
        return ans;
    }
    public static double multiplication(Double num, IFrameComponents ifc){
        Double inDouble = Double.parseDouble(ifc.getButtonText().getText());
        if (inDouble==0){
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText("Multiplication by Zero");
            return 0.0;
        }
        double ans = num * inDouble;
        ifc.getButtonText().setText(Double.toString(ans));
        return ans;
    }
    public static double division(double num, IFrameComponents ifc){
        double inDouble = Double.parseDouble(ifc.getButtonText().getText());
        if (inDouble==0){
            ifc.getButtonText().setText("");
            ifc.getButtonLabel().setText("Division by Zero");
            return 0.0;
        }
        double ans = num / inDouble;
        ifc.getButtonText().setText(Double.toString(ans));
        return ans;
    }
    
}
