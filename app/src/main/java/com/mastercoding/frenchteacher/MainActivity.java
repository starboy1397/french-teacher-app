package com.mastercoding.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mastercoding.frenchteacher.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View

        .OnClickListener {

    private ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        viewBinding.blackBtn.setOnClickListener(this);
        viewBinding.greenBtn.setOnClickListener(this);
        viewBinding.purpleBtn.setOnClickListener(this);
        viewBinding.redBtn.setOnClickListener(this);
        viewBinding.yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.blackBtn){
            playSounds(R.raw.black);
        }else if (clickedBtnId == R.id.greenBtn){
            playSounds(R.raw.green);
        }else if (clickedBtnId == R.id.purpleBtn){
            playSounds(R.raw.purple);
        }else if (clickedBtnId == R.id.redBtn){
            playSounds(R.raw.red);
        }else if (clickedBtnId == R.id.yellowBtn){
            playSounds(R.raw.yellow);
        }

    }

    public void playSounds(int id){
        MediaPlayer mp = MediaPlayer.create(this, id);
        mp.start();
    }
}