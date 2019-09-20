package ampersanda.com

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonJomblo = findViewById<Button>(R.id.button_add_jomblo_meter)
        val textJombloMeter = findViewById<TextView>(R.id.text_jomblo_meter)
        val textAnniversary = findViewById<TextView>(R.id.text_anniversary)

        buttonJomblo.setOnClickListener {
            counter++;
            textJombloMeter.text = "Durasi tidak jomblo $counter bulan"

//            if (counter % 12 == 0) {
//                textAnniversary.visibility = View.VISIBLE
//            } else {
//                textAnniversary.visibility = View.GONE
//            }

            textAnniversary.visibility = if (counter % 12 == 0) View.VISIBLE else View.GONE;
        }
    }
}
