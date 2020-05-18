package au.edu.jcu.ep3406.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
    }
    public void playClicked(View view){
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("difficulty",spinner.getSelectedItem().toString());
        startActivity(intent);
    }
    public void settingsClicked(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        //should probably be start activity for result to get the settings that have changed or possibly not and just make sure everything sticks when you change them in the settings
        startActivity(intent);
    }
    public void highScoreClicked(View view){
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);
    }
}
