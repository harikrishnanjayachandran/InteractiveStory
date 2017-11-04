  package com.example.user.interactivestory.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.interactivestory.R;
import com.example.user.interactivestory.ui.StoryActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;
String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = (EditText) findViewById(R.id.nameEditText);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 name = nameField.getText().toString();
            startStory();            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        nameField.setText("");
    }

    private void startStory()
{
  Intent intent=new Intent(this,StoryActivity.class);
    Resources resources=getResources();
    String key=resources.getString(R.string.Key_name);

     intent.putExtra(key,name);
       startActivity(intent);
}

}
