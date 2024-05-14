package slot3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

import java.util.Arrays;

public class Demo31MainActivity extends AppCompatActivity {
 ListView lv;
 @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_demo31_main);
     lv = findViewById(R.id.slot3listview);
     //nguon du lieu
        String[] arr=new String[]{"Mon 1","Slot 3","Mon 2","Mon 3","Mon 4","Mon 5"};
        //adapter
        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        //hien thi listview
        lv.setAdapter(adapter);
    }
}