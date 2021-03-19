package android.game.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.reflect.Array.get
import java.lang.reflect.Array.set

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list: MutableList<Int> = ArrayList()
        list.add(0,1)
        list.add(2)

//        val repository = Repository()
//        Repository().getWeatherList()
        Repository.getWeatherList()

        var weatherList: List<Weather> = listOf<Weather>()
        val hasData: Boolean



    }

    fun get():Int = 10


}