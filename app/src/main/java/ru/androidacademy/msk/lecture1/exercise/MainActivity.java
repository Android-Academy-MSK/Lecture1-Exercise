package ru.androidacademy.msk.lecture1.exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final EditText messageEdit = findViewById(R.id.edit_message);
    final Button previewBtn = findViewById(R.id.btn_preview);
    previewBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        openPreviewActivity(messageEdit.getText().toString());
      }
    });
  }

  private void openPreviewActivity(String text) {
    PreviewActivity.start(this, text);
  }
}
