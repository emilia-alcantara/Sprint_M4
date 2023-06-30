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
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:+569966773270"));
                startActivity(call);
            }
        });

        binding.buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensajeIngresado = binding.editTextCorreo.getText().toString();
                String[] to= {"correoalcantaraemilia@gmail.com"};

                Intent enviarCorreo = new Intent(Intent.ACTION_SEND);
                enviarCorreo.setType("text/plain");


                enviarCorreo.putExtra(Intent.EXTRA_EMAIL, to);
                enviarCorreo.putExtra(Intent.EXTRA_SUBJECT, "Asunto del mensaje");


                enviarCorreo.putExtra(Intent.EXTRA_TEXT, mensajeIngresado);


                startActivity(Intent.createChooser(enviarCorreo, "Enviar correo electrónico a través de: "));
            }
        });
    }


}