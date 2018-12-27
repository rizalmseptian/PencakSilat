package app.wordpress.pecaksilat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Guru3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru3);

    }

    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(Guru3Activity.this, PerguruanActivity.class);
        startActivity(intent);
        finish();
    }
}