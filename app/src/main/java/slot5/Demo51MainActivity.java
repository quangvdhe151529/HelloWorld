package slot5;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.helloworld.R;

import java.util.ArrayList;
import java.util.List;

public class Demo51MainActivity extends AppCompatActivity {
    ListView listView;
    Demo51Adapter adapter;
    List<Demo51Product> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo51_main);
        listView=findViewById(R.id.demo51Listview1);
        Demo51ProductDAO dao=new Demo51ProductDAO(this);
        list=dao.getAll();
        adapter = new Demo51Adapter(list,this);
        listView.setAdapter(adapter);
    }
}