package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;

    public class JobTest {

        Job test1;
        Job test2;
        Job test3;
        Job test4;
        Job test5;
        Job test6;

        @Before
        public void JobObject() {
            test1 = new Job();
            test2 = new Job();
            test3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            test4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            test5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            test6 = new Job("", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        }

        @Test
        public void testSettingJobId() {
            assertEquals(1, test2.getId() - test1.getId());
        }

        @Test
        public void testJobConstructorSetsAllFields(){
            assertTrue(test3 instanceof Job);
        }

        @Test
        public void testJobsForEquality(){
            assertNotEquals(test3, test4);
        }


        @Test
        public void toStringReturnsAllLabels(){
            assertTrue(test4.toString().contains("ID : "));
            assertTrue(test4.toString().contains("Name : "));
            assertTrue(test4.toString().contains("Employer : "));
            assertTrue(test4.toString().contains("Location : "));
            assertTrue(test4.toString().contains("Position Type : "));
            assertTrue(test4.toString().contains("Core Competency : "));
        }

        @Test
        public void jobAddsStringToEmptyFields(){
            assertTrue(test6.toString().contains("Data not available"));
        }

        @Test
        public void AllEmptyFieldsReturnMessage(){
            assertTrue(test5.toString().equals("OOPS! This job does not seem to exist."));
        }
    }
