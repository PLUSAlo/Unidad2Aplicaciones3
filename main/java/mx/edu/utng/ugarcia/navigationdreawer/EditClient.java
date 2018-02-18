package mx.edu.utng.ugarcia.navigationdreawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by alo_m on 17/02/2018.
 */

public class EditClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clientes_layout);
    }
    public void nextActivity(View view){

        startActivity(new Intent(this, Cliente.class));
    }
}
