package com.cst2335.kaur0714;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.VisibilitySetterAction;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Here is more information", Toast.LENGTH_LONG).show();
                getResources().getString(R.string.toast_message);
            }
        });

        Switch switch_button = (Switch) findViewById(R.id.switch1);

        // Set a checked change listener for switch button
        switch_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean b) {
                if (b = true) {
                    // If the switch button is on
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.switch1), "The switch is now", Snackbar.LENGTH_LONG);
                    boolean finalB = b;
                    snackbar.setAction("off", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Show the switch button checked status as toast message

                            snackbar.setAction( "Undo",click -> cb.setChecked(!finalB));
                        }

                    });


                } else if (b=false){
                    // If the switch button is off
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.switch1), "The switch is now", Snackbar.LENGTH_LONG);
                    boolean finalB1 = b;
                    snackbar.setAction("on", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Show the switch button checked status as toast message

                            snackbar.setAction( "Undo",click -> cb.setChecked(!finalB1));
                        }

                    });

                }

            }
        });
    }
}


