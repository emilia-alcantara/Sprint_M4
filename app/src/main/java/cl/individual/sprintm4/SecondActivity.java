package cl.individual.sprintm4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import cl.individual.sprintm4.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }


    private void initListeners() {
        binding.buttonLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irLinkedIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(irLinkedIn);

            }
        });

        binding.buttonWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irWhatsApp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(irWhatsApp);
            }
        });

        binding.buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irEmail = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
                startActivity(irEmail);
            }
        });
    }


}