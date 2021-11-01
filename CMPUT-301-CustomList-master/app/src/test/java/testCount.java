package com.example.simpleparadox.listycity;

@before
public void createList(){
        list=new CustomList(null,new ArrayList<City>());
}


@Test
void testCountcities(){
    CityList cityList = mockCityList();

    assertEquals(0,cityList.countCities());

    City city = new City("Halifax","Nova Scotia");
    City city2 = new City("London","Ontario");

    assertEquals(2,cityList.countCities());
}