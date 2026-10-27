package vn.edu.vlsc.thicuoiky_2500114713

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bắt buộc dùng findViewById
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvStatus = findViewById(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            when {
                email.isEmpty() -> {
                    tvStatus.text = "Vui lòng nhập Email"
                    tvStatus.setTextColor(0xFFFF0000.toInt())
                }
                password.isEmpty() -> {
                    tvStatus.text = "Vui lòng nhập Mật khẩu"
                    tvStatus.setTextColor(0xFFFF0000.toInt())
                }
                !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                    tvStatus.text = "Email không đúng định dạng"
                    tvStatus.setTextColor(0xFFFF0000.toInt())
                }
                password.length < 6 -> {
                    tvStatus.text = "Mật khẩu phải có ít nhất 6 ký tự"
                    tvStatus.setTextColor(0xFFFF0000.toInt())
                }
                else -> {
                    tvStatus.text = "Đăng nhập hợp lệ"
                    tvStatus.setTextColor(0xFF008000.toInt())

                }
            }
        }
    }
}