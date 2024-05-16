package slot4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.helloworld.R;

import java.util.ArrayList;

public class Demo42MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo42_main);
        var ls= ArrayList<Demo42Student>()
                ls.add(Demo42Student("Nguyen Van A", "18",R.drawable.android))
        var adapter=Demo
    }
}