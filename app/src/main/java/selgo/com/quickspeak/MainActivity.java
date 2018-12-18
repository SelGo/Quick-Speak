package selgo.com.quickspeak;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static int DURATION_TIME = 1200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
           @Override
           public void run() {
               Intent intent = new Intent(MainActivity.this, TopLevelActivity.class);
               startActivity(intent);
               finish();
           }
        }, DURATION_TIME);

    }
}
