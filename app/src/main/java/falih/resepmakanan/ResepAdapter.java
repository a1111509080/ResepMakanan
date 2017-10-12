package falih.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Falih on 10/11/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.MyViewHolder> {
    private Context c;
    private List<Resep> resepList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep_list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Resep resep = resepList.get(position);
        holder.judul.setText(resep.getJudul());
        holder.keterangan.setText(resep.getKeterangan());
        holder.gambar.setImageResource(resep.getGambar());
        holder.RL.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in = new Intent(c, Data.class);
                        in.putExtra("gambar",resep.getGambar());
                        in.putExtra("keterangan", resep.getKeterangan());
                        in.putExtra("judul", resep.getJudul());
                        in.putExtra("instruksi", resep.getInstruksi());
                        c.startActivity(in);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView judul,instruksi,keterangan;
        public ImageView gambar;
        public RelativeLayout RL;
        public MyViewHolder(View view) {
            super(view);
            judul = (TextView) view.findViewById(R.id.judul);
            keterangan = (TextView) view.findViewById((R.id.keterangan));
            gambar = (ImageView) view.findViewById(R.id.gambar);
            instruksi = (TextView) view.findViewById(R.id.instruksi);
            RL = (RelativeLayout) view.findViewById(R.id.row_data);
        }
    }
    public ResepAdapter(Context c, List<Resep> resepList){
        this.resepList = resepList;
        this.c = c;
    }
}
