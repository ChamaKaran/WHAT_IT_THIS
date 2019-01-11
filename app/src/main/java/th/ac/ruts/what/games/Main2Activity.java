package th.ac.ruts.what.games;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtShowScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtShowScore = (TextView)findViewById(R.id.score);
        txtShowScore.setText(String.valueOf(getIntent().getExtras().getInt("Score")));
    }
    public void clickPlayAgain(View view){
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void ClickExit(View view){
        finish();
    }
}

