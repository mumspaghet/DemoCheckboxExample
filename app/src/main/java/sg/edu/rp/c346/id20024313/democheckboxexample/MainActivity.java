package sg.edu.rp.c346.id20024313.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox checkBoxDiscount;
Button checkButton;
TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxDiscount = findViewById(R.id.checkBoxDiscount);
        checkButton = findViewById(R.id.buttonCheck);
        TextView= findViewById(R.id.Textview);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity","Inside onClick()");
                if(checkBoxDiscount.isChecked()){
                    double pay= calcPay(100,20);
                    TextView.setText("Discount given, pay "+pay);
                }
                else{
                    double pay= calcPay(100,0);
                    TextView.setText("No discount, pay "+pay);
                }
                Toast.makeText(MainActivity.this,
                        "Are you happy?", Toast.LENGTH_LONG).show();
            }
        });
    }
    private double calcPay(double price, double discount){
        double pay=price*(1-discount/100);
        return pay;
}
}