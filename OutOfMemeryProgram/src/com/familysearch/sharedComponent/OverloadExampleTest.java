package com.familysearch.sharedComponent;

import org.mockito.Mockito;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class OverloadExampleTest {

  OverloadExample.Fruits testFruits;

  @org.junit.Before
  public void setUp() throws Exception {
  }

  @org.junit.After
  public void tearDown() throws Exception {
  }

  @org.junit.Test
  public void unitTest() {

  testFruits = new OverloadExample.Fruits("Pear");

  String fruitName = testFruits.getName();
  assertNotNull(fruitName); //junit
  }

  @org.junit.Test
  public void fruitHarvest_MockTest() throws ParseException {
    String string_date = "02-FEB-2020";
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    Date testDate = sdf.parse(string_date);

    Calendar calendarMock = Mockito.mock(Calendar.class); //moickito
    when(calendarMock.getTimeInMillis()).thenReturn(testDate.getTime()); // mockito

    OverloadExample.Fruits testFruits = new OverloadExample.Fruits("Pear");
    testFruits.harvestFruits(calendarMock);
    assertThat(testFruits.getHarvestDateString(), containsString("2020")); //hamcrest
  }
}