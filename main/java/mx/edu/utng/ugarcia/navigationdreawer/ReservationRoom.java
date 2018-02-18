package mx.edu.utng.ugarcia.navigationdreawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by alo_m on 17/02/2018.
 */

public class ReservationRoom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_layout);
    }
    public void startActivityPDF10(View view) {
        startActivity(new Intent(this, RoomReservation2.class));
    }
}
