package com.saurabh.triplogexample

import com.google.android.gms.location.LocationAvailability
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import java.lang.ref.WeakReference

class WeakLocationCallback(locationCallback: LocationCallback) : LocationCallback() {

    private val locationCallbackRef = WeakReference(locationCallback)

    override fun onLocationResult(locationResult: LocationResult?) {
        locationCallbackRef.get()?.onLocationResult(locationResult)
    }

    override fun onLocationAvailability(locationAvailability: LocationAvailability?) {
        locationCallbackRef.get()?.onLocationAvailability(locationAvailability)
    }
}