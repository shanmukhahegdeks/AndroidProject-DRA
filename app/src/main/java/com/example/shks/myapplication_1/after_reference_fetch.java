package com.example.shks.myapplication_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by shks on 06/09/15.
 */
public class after_reference_fetch extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_reference_fetch);

        TextView refLog = (TextView) findViewById(R.id.refSubmitDisplay) ;
      //  String friendName = getIntent().getStringExtra("friendName");
      //  boolean friendIsMr = getIntent().getBooleanExtra("friendIsMr", true);
      //  String loanInterested = getIntent().getStringExtra("loanInterested") ;

        Bundle  basketFromRefForm = getIntent().getExtras();
        String  friendName        = basketFromRefForm.getString("friendName");
        boolean friendIsMr        = basketFromRefForm.getBoolean("friendIsMr");
        String  loanInterested    = basketFromRefForm.getString("loanInterested");


        if (true == friendIsMr) {
            refLog.setText("Reference submitted successfully for Mr." + friendName + " who is interested in "+loanInterested+"");
        } else {
            refLog.setText("Reference submitted successfully for Mrs." + friendName +" who is interested in "+loanInterested+"");
        }


    }

}
