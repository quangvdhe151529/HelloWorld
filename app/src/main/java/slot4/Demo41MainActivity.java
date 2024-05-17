package slot4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.helloworld.R;

import java.util.ArrayList;

public class Demo41MainActivity extends AppCompatActivity {
    ListView lv;
    Demo41Adapter adapter;
    ArrayList<T41Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo41_main);
        lv=findViewById(R.id.demo41Lv);
        //tao nguon du lieu
        ls.add(new T41Contact("Nguyen Van A", "20",R.drawable.a));
        ls.add(new T41Contact("Tran Van B", "19",R.drawable.b));
        ls.add(new T41Contact("Vu Van C", "21",R.drawable.c));
        ls.add(new T41Contact("Nguyen Thi D", "22",R.drawable.e));
        ls.add(new T41Contact("Nguyen Van e", "25",R.drawable.f));
        ls.add(new T41Contact("Nguyen Van f", "27",R.drawable.g));
        ls.add(new T41Contact("Nguyen Van h", "28",R.drawable.h));
        //tao adapter
        adapter=new Demo41Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}