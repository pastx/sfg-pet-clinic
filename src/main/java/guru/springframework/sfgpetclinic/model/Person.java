package guru.springframework.sfgpetclinic.model;

public class Person {

    private String firstName;
    private String lasstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLasstName() {
        return lasstName;
    }

    public void setLasstName(final String lasstName) {
        this.lasstName = lasstName;
    }
}
