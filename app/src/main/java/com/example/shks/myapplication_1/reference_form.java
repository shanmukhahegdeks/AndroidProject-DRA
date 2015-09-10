package com.example.shks.myapplication_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by shks on 06/09/15.
 */
public class reference_form extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reference_form);

    }
    public void refFormData (View view) {

        Intent refDataIntent = new Intent(this,after_reference_fetch.class) ;
        TextView friendNameField = (TextView) findViewById(R.id.refNameText);
        RadioButton friendIsMr   = (RadioButton) findViewById(R.id.radioButtonMr) ;
        RadioButton friendIsMrs  = (RadioButton) findViewById(R.id.radioButtonMrs);

        Spinner selectedLoantype   = (Spinner) findViewById(R.id.loanOptions) ;


     // String friendName = (String) friendNameField.getText().toString() ;
     // refDataIntent.putExtra("friendName",friendName) ;
     // refDataIntent.putExtra("friendIsMr", friendIsMr.isChecked()) ;
     // refDataIntent.putExtra("loanInterested", selectedLoantype.getSelectedItem().toString()) ;

        Bundle refFormDataBasket = new Bundle() ;
        refFormDataBasket.putString("friendName",friendNameField.getText().toString());
        refFormDataBasket.putBoolean("friendIsMr", friendIsMr.isChecked());
        refFormDataBasket.putString("loanInterested", selectedLoantype.getSelectedItem().toString());
        refDataIntent.putExtras(refFormDataBasket);
        startActivity(refDataIntent);
    }

    public void clearNameField (View view) {

        TextView clearName  = (TextView) findViewById(R.id.refNameText) ;
        TextView nameField  = (TextView) findViewById(R.id.refName);

        TextView clearPhone = (TextView) findViewById(R.id.refPhoneText);
        TextView phoneField = (TextView) findViewById(R.id.refPhone);

        RadioButton radioButtonMr = (RadioButton) findViewById(R.id.radioButtonMr) ;
        RadioButton radioButtonMrs = (RadioButton) findViewById(R.id.radioButtonMrs) ;



        switch (view.getId()) {
            case R.id.refNameText:
                clearName.setText("");
                break;
            case R.id.refPhoneText:
                clearPhone.setText("");
                break;
            case R.id.radioButtonMr:
                radioButtonMr.setChecked(true);
                radioButtonMrs.setChecked(false);
                break;
            case R.id.radioButtonMrs:
                radioButtonMr.setChecked(false);
                radioButtonMrs.setChecked(true);


        }


    }
}
