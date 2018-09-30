package xyz.geekbrains.lessonone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view_hello_world);
        button = findViewById(R.id.change_color_button);

        Random random = new Random();

        final int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (textView.getCurrentTextColor() == getResources().getColor(R.color.colorBlue)) {
//                    textView.setTextColor(getResources().getColor(R.color.colorRed));
//
//                }
//                else{
//                    textView.setTextColor(getResources().getColor(R.color.colorBlue));
//                }

                textView.setTextColor(color); //цвет меняется 1 раз, хз как сделать что бы он менялся постоянно. в массив засовывать предустановленые цвета не хочу - тогда они вроде как не совсем рандомные\\

            }
        });
    }
}
