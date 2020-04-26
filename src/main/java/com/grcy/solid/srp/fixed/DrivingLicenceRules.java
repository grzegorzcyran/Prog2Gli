package com.grcy.solid.srp.fixed;

public class DrivingLicenceRules {

    private static final int DRIVING_LICENCE_REGUIRED_AGE = 18;
    private static final int DRIVING_LICENCE_REGUIRED_AGE_WITH_MENTOR = 16;

    public static boolean canGetDrivingLicense (Person person) {
        //ekstraktować 18 poza klasę i wczytywać jako konfigurację
        return person.getAge() > DRIVING_LICENCE_REGUIRED_AGE;
    }

}
