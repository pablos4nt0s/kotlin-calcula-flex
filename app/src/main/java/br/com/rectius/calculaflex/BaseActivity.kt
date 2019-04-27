package br.com.rectius.calculaflex

import android.support.v7.app.AppCompatActivity
import br.com.rectius.calculaflex.utils.CalculaFlexTracker
import br.com.rectius.calculaflex.utils.ScreenMap

open class BaseActivity : AppCompatActivity() {

    open fun getScreenName(): String {
        return ScreenMap.getScreenNameBy(this)
    }

    override fun onStart() {
        super.onStart()
        CalculaFlexTracker.trackScreen(this, getScreenName())
    }
}

