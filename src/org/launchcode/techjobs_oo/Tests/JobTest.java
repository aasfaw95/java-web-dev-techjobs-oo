package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;


public class JobTest {

    private Job jobOne, jobTwo, jobThings;

    @Before
    public void Job(){
        jobOne = new Job();
        jobTwo = new Job();
        jobThings = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertEquals(jobOne.getId(), jobTwo.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", jobThings.getName());
        assertEquals("ACME", jobThings.getEmployer().getValue());
        assertEquals("Desert", jobThings.getLocation().getValue());
        assertEquals("Quality control", jobThings.getPositionType().getValue());
        assertEquals("Persistence", jobThings.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(jobOne.equals(jobTwo));

    }
    @Test
    public void testToString() {
        //Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID: " + "3" + "\nName: " + "Product tester" + "\nEmployer: "
                + "ACME" + "\nLocation: " + "Desert"
                + "\nPosition Type: " + "Quality control"
                + "\nCore Competency: " + "Persistence" + "\n", jobThings.toString());
    }
}




