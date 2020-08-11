package com.saurabh.triplogexample

import android.app.Application
import android.content.Context
import com.saurabh.triplogexample.model.Repository
import com.saurabh.triplogexample.model.SharedPreferencesRepositoryImpl
import com.saurabh.triplogexample.utils.CoordinatesFormatter
import com.saurabh.triplogexample.utils.CoordinatesFormatterImpl
import com.saurabh.triplogexample.utils.DateFormatter
import com.saurabh.triplogexample.utils.DateFormatterImpl


class MainApplication: Application() {

  val repository: Repository by lazy {
    SharedPreferencesRepositoryImpl(getSharedPreferences("TRIP_LOG_REPO", Context.MODE_PRIVATE))
  }

  val dateFormatter: DateFormatter by lazy {
    DateFormatterImpl()
  }

  val coordinatesFormatter: CoordinatesFormatter by lazy {
    CoordinatesFormatterImpl(applicationContext)
  }
}