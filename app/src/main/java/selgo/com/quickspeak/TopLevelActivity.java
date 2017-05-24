package selgo.com.quickspeak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        TextView english = (TextView) findViewById(R.id.english_name);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(TopLevelActivity.this, EnglishWordsCategories.class);
                startActivity(englishIntent);
            }
        });
    }
}
