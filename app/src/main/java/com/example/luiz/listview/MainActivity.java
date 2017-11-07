package com.example.luiz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItems;
    private String[] items={"Salvador","Rio de janeiro","São Paulo","Rio grande do sul","Macapá","Lauro de freitas","Cancún","Dubai","Irlanda","Grécia","Santiago","Grécia","Egito","França","Inglaterra","México","Estados Unidos","Croacia","Dinamarca"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItems = (ListView)findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.activity_list_item,android.R.id.text1,items);

        listaItems.setAdapter(adaptador);

        listaItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = listaItems.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(),valorClicado, Toast.LENGTH_SHORT).show();
            }
        });





    }
}
