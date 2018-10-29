package mtr.multibanking.com.multibanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TransactionReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_report);
        getSupportActionBar().setTitle("Transaction");
    }
}
