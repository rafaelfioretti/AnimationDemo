package br.com.rafaelfioretti.animationdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ExercicioActivity extends AppCompatActivity {

    ImageView ivImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio);
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ivImagem = (ImageView) findViewById(R.id.ivImagem);
        ivImagem.startAnimation(animation);

    }


    public void logar(View v){

        startActivity(new Intent(this, LoginActivity.class));

    }
}
