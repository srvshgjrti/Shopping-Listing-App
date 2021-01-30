package learnprogramming.academy
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.text.method.ScrollingMovementMethod
import android.util.Log
private val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    //properties that will refer to a particular widget class
    // ? here means the type of intialisation here it means nullable types
    private var textView: TextView?=null
    //private var numTimesClicked=0
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG ,"Oncreate function called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // every widget in android are views // findviewbyid returns view object
        val userInput=findViewById<EditText>(R.id.editText)
        userInput.text.clear()
        val button=findViewById<Button>(R.id.button) //button in R.id.button is the id that of the button that is declared in design // R is resources class <object>
        textView=findViewById<TextView>(R.id.textView)
        textView?.text=""
        textView?.movementMethod = ScrollingMovementMethod()
        button?.setOnClickListener(object : View.OnClickListener{ // widget extends View class // we are calling onclicklistener function and this func tells the android studio what to do when the button is clicked
            override fun onClick(v: View?) {
                Log.d(TAG ,"Onclick function called")

                //numTimesClicked+=1
                //textView?.append("The button is clicked $numTimesClicked time")
                //if (numTimesClicked!=1) {
                    //textView?.append("s\n")
                    //}
                //else {
                    //textView?.append("\n")
                //}
            textView?.append(userInput?.text)
                textView?.append("\n")
                //userInput.text.clear()
                userInput.setText("")
            }
        })
        }

    override fun onStart() {
        Log.d(TAG ,"Onstart function called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG ,"Onrestoreinstancestate function called")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG ,"Onresume function called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG ,"Onpause function called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG ,"Onsaveinstancestate function called")
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Log.d(TAG ,"Onstop function called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG ,"Onrestart function called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG ,"Ondestroy function called")
        super.onDestroy()
    }
}