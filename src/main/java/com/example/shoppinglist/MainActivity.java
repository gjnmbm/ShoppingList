package com.example.shoppinglist;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//Learn how Git works so you're not afraid of messing something up and bricking the code
    EditText item;
    TextView testText;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item = findViewById(R.id.itemToList);
        testText = findViewById(R.id.testText);
        linearLayout = findViewById(R.id.linearLayout);
    }

    public void addItem(View view) {
        CheckBox checkBox = new CheckBox(this);
        if (item.getText() == null || item.getText().equals("")) {
            //TODO: Fix the no input issue. Items are still being added even when there is nothing
            //This is good for testing, but pretty pointless after the fact
            testText.setText("Don't add null items");
        }
        else {
            checkBox.setText(item.getText());
            /*Layout is fine, but if there are too many objects on the
            screen, I cannot scroll through the layout to see the rest of the list.
             */
            checkBox.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
        }
        linearLayout.addView(checkBox);
    }

}
