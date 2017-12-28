package id.co.rumahpanti.rumahpanti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bantuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);
    }


    public void Ghome(View view) {
        Intent proses = new Intent(this, HomeActivity.class);
        startActivity(proses);
    }

    public void GoUser(View view) {
        Intent proses = new Intent(this, UserActivity.class);
        startActivity(proses);
    }
}
