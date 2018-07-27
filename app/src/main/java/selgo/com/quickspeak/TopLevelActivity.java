package selgo.com.quickspeak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        TextView english = (TextView) findViewById(R.id.english_name);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(TopLevelActivity.this, EnglishCategory.class);
                startActivity(englishIntent);
            }
        });

        ImageView englishFlag = (ImageView) findViewById(R.id.english_image);
        englishFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(TopLevelActivity.this, EnglishCategory.class);
                startActivity(englishIntent);
            }
        });

    }
}
