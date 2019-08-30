package firstappvm.example.com.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.*;
import java.util.*;


public class MainActivity extends AppCompatActivity {

    EditText nome, sobrenome;
    Button btOK;
    TextView resultado;
    Button btCancelar;
    TextView saida;

    public static void exit (int status){
        System.exit(0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Ligando as variaveis locais aos componentes da view //

        nome = findViewById(R.id.editTextNome);
        sobrenome = findViewById(R.id.editTextSobrenome);
        resultado = findViewById(R.id.textViewSaida);
        btOK = findViewById(R.id.buttonOk);
        btCancelar = findViewById(R.id.buttonCancelar) ;

        // criando - setando click listener na View //

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNome, txtSobrenome;
                txtNome = nome.getText().toString();
                txtSobrenome = sobrenome.getText().toString();


                resultado.setText(txtNome + " " + txtSobrenome);

            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            exit(0);
            }
        });


    }


}

