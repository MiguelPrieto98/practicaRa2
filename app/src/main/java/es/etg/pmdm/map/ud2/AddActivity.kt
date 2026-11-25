package es.etg.pmdm.map.ud2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import es.etg.pmdm.map.ud2.databinding.ActivityAddBinding


class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.buttonGuardar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
        binding.buttonCancelar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }



    }
}

