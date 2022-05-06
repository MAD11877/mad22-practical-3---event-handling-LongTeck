package sg.edu.np.mad.madpractical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User user = new User("bot", "description", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent num = getIntent();
        Integer randnum = num.getIntExtra("Number", 0);
        TextView title = findViewById(R.id.Title);
        title.setText("MAD " + randnum);

        Button messageButton = findViewById(R.id.Message);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent messagePage = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(messagePage);
            }
        });
    }


    //onclick method
    public void OnCLick(View v){
        TextView txt = findViewById(R.id.Follow);
        Button followButton = findViewById(R.id.Follow);
        Toast.makeText(MainActivity.this, txt.getText() + "ed", Toast.LENGTH_SHORT)
                .show();

        if (user.Followed == false) {
            txt.setText("Unfollow");
            user.Followed = true;
        } else {
            txt.setText("Follow");
            user.Followed = false;
        }
    }
}
