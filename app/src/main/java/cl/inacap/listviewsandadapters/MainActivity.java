package cl.inacap.listviewsandadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import cl.inacap.listviewsandadapters.models.Contacto;


public class MainActivity extends AppCompatActivity {
    private ListView listContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContacto = (ListView) findViewById(R.id.listContacto);

        /* Creación del adaptador de arreglo a contenido de listview */
        ArrayAdapter<Contacto> adapter = new ArrayAdapter<Contacto>(
                this, // Contexto
                android.R.layout.simple_list_item_1, // Recurso
                Contacto.contactos // Atributo estático, no hay necesidad de instanciar primero
        );

        listContacto.setAdapter(adapter);

        listContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), Contacto.contactos[position].getEmail(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
