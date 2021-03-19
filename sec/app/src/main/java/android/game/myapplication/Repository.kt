package android.game.myapplication

object Repository {

    private var weatherList: List<Weather>

    init {
        weatherList = listOf( Weather( "Москва" , 15 ))
    }

    fun getWeatherList (): List<Weather> {
        return weatherList
    }

    fun getNumber(): Int{
        return 20
    }

}