package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var canAddOperation=false
    private var canAddDecimal=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nubmerAction(view: View) {
    }

    fun operationAction(view: View) {
        if (view is Button && canAddOperation)
        {
            workingTV.append(view.text)
            canAddOperation = false
            canAddDecimal=true
        }
    }


    fun equalsAction(view: View) {
    }

    fun allCrealAction(view: View) {
        workingTV.text=""
        resultsTV.text=""
    }
    fun backSpaceAction(view: View) {
        val length=workingTV.length()
        if (length>0)
            workingTV.text=workingTV.text.subSequence(0, length-1)
    }

}