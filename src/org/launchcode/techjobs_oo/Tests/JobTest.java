package org.launchcode.techjobs_oo.Tests;

public class JobTest {

    package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert .*;

    public class JobTest {

        Job jobTest1;
        Job jobTest2;
        Job jobTest3;
        Job jobTest4;
        Job jobTest5;
        Job jobTest6;

        @Before
        public void JobObject() {
            jobTest1 = new Job();
            jobTest2 = new Job();
            jobTest3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            jobTest4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            jobTest5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            jobTest6 = new Job("", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        }

        @Test
        public void testSettingJobId() {
            assertEquals(1, jobTest2.getId() - jobTest1.getId());
        }

        @Test
        public void testJobConstructorSetsAllFields(){
            assertTrue(jobTest3 instanceof Job);
        }

        @Test
        public void testJobsForEquality(){
            assertNotEquals(jobTest3, jobTest4);
        }


        @Test
        public void toStringReturnsAllLabels(){
            assertTrue(jobTest4.toString().contains("ID : "));
            assertTrue(jobTest4.toString().contains("Name : "));
            assertTrue(jobTest4.toString().contains("Employer : "));
            assertTrue(jobTest4.toString().contains("Location : "));
            assertTrue(jobTest4.toString().contains("Position Type : "));
            assertTrue(jobTest4.toString().contains("Core Competency : "));
        }

        @Test
        public void jobAddsStringToEmptyFields(){
            assertTrue(jobTest6.toString().contains("Data not available"));
        }

        @Test
        public void AllEmptyFieldsReturnMessage(){
            assertTrue(jobTest5.toString().equals("OOPS! This job does not seem to exist."));
        }
    }
}
