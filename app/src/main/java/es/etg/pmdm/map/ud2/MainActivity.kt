package es.etg.pmdm.map.ud2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.etg.pmdm.map.ud2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.listaMainActivity.setOnClickListener {
            startActivity(Intent(this, DatailsActivity::class.java))
        }

    binding.btSumar.setOnClickListener {
      startActivity(Intent(this, AddActivity::class.java))
    }

    }
}