package id.co.rumahpanti.rumahpanti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void bantuan(View view) {
        Intent proses = new Intent(this, Bantuan.class);
        startActivity(proses);
    }



    public void GHome(View view) {
        Intent proses = new Intent(this, HomeActivity.class);
        startActivity(proses);
    }
}
