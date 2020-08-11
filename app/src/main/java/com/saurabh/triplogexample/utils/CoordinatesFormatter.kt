package com.saurabh.triplogexample.utils

import android.content.Context
import com.saurabh.triplogexample.R
import com.saurabh.triplogexample.model.Coordinates


interface CoordinatesFormatter {
  fun format(coordinates: Coordinates?): String
}

class CoordinatesFormatterImpl(private val context: Context): CoordinatesFormatter {
  override fun format(coordinates: Coordinates?): String {
    if (coordinates == null) {
      return context.getString(R.string.location_unknown)
    }

    return context.getString(R.string.location_known, coordinates.latitude.toString(), coordinates.longitude.toString())
  }
}