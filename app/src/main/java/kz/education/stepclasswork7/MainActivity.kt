package kz.education.stepclasswork7

import android.content.Intent
import android.graphics.Paint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    fun initializeViews(){
        var release = Build.VERSION.RELEASE;
        var sdkVersion = Build.VERSION.SDK_INT;
        textView = TextView(applicationContext)
        textView?.setText("Android SDK = $sdkVersion ($release)")
        textView?.width=200
        textView?.height=45
        textView?.textAlignment=View.TEXT_ALIGNMENT_CENTER
        findViewById<LinearLayout>(R.id.activity_main_layout).addView(textView);
    }
}