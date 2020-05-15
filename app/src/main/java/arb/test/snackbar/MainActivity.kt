package arb.test.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showSnackBar(view: View) {
        val snackBar = Snackbar.make(view, "test one", Snackbar.LENGTH_INDEFINITE)
            .setAction("hidden") {
//                on click btn
            }
            .setActionTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
        val snackBarView = snackBar.view
        val txt =
            snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        snackBarView.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent))
        txt.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))


        snackBar.show()
    }
}
