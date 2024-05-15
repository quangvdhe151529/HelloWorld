package slot3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class Demo32MainActivity_login extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo32_main_login);
        txt1=findViewById(R.id.EditText1);
        txt2=findViewById(R.id.EditText2);
        btn1=findViewById(R.id.Button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    private void login(){
        if(txt1.getText().toString().equals("admin")&&txt2.getText().toString().equals("12345")){
            Toast.makeText(Demo32MainActivity_login.this,"Login successful",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(Demo32MainActivity_login.this,"User or pass wrong",Toast.LENGTH_LONG).show();
        }
    }
}