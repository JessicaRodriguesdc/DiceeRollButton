package br.edu.uni.si.diceerollbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roolButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rigthDice);

        final int [] diceeArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        roolButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Log.d("Dice","Entrou no clique do botão!");

                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6);
                leftDice.setImageResource(diceeArray[number]);
                int number1 = numberRandom.nextInt(6);
                rightDice.setImageResource(diceeArray[number1]);

                //Toast.makeText(MainActivity.this, "msg", Toast.LENGTH_SHORT).show();
            }
        });
    }
}