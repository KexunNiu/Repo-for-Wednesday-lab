package com.example.simpleparadox.listycity;


@before
public void createList(){
        list = new CustomList(null,new ArrayList<City>());
        }
        
@Test
void testDelete(){
    CityList cityList = mockCityList();

    City city = new City("Halifax","Nova Scotia");
    cityList.add(city);

    assertEquals(true,cityList.hasCity(city));
    cityList.delete(city);
    assertEquals(true,cityList.hasCity(city));

            }