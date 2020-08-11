package com.saurabh.triplogexample
import androidx.appcompat.app.AppCompatActivity
import com.saurabh.triplogexample.model.Repository
import com.saurabh.triplogexample.utils.CoordinatesFormatter
import com.saurabh.triplogexample.utils.DateFormatter


abstract class BaseActivity: AppCompatActivity() {

  val repository: Repository by lazy {
    (application as MainApplication).repository
  }

  val dateFormatter: DateFormatter by lazy {
    (application as MainApplication).dateFormatter
  }

  val coordinatesFormatter: CoordinatesFormatter by lazy {
    (application as MainApplication).coordinatesFormatter
  }
}