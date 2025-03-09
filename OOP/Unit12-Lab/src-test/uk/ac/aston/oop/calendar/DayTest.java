package uk.ac.aston.oop.calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DayTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DayTest {

	// TODO - add your tests here!
	@Test public void appointmentStartOfDay() {
		// Arrange
		Day dayOne = new Day(1);
		Appointment appointmentOne = new Appointment("meeting", 1);
		// Act
		boolean success = dayOne.makeAppointment(dayOne.START_OF_DAY, appointmentOne);
		Appointment fetched = dayOne.getAppointment(dayOne.START_OF_DAY);
		// Assert
		assertTrue(success, "Appointment could be made at the start of the day");
		assertSame(appointmentOne, fetched, "Should be possible to fetch the appointment that was made");
	}
	
	@Test public void appointmentBeforeStartOfDay(){
		// Make a 1-hour appointment schedule for one hour before the start of day, fetch appointment back from the Day
		// Arrange
		Day dayOne = new Day(1);
		Appointment appointmentOne = new Appointment("meeting", 1);
		// Act
		boolean success = dayOne.makeAppointment(dayOne.START_OF_DAY - 1, appointmentOne);
		Appointment fetched = dayOne.getAppointment(dayOne.START_OF_DAY - 1);
		// Assert
		assertFalse(success);
		assertNull(fetched);
	}
	
	@Test public void twoAppsOnSameTime() { 
		// Book two different appointments at the same hour of an empty day, first = correct, second = false.
		// Arrange
		Day dayOne = new Day(1);
		Appointment appA = new Appointment("meeting 1", 1);
		Appointment appB = new Appointment("meeting 2", 1);
		// Act
		boolean successA = dayOne.makeAppointment(dayOne.START_OF_DAY, appA);
		Appointment fetchedA = dayOne.getAppointment(dayOne.START_OF_DAY);
		
		boolean successB = dayOne.makeAppointment(dayOne.START_OF_DAY, appB);
		Appointment fetchedB = dayOne.getAppointment(dayOne.START_OF_DAY);
		// Assert
		assertTrue(successA);
		assertSame(fetchedA, appA);
		assertFalse(successB);
		assertSame(fetchedB, appA);
	}
	
	@Test public void twoHourAppointmentAtStart() {
	    // Arrange
	    Day dayOne = new Day(1);
	    Appointment appA = new Appointment("meeting 1", 2);

	    // Act
	    boolean successA = dayOne.makeAppointment(Day.START_OF_DAY, appA);
	    Appointment fetchedANine = dayOne.getAppointment(Day.START_OF_DAY);
	    Appointment fetchedATen = dayOne.getAppointment(Day.START_OF_DAY + 1);

	    // Assert
	    assertTrue(successA, "Should be able to make a 2-hour appointment at the start of the day.");
	    assertSame(fetchedANine, appA, "The appointment at 9 should be the same as the one made.");
	    assertSame(fetchedATen, appA, "The appointment at 10 should be the same as the one made.");
	}

	
	@Test public void twoHourAppointmentBeyondEnd() {	
		// Arrange
		Day dayOne = new Day(1);
		Appointment appA = new Appointment("meeting 1", 2);
		// Act
		boolean successA = dayOne.makeAppointment(dayOne.FINAL_APPOINTMENT_TIME - 2, appA);
		boolean successB = dayOne.makeAppointment(dayOne.FINAL_APPOINTMENT_TIME - 1, appA);

		// Assert
		assertTrue(successA);
		assertFalse(successB);
	}

	@Test public void overlappingTwoHourAppointments() {
		// after booking a 2 hour slot (11 - 13), cant book an overlapping 2 hour slot (10 - 12, or 12-14)
	    // Arrange
	    Day day = new Day(1);
	    Appointment app1 = new Appointment("meeting 1", 2);

	    // Act
	    // 11 to 13
	    boolean success1 = day.makeAppointment(day.START_OF_DAY + 2, app1);
	    // 10 to 12
	    boolean success2 = day.makeAppointment(day.START_OF_DAY + 1, app1);

	    // Assert
	    assertTrue(success1, "Should be able to book the first appointment at 11 - 1.");
	    assertFalse(success2, "Should not be able to book an overlapping appointment from 10 to 12.");
	}

}
