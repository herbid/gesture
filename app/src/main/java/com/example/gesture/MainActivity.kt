package com.example.gesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as MotionEventCompact1

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {


    //variabel untuk mendeteksi gesture yang dieri nilai awal yaitu null
    var gDetector : GestureDetectorCompat?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //membuat class turunan GestureDetectorcompact
        this.gDetector=GestureDetectorCompat(this,this)
        //mendeteksi ketukan ganda
        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
       this.gDetector?.onTouchEvent(event)
        //memastikan untuk memanggil implementasi superclass
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        gesture_status.text = "on Down"
        return true

    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    gesture_status.text="onFling"
        return true


    }

    override fun onLongPress(e: MotionEvent?) {
        gesture_status.text="onLongpress"
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        gesture_status.text="onScroll"
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        gesture_status.text="onShowPress"

    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gesture_status.text="onSinleTap"
        return true

    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTap"
        return true
    }
    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTapEvent"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {

        gesture_status.text="onSingleTapConfirmed"
        return true
    }

}
