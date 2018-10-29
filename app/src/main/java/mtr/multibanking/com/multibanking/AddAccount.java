package mtr.multibanking.com.multibanking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddAccount extends AppCompatActivity {

    private InputValidation inputValidation;
    EditText accnumber;
    EditText accholder;
    EditText customerid;
    EditText pass;
    EditText adhar;
    EditText cpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_account);
        getSupportActionBar().setTitle("New Account");

        CardView submit = (CardView) findViewById(R.id.detailsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    AddAccount.super.onBackPressed();
            }
        });

    }
}
