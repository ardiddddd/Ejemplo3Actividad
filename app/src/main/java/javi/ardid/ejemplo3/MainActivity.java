package javi.ardid.ejemplo3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ETADOS","6- Estoy en el método Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ETADOS","5- Estoy en el método Stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ETADOS","4- Estoy en el método Pause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ETADOS","3- Estoy en el método Resume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ETADOS","2- Estoy en el método Start");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ETADOS","1- Estoy en el método Create" );

    }
}