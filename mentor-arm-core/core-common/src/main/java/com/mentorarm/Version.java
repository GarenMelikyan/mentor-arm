package com.mentorarm;

/**
 * @author William Arustamyan
 */
public final class Version {

    private final String applicationName;
    private final String versionNumber;

    public Version(final String applicationName, final String versionNumber) {
        this.applicationName = applicationName;
        this.versionNumber = versionNumber;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    @Override
    public String toString() {
        return "Version{" +
                "applicationName='" + applicationName + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                '}';
    }
}
