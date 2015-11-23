package com.udacity.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String MSG = "This button will launch my ";

    Button spotifyStreamerBtn, scoresAppBtn, libraryAppBtn, buildItBiggerBtn, xyzReaderBtn,
    capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button [] buttons = {
                spotifyStreamerBtn = (Button) findViewById(R.id.spotify_sreamer_btn),
        scoresAppBtn = (Button) findViewById(R.id.scores_app_btn),
        libraryAppBtn = (Button) findViewById(R.id.library_app_btn),
        buildItBiggerBtn = (Button) findViewById(R.id.buid_it_bigger_btn),
        xyzReaderBtn = (Button) findViewById(R.id.xyz_reader_btn),
        capstoneBtn = (Button) findViewById(R.id.capstone_my_own_app_btn)
        };

        for(int i = 0; i < buttons.length; i++){
            buttons[i].setOnClickListener(this);
        }



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify_sreamer_btn:
                displayApp("Spotify Streamer App");
                break;
            case R.id.scores_app_btn:
                displayApp("Scores App");
                break;
            case R.id.library_app_btn:
                displayApp("Library App");
                break;
            case R.id.buid_it_bigger_btn:
                displayApp("Build it Bigger App");
                break;
            case R.id.xyz_reader_btn:
                displayApp("XYZ Reader App");
                break;
            case R.id.capstone_my_own_app_btn:
                displayApp("Capstone app");
                break;
            default:
                Toast.makeText(getApplication(), "Something goes wrong man!",
                        Toast.LENGTH_LONG);

        }
    }

    private void displayApp(String nameOfApp){
        Toast.makeText(getApplication(), MSG + nameOfApp, Toast.LENGTH_SHORT)
                .show();
    }
}
