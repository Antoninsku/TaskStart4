package fi.antonina.taskstart4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        Intent intent1 = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message3 = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello " + message + ", you are " + message3 + " year old.");

    }
}