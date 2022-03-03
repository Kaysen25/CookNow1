package com.example.mycooknow.Activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycooknow.Activity.R;
import com.example.mycooknow.Activity.adapter.CustomAdapter;
import com.example.mycooknow.Activity.model.Constant;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    int condition;
    Intent intent;

    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant> constantList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         gridView=(GridView)findViewById(R.id.gridView);

         constantList= new ArrayList<>();


        intent = getIntent();
        condition = intent.getIntExtra("condition", 00);

        if (condition == 1) {
            manok();

        }
        else if(condition == 2){
            porkrecipes();

        }
        customAdapter=new CustomAdapter(Home.this,constantList, condition );
        gridView.setAdapter(customAdapter);



    }

    void porkrecipes(){
        constantList.add(new Constant(R.drawable.adobongmanok,getResources().getString(R.string.t1),getResources().getString(R.string.e1),getResources().getString(R.string.tr)));
        constantList.add(new Constant(R.drawable.tinola,getResources().getString(R.string.b),getResources().getString(R.string.b1),getResources().getString(R.string.b2)));
        constantList.add(new Constant(R.drawable.afritada,getResources().getString(R.string.c),getResources().getString(R.string.c1),getResources().getString(R.string.c2)));
        constantList.add(new Constant(R.drawable.chickenpastel,getResources().getString(R.string.d),getResources().getString(R.string.d1),getResources().getString(R.string.d2)));
        constantList.add(new Constant(R.drawable.asado,getResources().getString(R.string.f),getResources().getString(R.string.f1),getResources().getString(R.string.f2)));
        constantList.add(new Constant(R.drawable.chickensopas,getResources().getString(R.string.g),getResources().getString(R.string.g1),getResources().getString(R.string.g2)));
        constantList.add(new Constant(R.drawable.inasal,getResources().getString(R.string.h),getResources().getString(R.string.h1),getResources().getString(R.string.h2)));
        constantList.add(new Constant(R.drawable.kaldereta,getResources().getString(R.string.i),getResources().getString(R.string.i1),getResources().getString(R.string.i2)));
        constantList.add(new Constant(R.drawable.lechonmanok,getResources().getString(R.string.j),getResources().getString(R.string.j1),getResources().getString(R.string.j2)));
        constantList.add(new Constant(R.drawable.pinaupongmanok,getResources().getString(R.string.k),getResources().getString(R.string.k1),getResources().getString(R.string.k2)));
        constantList.add(new Constant(R.drawable.pininyahangmanok,getResources().getString(R.string.l),getResources().getString(R.string.l1),getResources().getString(R.string.l2)));
        constantList.add(new Constant(R.drawable.sinampalukan,getResources().getString(R.string.n),getResources().getString(R.string.n1),getResources().getString(R.string.n2)));

    }
    private void manok() {

        constantList.add(new Constant(R.drawable.sinigang,getResources().getString(R.string.t2),getResources().getString(R.string.e2),getResources().getString(R.string.tr1)));
        constantList.add(new Constant(R.drawable.bicol_express,getResources().getString(R.string.a),getResources().getString(R.string.a1),getResources().getString(R.string.a2)));
        constantList.add(new Constant(R.drawable.bagnet,getResources().getString(R.string.m),getResources().getString(R.string.m1),getResources().getString(R.string.m2)));
        constantList.add(new Constant(R.drawable.creamypork,getResources().getString(R.string.o),getResources().getString(R.string.o1),getResources().getString(R.string.o2)));
        constantList.add(new Constant(R.drawable.dinakdakan,getResources().getString(R.string.p),getResources().getString(R.string.p1),getResources().getString(R.string.p2)));
        constantList.add(new Constant(R.drawable.dinuguan,getResources().getString(R.string.q),getResources().getString(R.string.q1),getResources().getString(R.string.q2)));
        constantList.add(new Constant(R.drawable.karekare,getResources().getString(R.string.r),getResources().getString(R.string.r1),getResources().getString(R.string.r2)));
        constantList.add(new Constant(R.drawable.lechonpaksiw,getResources().getString(R.string.s),getResources().getString(R.string.s1),getResources().getString(R.string.s2)));
        constantList.add(new Constant(R.drawable.porkbinagoongan,getResources().getString(R.string.u),getResources().getString(R.string.u1),getResources().getString(R.string.u2)));
        constantList.add(new Constant(R.drawable.porksisigkapampangan,getResources().getString(R.string.v),getResources().getString(R.string.v1),getResources().getString(R.string.v2)));
        constantList.add(new Constant(R.drawable.menudo,getResources().getString(R.string.w),getResources().getString(R.string.w1),getResources().getString(R.string.w2)));
        constantList.add(new Constant(R.drawable.humba,getResources().getString(R.string.x),getResources().getString(R.string.x1),getResources().getString(R.string.x2)));



    }
}