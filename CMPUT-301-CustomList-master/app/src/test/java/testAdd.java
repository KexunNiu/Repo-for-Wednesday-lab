private CustomList list;

@before
public void createList(){
    list = new CustomList(null,new ArrayList<City>());
}

@Test
public void addCityTest(){
    int listSize = list.getcount();
    list.addCity(new City("Halifax","NS"));
    assertEquals(list.getCount()),listSize + 1);

}