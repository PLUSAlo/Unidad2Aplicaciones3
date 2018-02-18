package mx.edu.utng.ugarcia.navigationdreawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RoomReservation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation_room);
    }
    public void startActivityPDF(View view) {
        startActivity(new Intent(this, Pdf.class));
    }
}
