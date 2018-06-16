package com.blanksoft.olympiadw0rkkkk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageClick extends AppCompatActivity {
 ImageView Ivzoom = (ImageView)findViewById(R.id.Ivzoom);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Uri imageUri = intent.getParcelableExtra("uri");

    }







    }


