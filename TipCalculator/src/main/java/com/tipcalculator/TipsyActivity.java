package com.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

    public void calculateFifteenPercent(View v){
        EditText textBoxView = (EditText) findViewById(R.id.enterTotal);
        String stringTotal = textBoxView.getText().toString();
        int total = Integer.parseInt(stringTotal);

        double tip = (total * .15);

        showTip(tip);

    }

    public void showTip(double num){
        TextView tipView = (TextView) findViewById(R.id.tipView);
        String numberString = String.format("%.2f", num);
        tipView.setText("$" + numberString);
    }
}
