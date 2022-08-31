package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class fruit_admin extends AppCompatActivity {
    Button btnbrowse, btnadd;
    ImageView imageView;
    DatePicker dp;
    EditText txtname, txtprice, txtstock, cate;

    StorageReference storageReference;
    FirebaseStorage fstore;
    DatabaseReference dbr;
    product_data pd;
    ProgressDialog prog;
    public Uri imguri;
    public StorageTask uploadTask;
    private final int IMG_REQUEST_ID = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_admin);

        btnbrowse = findViewById(R.id.btnbrowse);
        btnadd = findViewById(R.id.btnadd);
        imageView = findViewById(R.id.imageView);
        dp = findViewById(R.id.date_picker_actions);
        txtname = findViewById(R.id.txtname);
        txtprice = findViewById(R.id.txtprice);
        txtstock = findViewById(R.id.txtstock);
        cate = findViewById(R.id.cate);

        // pd=new product_data();

        // storageReference=FirebaseStorage.getInstance().getReference("Images");
        dbr = FirebaseDatabase.getInstance().getReference().child("product_all_data");
        fstore = FirebaseStorage.getInstance();
        prog = new ProgressDialog(this);


        btnbrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "select picture"), IMG_REQUEST_ID);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pname = txtname.getText().toString();
                String pprice = txtprice.getText().toString().trim();
                String pcat = cate.getText().toString().trim();
                String pstock = txtstock.getText().toString();
                int dip = (dp.getDayOfMonth() );

                if (!(pname.isEmpty() && pprice.isEmpty() && pcat.isEmpty() && pstock.isEmpty() && imguri != null)) {
                    prog.setTitle("Uploading...");
                    prog.show();

                    StorageReference filepath = fstore.getReference().child("imagePost").child(imguri.getLastPathSegment());
                    filepath.putFile(imguri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Task<Uri> downloadurl = taskSnapshot.getStorage().getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                @Override
                                public void onComplete(@NonNull Task<Uri> task) {
                                    String t = task.getResult().toString();
                                    DatabaseReference newpost = dbr.push();
                                    newpost.child("ProductName").setValue(pname);
                                    newpost.child("ProductPrice").setValue(pprice);
                                    newpost.child("ProductCategory").setValue(pcat);
                                    newpost.child("ProductStock").setValue(pstock);
                                    newpost.child("Date").setValue(dip);
                                    newpost.child("Image").setValue(task.getResult().toString());
                                    prog.dismiss();
                                }
                            });
                        }
                    });
                }

            }
        });


    }

    private String getExtension(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    /*public void Fileuploader(){

         String imgeid;
         imgeid=System.currentTimeMillis()+"."+getExtension(imguri);
         pd.setName(txtname.getText().toString());
         pd.setCate(cate.getText().toString().trim());
         pd.setImgid(imgeid);
         pd.setDate(dp.getAutofillId().toString().trim());
         int p=Integer.parseInt(txtprice.getText().toString().trim());
         int q=Integer.parseInt(txtstock.getText().toString().trim());

         pd.setPrice(p);
         pd.setQun(q);
         dbr.push().setValue(pd);
         StorageReference sr=storageReference.child(imgeid);
         uploadTask=sr.putFile(imguri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
             @Override
             public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                 Toast.makeText(getApplicationContext(),"Image Upload Sucessfuly.",Toast.LENGTH_LONG).show();
             }
         }
     ).addOnFailureListener(new OnFailureListener() {
             @Override
             public void onFailure(@NonNull Exception e) {
                 Toast.makeText(getApplicationContext(),"Image Upload Sucessfuly.",Toast.LENGTH_LONG).show();
             }
         });
    }*/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == IMG_REQUEST_ID && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imguri = data.getData();
            imageView.setImageURI(imguri);

            try {
                Bitmap bit = MediaStore.Images.Media.getBitmap(getContentResolver(), imguri);
                imageView.setImageBitmap(bit);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
   /* @Override
    public void onBackPressed() {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
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
}*/