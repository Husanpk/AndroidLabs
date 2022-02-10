package com.cst2335.kaur0714;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.service.autofill.VisibilitySetterAction;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
    }
    public void display_Toast(View v){

        Toast.makeText(MainActivity.this,getString(R.string.toast_message)  , Toast.LENGTH_SHORT).show();
    }



    public void display_snack (View v) {

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch toggle = (Switch) findViewById(R.id.sw);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Snackbar snack;
                if (isChecked) {
                    snack = Snackbar.make(toggle, getString(R.string.snackbar_message), Snackbar.LENGTH_LONG);

                } else {
                    snack = Snackbar.make(toggle, getString(R.string.snackbar_message), Snackbar.LENGTH_LONG);

                }
                snack.setAction(getString(R.string.snackbar_button), click -> compoundButton.setChecked(false));
                snack.show();

            }
        })
        ;}}




