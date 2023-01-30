package com.example.recyclerview2;
//RecyclerView.Adapter<Adaptador.ViewHolder>

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtname;
        private TextView txtage;

        public ViewHolder(View v) {
            super(v);
            txtname = (TextView) v.findViewById(R.id.txtName);
            txtage = (TextView) v.findViewById(R.id.txtAge);
        }
    }

    private List<Clientes> clientList;

    public Adaptador(List<Clientes> ListaCliente) {
        this.clientList = ListaCliente;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycled_view_1, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return clientList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = clientList.get(position).getName();
        String age = clientList.get(position).getAge().toString();
        holder.txtname.setText(name);
        holder.txtage.setText(age);

    }

}