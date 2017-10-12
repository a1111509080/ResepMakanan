package falih.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Data extends AppCompatActivity {
    ImageView gambar;
    TextView instruksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Intent in = getIntent();

        gambar = (ImageView) findViewById(R.id.data_image);
        gambar.setImageResource(in.getIntExtra("gambar",0));

        instruksi = (TextView) findViewById(R.id.instruksi);
        instruksi.setText(in.getStringExtra("instruksi"));

        getSupportActionBar().setTitle(in.getStringExtra("judul"));


    }
}
