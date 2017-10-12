package falih.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        ResepData();
    }

    private void ResepData() {
        Resep resep = new Resep("Pancake", R.drawable.pancake,"cemilan sederhana yang bikin kangen", "\nBahan-bahan :\n"
                +"\ttepung terigu 250 gram\n"
                +"\ttelur 2 butir\n"
                +"\tmargarin 4 sendok teh, cairkan\n"
                +"\tgula putih 4 sendok makan\n"
                +"\tsusu cair 1 gelas\n"
                +"\tair bersih 1 gelas\n"
                +"\tbaking powder 1/2 sendok teh\n\n"
                +"\tLahap-Langkah: \n"
                +"\t1. Campurkan terigu, gula putih, telur, susu cair, baking powder margarin yang telah cair. aduk agar rata dengan sempurna \n"
                +"\t2. Masukan air pada adonan sembari diatuk sampai adonan jadi encer juga tidak terbentuk gumpalan kecil\n"
                +"\t3. Tuangkan adonan sebanyak satu sendok sayur kedalam wajan dadar yang sudah dipanaskan, buat adonan berbentuk bulat agak tipis\n"
                +"\t4. Jika pada bagian atas terlah terbentuk gelembung kecil, artinya ini sudah matang. jadi silahkan angkat.\n"
                +"\t5. Tambahkan toping yang diinginkan\n");
        resepList.add(resep);
        resep = new Resep("Tahucampur", R.drawable.tahucampur,"Tahu campur khas semarang yang hampir sama dengan tahu gimbal", "\nBahan-bahan :\n"
                +"\tKol di rajang halus\n"
                +"\tTauge dibersihkan\n"
                +"\tTahu putih\n"
                +"\tTelur\n"
                +"\tLontong\n"
                +"\tBumbu kacang\n"
                +"\tKacang tanah goreng\n"
                +"\t1 siung bawang putih\n"
                +"\tCabe rawit sesuaikan selera pedes masing2\n"
                +"\tGula jawa\n"
                +"\tGaram\n"
                +"\tAir matang\n"
                +"\tUtk taburan\n"
                +"\tBawang merah goreng\n"
                +"\tDaun seledri iris halus\n"
                +"\tKecap manis\n\n"
                +"\tLangkah-Langkah\n"
                +"\tPotong dadu tahu putih kemudian goreng setengah matang\n"
                +"\tCeplok telur sisihkan\n"
                +"\tBuat bumbu kacang nya, haluskan semua bahan sampai halus, tambahkan air.\n"
                +"\tTata lontong,kol,tauge,tahu dan telur ceplok siram dg bumbu kacang taburi bawang merah goreng, daun seledri dan kecap, siap di nikmati.\n");
        resepList.add(resep);
        resep = new Resep("Ayam Geprek", R.drawable.geprek,"Rasa pedas cabai di campur gurihnya ayam goreng", "\nBahan-bahan :\n"
                +"\tsecukupnya Ayam \n"
                +"\tTepung bumbu\n"
                +"\tTahu putih\n"
                +"\t3 butir bawang putih \n"
                +"\t5-10 cabe setan \n"
                +"\tsecukupnya Garam gula moto \n"
                +"\t2 sendok minyak goreng bekas goreng ayam \n"
                +"\tLangkah-Langkah\n"
                +"\t1. Goreng ayam tepung hingga matang\n"
                +"\tUlek bawang putih cabe garam gula moto kemudian masukan minyak goreng panas bekas goreng ayam\n"
                +"\tGeprek ayam beserta sambel & sajikan.\n");
        resepList.add(resep);
        resep = new Resep("Puding", R.drawable.puding,"dingin enak segar","\nBahan-bahan :\n"
                +"\t1 bungkus nutrijell coklat \n"
                +"\t2 gelas susu cair (uht) \n"
                +"\t2 gelas air\n"
                +"\t1 gelas gula pasir \n"
                +"\t1 sdm maizena, larutkan dengan setengah gelas air \n\n"
                +"\tLangkah-Langkah\n"
                +"\t1. Campurkan terlebih dahulu nutrijell dan gula(supaya tidak menggumpal) sebelum menyalakan api\n"
                +"\tMasukan air dan susu cair. Setelah tercampur rata, nyalakan apinya\n"
                +"\tSaat hampir mendidih, masukan campuran tepung maizena, aduk terus hingga mendidih\n"
                +"\tTuang ke cetakan, setelah tidak terlalu panas masukan ke dalam lemari es\n");
        resepList.add(resep);
        //ResepAdapter.notifyDataSetChanged();
    }
}
