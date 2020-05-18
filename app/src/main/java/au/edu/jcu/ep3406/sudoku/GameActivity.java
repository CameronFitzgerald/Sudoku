package au.edu.jcu.ep3406.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private String difficulty;
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gridView = findViewById(R.id.game_grid);
        gridView.setAdapter(new TextAdapter(this));
        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            difficulty = extras.getString("difficulty");
        }
        TextView textView = findViewById(R.id.textView2);
        textView.setText(difficulty);
    }
}
