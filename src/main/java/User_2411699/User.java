package User_2411699;

import java.time.LocalDate;

public abstract class User {
        protected final int id;
        private final String name, gender,userName;
        private String pw, address, email,phoneNum;
        private LocalDate dob;

        public User(int id, String name, String gender, String userName, String pw, String address, String email, String phoneNum, LocalDate dob) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.userName = userName;
            this.pw = pw;
            this.address = address;
            this.email = email;
            this.phoneNum = phoneNum;
            this.dob = dob;
        }

        public int getId() {
            return id;
        }

        public String getGender() {
            return gender;
        }

        public String getUserName() {
            return userName;
        }

        public String getPw() {
            return pw;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setPw(String pw) {
            this.pw = pw;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", userName='" + userName + '\'' +
                    ", pw='" + pw + '\'' +
                    ", address='" + address + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNum='" + phoneNum + '\'' +
                    ", dob=" + dob +
                    '}';
        }

        public static User verifyLogin(int givenId, String givenPw){
            //
            User u =null;
            //code to verify parameters with objects in files/database
            //if found, u = the identified object
            return u;
        }

        public final void changePw(String oldPw, String newPw, String captcha){
            //
        }

        public void logOut(){
            System.out.println("User class's version: Logged out");
        }

        public abstract void updateProfile();
        //public  void updateProfile(){}
    }
