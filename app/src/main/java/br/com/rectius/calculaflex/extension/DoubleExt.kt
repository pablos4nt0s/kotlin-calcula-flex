package br.com.rectius.calculaflex.extension

fun Double.format(digits: Int) = String.format("%.${digits}f", this)