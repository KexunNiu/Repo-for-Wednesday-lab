package com.example.simpleparadox.listycity;


@before
public void createList(){
    list = new CustomList(null,new ArrayList<City>());
}

@Test
void testHasCity(){
    CityList cityList = mockCityList();
    City city = new City("Toronto","Ontario");

    assertEquals(true,cityList.hasCity(city));

    cityList.add(city);

    assertEquals(true,cityList.hasCity(city));

}