package top.golabe.gotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import top.golabe.library.GoToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnGoToast.setOnClickListener {
            GoToast.create(this,"welcome").show()
        }
        mBtnToast.setOnClickListener {
            Toast.makeText(this,"AAA",Toast.LENGTH_LONG)
                .show()
        }
        mBtnSuccess.setOnClickListener {
            GoToast.success(this,"SUCCESS").show()
        }
        mBtnFailed.setOnClickListener {
            GoToast.failed(this,"FAILED").show()
        }



    }
}
