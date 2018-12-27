package app.wordpress.pecaksilat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PerguruanActivity extends AppCompatActivity {

    Button btnGuru1,btnGuru2,btnGuru3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguruan);

        btnGuru1 = (Button) findViewById(R.id.btn_guru1);
        btnGuru2 = (Button) findViewById(R.id.btn_guru2);
        btnGuru3 = (Button) findViewById(R.id.btn_guru3);

        btnGuru1.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerguruanActivity.this, Guru1Activity.class);
                startActivity(intent);
                finish();

            }
        }));

        btnGuru2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerguruanActivity.this, Guru2Activity.class);
                startActivity(intent);
                finish();
            }
        }));

        btnGuru3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerguruanActivity.this, Guru3Activity.class);
                startActivity(intent);
                finish();
            }
        }));

    }



    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(PerguruanActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
