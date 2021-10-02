package com.softlabio.geolocation

class LocationDTO {
    var latitude = 0.0
    var longitude = 0.0
    var speed = 0.0F
    override fun toString(): String {
        return "lat:$latitude- lng:$longitude- speed:$speed"
    }
}