package com.nttdata.validator.form.app.web.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.nttdata.validator.form.constraint.FieldMatch;
import com.nttdata.validator.form.constraint.Phone;
import com.nttdata.validator.form.constraint.ValidPassword;

@FieldMatch.List({
        @FieldMatch(baseField = "password", matchField = "confirmPassword", message = "The password fields must match"),
        @FieldMatch(baseField = "email", matchField = "confirmEmail", message = "The email fields must match")
})
public class UserRegistrationDto {

    @NotEmpty
    @Size(min=2, max=30) 
	private String firstName;

    @NotEmpty
    @Size(min=2, max=30) 
	private String lastName;

    @NotEmpty
    @ValidPassword
    private String password;

    @NotEmpty
    @ValidPassword
    private String confirmPassword;

    @Email
    @NotEmpty
    private String email;
    
    @NotEmpty
    @Phone
	private String phone;

    @Email
    @NotEmpty
    private String confirmEmail;

    @AssertTrue
    private Boolean terms;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public Boolean getTerms() {
        return terms;
    }

    public void setTerms(Boolean terms) {
        this.terms = terms;
    }

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
