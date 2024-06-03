package slot8;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.helloworld.R;

public class Demo81MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv1;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo81_main);
        tv1=findViewById(R.id.demo81Tv1);
        //copy font to android system
        Typeface font = Typeface.createFromAsset(getAssets(),"Blazed.ttf");
        //use for textview
        tv1.setTypeface(font);
    }
}