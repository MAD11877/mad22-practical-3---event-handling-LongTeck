package sg.edu.np.mad.madpractical3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imageButton = findViewById(R.id.Image);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(ListActivity.this);
                alert.setTitle("Profile")
                        .setMessage("MADness")
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        })
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent mainPage = new Intent(ListActivity.this, MainActivity.class);
                                startActivity(mainPage);

                                Random rand = new Random();
                                Intent num = new Intent(ListActivity.this, MainActivity.class);
                                num.putExtra("Number", rand.nextInt());
                                startActivity(num);
                            }
                        });
                alert.show();
            }
        });
    }
}