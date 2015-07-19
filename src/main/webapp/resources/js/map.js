var simpleGoogleMapsApiExample = simpleGoogleMapsApiExample || {};

simpleGoogleMapsApiExample.map = function(mapDiv, latitude, longitude) {
	"use strict";

	var createMap = function(mapDiv, coordinates) {
		var mapOptions = {
			center : coordinates,
			mapTypeId : google.maps.MapTypeId.ROADMAP,
			zoom : 15
		};

		return new google.maps.Map(mapDiv, mapOptions);
	};

	var initialize = function(mapDiv, latitude, longitude) {
		var coordinates = new google.maps.LatLng(latitude, longitude);

		createMap(mapDiv, coordinates);
	};

	initialize(mapDiv, latitude, longitude);
};

