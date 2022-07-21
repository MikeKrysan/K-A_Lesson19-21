package com.example.ka_lesson19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * Задание 1:
 * * Есть предприниматели, которые влаживают деньги с целью заработать
 * наша задача посчитать заработок
 * Создадим первый массив, то, сколько инвесторы вкладывают денег, а второй массив - то сколько люди заработают за месяц
 * Третий массив, который будет создан в папке с ресурсами, будет содержать имена предпринимателей
 * (задание 1 закомичено)
 *
 * Задание 2:
 * есть студенты. нужно отсортировать их по оценкам
 *
 */


class MainActivity : AppCompatActivity() {

//    val lostArray = arrayOf(10000, 2300, 45000, 65000, 6500, 400)
//    val earnArray = arrayOf(15000, 300, 345000, 5000, 16500, 3400)
//    val resultArray = ArrayList<String>()

    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val names = resources.getStringArray(R.array.names)

//        for((index, name) in names.withIndex()) {
//            resultArray.add("Имя: $name - прибыль = ${earnArray[index] - lostArray[index]}")
//            Log.d("MyLog", "Статистика -/- ${resultArray[index]}")
//        }
        for((index, name) in nameArray.withIndex()) {
            when(gradeArray[index] ) {
               in bad -> badArray.add("Плохие оценки: Ученик $name - ${gradeArray[index]}")
               in normal -> normalArray.add("Нормальные оценки: Ученик $name - ${gradeArray[index]}")
               in nice -> niceArray.add("Хорошие оценки: Ученик $name - ${gradeArray[index]}")
                excellent -> excellentArray.add("Отличные оценки: Ученик $name - ${gradeArray[index]}")
            }
        }

        badArray.forEach{Log.d("MyLog", it)}
        normalArray.forEach{Log.d("MyLog", it)}
        niceArray.forEach{Log.d("MyLog", it)}
        excellentArray.forEach{Log.d("MyLog", it)}
    }
}