import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String date1[],date2[];
    int images[];
    Context context;
    public MyAdapter(Context ct,String s1[], String s2[], int img[]){
        context=ct;
        date1=s1;
        date2=s2;
        images=img;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myTextView1.setText(date1[position]);
        holder.MyTextView2.setText(date2[position]);
        holder.myImageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myTextView1,MyTextView2;
        ImageView myImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myTextView1=itemView.findViewById(R.id.song);
            MyTextView2=itemView.findViewById(R.id.artist);
            myImageView=itemView.findViewById(R.id.MyImageView);
        }
    }
}
