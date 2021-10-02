package com.softlabio.geolocation

class LocationUpdateEvent(locationUpdate: LocationDTO) {
    private var location: LocationDTO
    fun getLocation(): LocationDTO {
        return location
    }

    fun setLocation(location: LocationDTO) {
        this.location = location
    }

    init {
        location = locationUpdate
    }
}