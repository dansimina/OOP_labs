import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theMode;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theMode = theModel;
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber = 0, secondNumber = 0;
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theMode.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theMode.getCalculationValue());
            }
            catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}
