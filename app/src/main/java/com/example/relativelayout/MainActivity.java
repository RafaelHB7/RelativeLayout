package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Eu assumo que não precisa fazer a implementação de nada nessa
    //atividade, então as atividades então nos arquivos "activity_main.xml"
    //e "imc.xml" na pasta layout do projeto
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}