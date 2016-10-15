package yzu.ju.taichunglivetraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void buttonClick(View view){
        // 啟動地圖元件用的Intent物件
        Intent intentMap = new Intent(this, MapsActivity.class);
        // 啟動地圖元件
        startActivity(intentMap);
        MainActivity.this.finish();
    }


}
