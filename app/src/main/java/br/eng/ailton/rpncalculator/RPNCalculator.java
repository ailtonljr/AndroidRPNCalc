package br.eng.ailton.rpncalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPNCalculator extends ActionBarActivity {

    private CalculatorInterface calculatorModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpncalculator);

        calculatorModel = new RPNCalculatorModel();

        UpdateDisplay();
    }

    private void UpdateDisplay() {
        TextView display = (TextView) findViewById(R.id.textView);
        display.setText(calculatorModel.getDisplay());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rpncalculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickNumbers(View view){

        Button button = (Button)view;

        calculatorModel.NumberPressed(button.getText().toString());

        UpdateDisplay();

    }

    public void onClickOperation(View view){
        Button button = (Button)view;

        calculatorModel.OperationPressed(button.getText().toString());

        UpdateDisplay();
    }
}
