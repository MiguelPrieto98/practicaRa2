package es.etg.pmdm.map.ud2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.etg.pmdm.map.ud2.databinding.ActivityDatailsBinding

class DatailsActivity : AppCompatActivity() {
   private lateinit var binding : ActivityDatailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDatailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.buttonBorrar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}