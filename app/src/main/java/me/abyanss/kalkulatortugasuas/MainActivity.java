package me.abyanss.kalkulatortugasuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void KalkulasiButton(View view) {
        EditText Bilanganpertama = (EditText) findViewById(R.id.text1);
        EditText Bilangankedua = (EditText) findViewById(R.id.text2);

        int bilpertama = Integer.parseInt(Bilanganpertama.getText().toString());
        int bilkedua = Integer.parseInt(Bilangankedua.getText().toString());

        RadioButton Tambah = findViewById(R.id.tambah);
        RadioButton Kurang = findViewById(R.id.kurang);
        RadioButton Kali = findViewById(R.id.kali);
        RadioButton Bagi = findViewById(R.id.bagi);

        int hasil = 0;

        if (Tambah.isChecked()) {
            hasil = bilpertama + bilkedua;
        } else if (Kurang.isChecked()) {
            hasil = bilpertama - bilkedua;
        } else if (Kali.isChecked()) {
            hasil = bilpertama * bilkedua;
        } else if (Bagi.isChecked()) {
            hasil = bilpertama / bilkedua;
        }

        TextView HasilTextView = findViewById(R.id.hasil);
        HasilTextView.setText("Hasil:" + hasil);

    }
}