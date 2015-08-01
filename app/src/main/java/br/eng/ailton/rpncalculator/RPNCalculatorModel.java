package br.eng.ailton.rpncalculator;

import java.util.Stack;

/**
 * Created by ailtonljr on 01/08/15.
 */
public class RPNCalculatorModel implements CalculatorInterface {

    private Stack<Integer> pilha = new Stack<>();

    private String display = "0";

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void NumberPressed(String num) {
        display = display + num;
        int numDisplay = Integer.parseInt(display);

        display = "" + numDisplay;


    }

    @Override
    public void OperationPressed(String op) {

        if(op.equals("="))
        {
            int numDisplay = Integer.parseInt(display);
            pilha.push(numDisplay);

            display = "0";
        }
        else if(op.equals("+")){
            int num1 = pilha.pop();
            int num2 = pilha.pop();
            int res = num1 + num2;

            pilha.push(res);
            display = "" + res;
        }
        else if(op.equals("*")){
            int num1 = pilha.pop();
            int num2 = pilha.pop();
            int res = num1 * num2;

            pilha.push(res);
            display = "" + res;
        }
        else if(op.equals("C")){
            display = "0";
            pilha.clear();
        }

    }
}
