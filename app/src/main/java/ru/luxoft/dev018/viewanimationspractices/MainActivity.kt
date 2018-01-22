package ru.luxoft.dev018.viewanimationspractices

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.view.animation.AccelerateDecelerateInterpolator
//import android.view.animation.AnimationSet
//import android.view.animation.RotateAnimation
import android.view.animation.*
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_bazinga.setOnClickListener { executeAnimation() }

       val btn_next = findViewById(R.id.button_next) as Button
       btn_next.setOnClickListener {  executeAnimation()      }

    }


    private fun executeAnimation() {

        val alphaAnim = AlphaAnimation(1f, 0f)
        alphaAnim.duration = 1000
        alphaAnim.repeatCount = 1
        alphaAnim.repeatMode = Animation.REVERSE
        //img_bazinga.startAnimation(alphaAnim)

        val rotateAnim = RotateAnimation(
                0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f)
        rotateAnim.duration = 1000
        rotateAnim.repeatCount = 1
        rotateAnim.repeatMode = Animation.REVERSE
        //img_bazinga.startAnimation(rotateAnim)

        val scaleAnim = ScaleAnimation(
                1f, 3f, 1f, 3f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f)
        scaleAnim.duration = 1000
        scaleAnim.repeatCount = 1
        scaleAnim.repeatMode = Animation.REVERSE
        //img_bazinga.startAnimation(scaleAnim)


        val translateAnim = TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1.0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 2.0f)
        translateAnim.duration = 1000
        translateAnim.repeatCount = 1
        translateAnim.repeatMode = Animation.REVERSE
        img_bazinga.startAnimation(translateAnim)

        val set = AnimationSet(true)
        set.addAnimation(alphaAnim)
        set.addAnimation(rotateAnim)
        set.addAnimation(scaleAnim)
        set.addAnimation(translateAnim)

    }


}
