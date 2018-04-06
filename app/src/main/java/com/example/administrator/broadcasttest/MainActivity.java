package com.example.administrator.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private Button loginButton;
    private EditText account_edit,password_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        account_edit = findViewById(R.id.account_edit);
        password_edit = findViewById(R.id.key_edit);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String account = account_edit.getText().toString();
               String pass = password_edit.getText().toString();

                if(account.equals("admin") && pass.equals("123")){
                   SecondActivity.addAction(MainActivity.this);
                      finish();
                }else {

                    Toast.makeText(MainActivity.this,"Input Error.Please input again",Toast.LENGTH_SHORT).show();
                    password_edit.setText("");
                }

            }
        });

    }

}
