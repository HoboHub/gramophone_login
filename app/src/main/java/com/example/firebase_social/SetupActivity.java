package com.example.firebase_social;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class SetupActivity extends AppCompatActivity {

    private EditText UserName, FullName, CountryNamee;
    private Button SaveInformation;
    private CircleImageView ProfileImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);


        UserName = (EditText) findViewById(R.id.setup_username);
        FullName = (EditText) findViewById(R.id.setup_full_name);
        CountryNamee = (EditText) findViewById(R.id.setup_country_name);
        SaveInformation = (Button) findViewById(R.id.setup_info_button);
        ProfileImage = (CircleImageView) findViewById(R.id.setup_profile_image);


    }
}
