package com.example.ordernow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class adminhome extends AppCompatActivity {
    CardView cardhome,vegi,fruit,allorder;
    CardView cardlogout;
    CardView carduserprofile;
    ImageSlider slider;
    private  long backpresstime;
    private  static final int Time_interval=2000;
    SharedPreferences sharedPreferences;
    private Toast backToast;
    boolean singleBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);

        slider=findViewById(R.id.slider);

        List<SlideModel> slideModels =new ArrayList<>();
        slideModels.add(new SlideModel("C:\\Users\\DELL\\Pictures\\Camera Roll","Your Halth is Our Motive"));
        slideModels.add(new SlideModel("https://www.bing.com/images/search?view=detailV2&ccid=u5hhDI7A&id=B0EA9A649A278CFC9B70BCFCD0C8DAFA824A38FA&thid=OIP.u5hhDI7Ac6y-9BkYBTjg_QEsCo&mediaurl=https%3a%2f%2fmedia4.s-nbcnews.com%2fi%2fnewscms%2f2015_19%2f527086%2ffruit-vegetables-today-150506-tease_e908ce57ce1004fde64c071d303fe5b4.jpg&exph=1080&expw=1920&q=Real+Fruits+and+Vegetables&simid=608032507300825928&FORM=IRPRST&ck=82A5EEA438AB0054986DC10A4EC1043B&selectedIndex=14","We Supply Fresh Fruits & Vegetables"));
        slideModels.add(new SlideModel("https://www.bing.com/images/search?view=detailV2&ccid=%2fsPfk1%2bk&id=C4CDD99996A52F1C2AC881B77A3BFF18E93C4800&thid=OIP._sPfk1-khGpLANqylq_bZAHaE5&mediaurl=https%3a%2f%2fwww.quickanddirtytips.com%2fsites%2fdefault%2ffiles%2fimages%2f623%2fproduce-fruits-vegetables-grocery.jpg&exph=662&expw=1000&q=Real+Fruits+and+Vegetables&simid=608014296641701250&FORM=IRPRST&ck=819CAD81D5FA07880FAB63A0E26EC044&selectedIndex=6","We Try To Give Our Best"));
        slider.setImageList(slideModels,true);

        cardlogout=findViewById(R.id.cardlogout);

        cardhome=findViewById(R.id.cardhome);
        carduserprofile=findViewById(R.id.carduserprofile);



        /*carduserprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),userprofile.class));
            }
        });*/

    }

    public void logout(View view) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(),login.class));
            finish();

    }

    public void pro(View view) {
        startActivity(new Intent(getApplicationContext(),userprofile.class));
        //finish();
    }

    public void fru(View view) {
        startActivity(new Intent(getApplicationContext(),fruit_admin.class));
       // finish();
    }



    @Override
    public void onBackPressed() {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent a = new Intent(Intent.ACTION_MAIN);
                        a.addCategory(Intent.CATEGORY_HOME);
                        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(a);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

    public void alldata(View view) {
        startActivity(new Intent(getApplicationContext(),allproduct.class));
    }

    public void data_up(View view) {
        startActivity(new Intent(getApplicationContext(),vegetable_admin.class));
    }
}