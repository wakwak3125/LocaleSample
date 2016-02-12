package com.wakwak.localesample;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.LocaleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView mTextView;
    private Resources mResources;
    private Configuration mConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        mTextView = (TextView)findViewById(R.id.app_name);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        mResources = getResources();
        mConfiguration = mResources.getConfiguration();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mConfiguration.setLocale(Locale.JAPANESE);
                mResources.updateConfiguration(mConfiguration, null);
                mTextView.setText(R.string.app_name);
                break;
            case R.id.button2:

                
                mResources.updateConfiguration(mConfiguration, null);
                mTextView.setText(R.string.app_name);
                break;
        }

    }
}
