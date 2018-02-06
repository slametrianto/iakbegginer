package com.example.rianto.smk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnmcdonald = (Button) findViewById(R.id.btnMcDonal);
        Button btnkfc = (Button) findViewById(R.id.btnKFC);
        Button btnjadwalsht = (Button) findViewById(R.id.btnJadwalSholat);
        Button btngoogle = (Button) findViewById(R.id.btnGoogleMaps);
        Button btnCgv = (Button) findViewById(R.id.btnCgv);


        btnmcdonald.setOnClickListener(new Button.OnClickListener() {


            @Override
            public void onClick(View v) {

                CallIntent(v);
            }

        });


        btnkfc.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                CallIntent(v);
            }

        });


        btnjadwalsht.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                CallIntent(v);
            }

        });


        btnjadwalsht.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallIntent(v);
            }
        });

        btngoogle.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallIntent(v);
            }
        });

        btnCgv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallIntent(v);
            }
        });
    }


    public void CallIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {


            case R.id.btnMcDonal:
                //akan melakukan call ke nomer mcdonal
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:14045"));
                startActivity(intent);
                break;


            case R.id.btnKFC:
                //akan melakukan call ke nomer kfc
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:14022"));
                startActivity(intent);
                break;

            case R.id.btnJadwalSholat:
                //akan melakukan pemanggilan browser dan menampilkan website jdwl solat
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jadwalsholat.org/"));
                startActivity(intent);
                break;

            case R.id.btnGoogleMaps:
                //akan melakukan pemanggilan browser dan menampilkan google maps
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps"));
                startActivity(intent);
                break;

            case R.id.btnCgv:
                //akan melakukan pemanggilan browser dan menampilkan google maps
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cgv.id/"));
                startActivity(intent);
                break;

            default:
                break;

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == Activity.RESULT_OK && requestCode == 0 ){
            String result = data.toURI();

            Toast.makeText(this,result , Toast.LENGTH_SHORT).show();
        }
    }
}

