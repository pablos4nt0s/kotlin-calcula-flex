package br.com.rectius.calculaflex.extension

import android.widget.EditText

fun EditText.getValue() = this.text.toString()

fun EditText.getDoule() = this.getValue().toDouble()