package br.com.rectius.calculaflex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.rectius.calculaflex.extension.format
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        calculate()

    }

    private fun calculate() {
        val gasPrice = intent.extras.getDouble("GAS_PRICE", 0.0)
        val etanolPrice = intent.extras.getDouble("ETHANOL_PRICE", 0.0)
        val gasAvarage = intent.extras.getDouble("GAS_AVERAGE", 0.0)
        val etanolAvarage = intent.extras.getDouble("ETHANOL_AVERAGE", 0.0)

        val performanceMyCar = etanolAvarage/gasAvarage

        val priceOfIndice = etanolPrice/gasPrice

        if(priceOfIndice <= performanceMyCar) {
            tvSuggestion.text = getString(R.string.ethanol)
        } else {
            tvSuggestion.text = getString(R.string.gasoline)
        }

        tvEthanolAverageResult.text = (etanolPrice/etanolAvarage).format(2)
        tvGasAverageResult.text = (gasPrice/gasAvarage).format(2)

    }

}