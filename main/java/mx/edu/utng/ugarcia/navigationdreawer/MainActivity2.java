package mx.edu.utng.ugarcia.navigationdreawer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener  {


    private Room[] habitaciones = {
            new Room(R.drawable.room_individual,"Habitación Individual", "*Posee una cama simple o individual \n*Tiene un mobiliario básico\n*Posee cuarto de baño", "$550.00"),
            new Room(R.drawable.room_matrimonial, "Habitación Matrimonial","*Posee una cama matrimonial\n *Tiene mobiliario medio\n*Posee cuarto de baño mediano", "$1000.00"),
            new Room(R.drawable.room_boble, "Habitación Doble","*Posee dos camas individuales\n *Tiene mobiliario básico\n*Posee cuarto de baño", "$850.00"),
            new Room(R.drawable.room_suite, "Habitación Suite","Posee una cama King Size\n*Tiene modbiliario especial\n*Tiene sala de estar\n*Posee un cuarto de baño grande", "$1800.00")
    };
    private ListView lsvHabitaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_catalogue_layout);
        lsvHabitaciones = findViewById(R.id.lsv_habitaciones);
        HabitacionAdapter adapter = new HabitacionAdapter(
                this,habitaciones);
        lsvHabitaciones.setAdapter(adapter);

        lsvHabitaciones.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedOption = ((Room)adapterView.getItemAtPosition(i)).getName();
        Toast.makeText(this, "You selected :" + selectedOption, Toast.LENGTH_SHORT).show();
    }

    public class ViewHolder{
        TextView txvName;
        TextView txvDescripcion;
        TextView txvPrecio;
        ImageView imvPhoto;
    }

    class HabitacionAdapter extends ArrayAdapter<Room> {
        public HabitacionAdapter(@NonNull Context context, Room[] data){
            super(context, R.layout.catalogue_rooms_layout, data);
        }
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            ViewHolder holder;
            if (cell==null){
                LayoutInflater inflater =
                        LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.catalogue_rooms_layout,null);
                holder = new ViewHolder();
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvName = cell.findViewById(R.id.txv_name);
                holder.txvDescripcion = cell.findViewById(R.id.txv_descripcion);
                holder.txvPrecio = cell.findViewById(R.id.txv_precio);
                cell.setTag(holder);
            }else{
                holder = (ViewHolder) cell.getTag();
            }
            holder.imvPhoto.setImageResource(habitaciones[position].getImageId());
            holder.txvName.setText(habitaciones[position].getName());
            holder.txvDescripcion.setText(habitaciones[position].getDescripción());
            holder.txvPrecio.setText(habitaciones[position].getPrecio());
            return cell;
        }
    }
}