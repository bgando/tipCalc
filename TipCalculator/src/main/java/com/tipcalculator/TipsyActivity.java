package com.tipcalculator;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tipcalculator.R;
import com.tipcalculator.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class TipsyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsy);
    }

    public void calculatePercent(View v){
    	Button clickedButton = (Button) v;
    	String percentageString = (String) clickedButton.getTag();
    	double percentage = Double.parseDouble(percentageString);

        EditText textBoxView = (EditText) findViewById(R.id.enterTotal);
        String stringTotal = textBoxView.getText().toString();
        double total = Double.parseDouble(stringTotal);

        double tip = (total * percentage);

        showTip(tip);
        
        textBoxView.setText("");

    }
  
    public void showTip(double num){
        TextView tipView = (TextView) findViewById(R.id.tipView);
        String numberString = String.format(Locale.getDefault(), "%.2f", num);
        tipView.setText("$" + numberString);
    }
}
