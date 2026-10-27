package vn.edu.vlsc.thicuoiky_2500114713

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Bắt buộc dùng findViewById
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Nhận email từ màn Login
        val email = intent.getStringExtra("EMAIL")
        tvEmail.text = "Email: $email"

        // Nút Đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }
    }
}