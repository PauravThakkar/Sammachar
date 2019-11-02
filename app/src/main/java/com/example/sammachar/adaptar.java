package com.example.sammachar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adaptar extends RecyclerView.Adapter<adaptar.viewHolder> {
    TextView txt_help_gest;
    TextView txt_help_gest1;
    TextView txt_help_gest2;
    private String[] data;
    private int[] data1;
    private String[] data2;
    private String[] data4;
    private String[] data6;
    private String[] data8;
    private String[] data9;
    private String[] data10;
    private String[] data11;
    public adaptar(String[] data, int[] data1,String[] data2,String[] data4,String[] data6,String[] data8,String[] data9,String[] data10,String[] data11)
    {
        this.data=data;
        this.data1=data1;
        this.data2=data2;
        this.data4=data4;
        this.data6=data6;
        this.data8=data8;
        this.data9=data9;
        this.data10=data10;
        this.data11=data11;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.recycler_adapter,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolder holder, int position) {
        String title = data[position];
        int image = data1[position];
        String maincontent =data2[position];
        String accordiancont =data4[position];
        String accordiancont1 =data6[position];
        String accordiancont2 =data8[position];
        String date=data9[position];
        String author=data10[position];
        String other=data11[position];
        holder.txt.setText(title);
        holder.img.setImageResource(image);
        holder.main.setText(maincontent);
        holder.acc.setText(accordiancont);
        holder.acc1.setText(accordiancont1);
        holder.acc2.setText(accordiancont2);
        holder.date.setText(date);
        holder.author.setText(author);
        holder.other.setText(other);
        holder.m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    holder.acc.setVisibility(holder.acc.isShown()
                            ? View.INVISIBLE
                            : View.VISIBLE);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        holder.m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    holder.acc1.setVisibility(holder.acc1.isShown()
                            ? View.INVISIBLE
                            : View.VISIBLE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        holder.m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    holder.acc2.setVisibility(holder.acc2.isShown()
                            ? View.INVISIBLE
                            : View.VISIBLE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt,main,acc,acc1,acc2,m1,m2,m3,date,author,other;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
            main = itemView.findViewById(R.id.maincontent);
            txt = itemView.findViewById(R.id.title);
            acc = itemView.findViewById(R.id.txt_help_gest);
            acc.setVisibility(View.GONE);
            acc1 = itemView.findViewById(R.id.txt_help_gest1);
            acc1.setVisibility(View.GONE);
            acc2 = itemView.findViewById(R.id.txt_help_gest2);
            acc2.setVisibility(View.GONE);
            m1 =itemView.findViewById(R.id.help_title_gest);
            m2 =itemView.findViewById(R.id.help_title_gest1);
            m3 =itemView.findViewById(R.id.help_title_gest2);
            date=itemView.findViewById(R.id.date);
            author=itemView.findViewById(R.id.author);
            other=itemView.findViewById(R.id.other);

        }
    }

}
