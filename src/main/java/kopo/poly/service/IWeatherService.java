package kopo.poly.service;

import kopo.poly.dto.WeatherDTO;

public interface IWeatherService {

    String apiURL = "https://api.open-meteo.com/v1/forecast";

    // 날씨 API를 호출하여 날씨 결과 받아오기
    WeatherDTO getWeather(WeatherDTO pDTO) throws Exception;
}

