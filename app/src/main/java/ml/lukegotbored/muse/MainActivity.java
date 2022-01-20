package ml.lukegotbored.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText txtInserisci;
    GestoreBrani gb;
    Spinner spnGeneri;
    ArrayAdapter<String> aaG;

    String[] generi= {"Pop", "Trap", "Rock", "Jazz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        txtInserisci = (EditText)findViewById(R.id.txtInserisci);
        spnGeneri = (Spinner)findViewById(R.id.spnGeneri);


        gb = new GestoreBrani();
        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gb.addBrano("Test");
                    }
                }
        );
    }
}