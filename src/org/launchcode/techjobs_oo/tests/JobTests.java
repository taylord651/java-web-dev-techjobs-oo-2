package org.launchcode.techjobs_oo.tests;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.*;

import static org.junit.Assert.*;

public class JobTests {

    private Job one;
    private Job two;
    private Job three;
    private Job four;
    private Job five;

    @Before
    public void Job() {
        one = new Job();
        two = new Job();
        three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        four = new Job("Programmer Analyst", new Employer("Edward Jones"), new Location("St. Louis"), new PositionType("Apprentice"), new CoreCompetency("Java"));
        five = new Job("Programmer Analyst", new Employer("Edward Jones"), new Location("St. Louis"), new PositionType("Apprentice"), new CoreCompetency("Java"));

    }

    @Test
    public void job_testSettingJobId_returnTrue() {
        assertTrue(one.getId() != two.getId());
        assertEquals(1, two.getId() - one.getId());
        assertEquals(1, one.getId());
    }

    @Test
    public void job_testSettingJobFields_returnTurn() {
        assertEquals("Product tester", three.getName());
        assertEquals("ACME", three.getEmployer().getValue());
        assertEquals("Desert", three.getLocation().getValue());
        assertEquals("Quality control", three.getPositionType().getValue());
        assertEquals("Persistence", three.getCoreCompetency().getValue());
    }

    @Test
    public void job_testJobsForEquality_returnsTrue() {
        assertFalse(four.equals(five));
    }

    @Test
    public void job_testToStringMethod_returnTrue() {
        char zeroIndex = three.toString().charAt(0);
        char lastIndex = three.toString().charAt(three.toString().length() - 1);
        assertEquals(zeroIndex, lastIndex);
    }

}
