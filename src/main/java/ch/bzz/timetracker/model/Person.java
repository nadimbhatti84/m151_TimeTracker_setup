package ch.bzz.timetracker.model;

/**
 * a person whose working shifts are recorded
 * Time Tracker
 *
 * @author Marcel Suter (Ghwalin)
 */
public class Person {
    private String personUUID;
    private String firstname;
    private String lastname;
    private String email;

    /**
     * Gets the personUUID
     *
     * @return value of personUUID
     */
    public String getPersonUUID() {
        return personUUID;
    }

    /**
     * Sets the personUUID
     *
     * @param personUUID the value to set
     */

    public void setPersonUUID(String personUUID) {
        this.personUUID = personUUID;
    }

    /**
     * Gets the firstname
     *
     * @return value of firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the firstname
     *
     * @param firstname the value to set
     */

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets the lastname
     *
     * @return value of lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname
     *
     * @param lastname the value to set
     */

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the email
     *
     * @return value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email
     *
     * @param email the value to set
     */

    public void setEmail(String email) {
        this.email = email;
    }
}
