package br.com.rafaelfioretti.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void validar(View v){

        String usuario = ((EditText) findViewById(R.id.edtUsuario)).getText().toString();
        String senha = ((EditText) findViewById(R.id.edtSenha)).getText().toString();

        if (usuario.equalsIgnoreCase("rafael") && senha.equalsIgnoreCase("rafael")){
            startActivity(new Intent(this, ExercicioActivity.class));

        }else
        {
            startActivity(new Intent(this, HadukenActivity.class));

        }

    }
}
