package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/*
 * Chef.java Entity for Chef
 * Author: Imraan Abdullah
 * 219361738
 * Date: 26 March 2022
 * */
@Entity
public class WaitingStaff
{
    @Id @NotNull
    private String employeeId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    protected WaitingStaff()
    {

    }

    private WaitingStaff(Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getId()
    {
        return employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public static class Builder
    {
        private String employeeId;
        private String firstName;
        private String lastName;

        public Builder setId(String employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(WaitingStaff waitingStaff)
        {
            this.employeeId = waitingStaff.employeeId;
            this.firstName = waitingStaff.firstName;
            this.lastName = waitingStaff.lastName;
            return this;
        }

        public WaitingStaff build()
        {
            return new WaitingStaff(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return employeeId.equals(builder.employeeId) && firstName.equals(builder.firstName) && lastName.equals(builder.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(employeeId, firstName, lastName);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "employeeId='" + employeeId + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
