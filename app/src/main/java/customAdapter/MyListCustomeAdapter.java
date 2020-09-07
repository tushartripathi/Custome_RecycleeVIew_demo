package customAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vubird.customelistview.R;

import java.util.ArrayList;

import objectClass.Entry;

public class MyListCustomeAdapter extends RecyclerView.Adapter<MyListCustomeAdapter.MyViewHolder> {

    // List to store all the contact details
    private ArrayList<Entry> contactsList;
    private Context mContext;

    public MyListCustomeAdapter(ArrayList<Entry> entryList)
    {
        contactsList = entryList;
    }


    @NonNull
    @Override
    public MyListCustomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(myview);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyListCustomeAdapter.MyViewHolder holder, int position) {
        Entry entry = contactsList.get(position);
        holder.titleTextView.setText(entry.getEntryName());
        holder.dateTextView.setText(entry.getEntryDate());
        holder.priceTextView.setText(String.valueOf(entry.getEntryPrice()));
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }


    ///////////////////Seprate Class////////////



    public class  MyViewHolder extends  RecyclerView.ViewHolder
    {


        TextView titleTextView, dateTextView, priceTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.txtview);

            dateTextView = itemView.findViewById(R.id.txtDate);

            priceTextView = itemView.findViewById(R.id.txtPrice);


        }
    }
}