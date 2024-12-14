package org.example.viewModel.User;

public class UserProfileView {
     String username;
     String phoneNumber;
     String email;

    public UserProfileView(String email, String phoneNumber, String username) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
