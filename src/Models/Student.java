
package Models;

/**
 *
 * @author ACER
 */
public class Student {
    private String studentID;
    private String name;
    private String phoneNumber;
    private String email;
    private String mountainCode;
    private String tuitionFee;

    public Student() {
    }

    public Student(String studentID, String name, String phoneNumber, String email, String mountainCode, String tuitionFee) {
        this.studentID = studentID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.mountainCode = mountainCode;
        this.tuitionFee = tuitionFee;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMountainCode() {
        return mountainCode;
    }

    public void setMountainCode(String mountainCode) {
        this.mountainCode = mountainCode;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    @Override
    public String toString() {
        return String.format("| %-12s| %-19s| %-13s| %-14s| %-12s|", studentID, name, phoneNumber, mountainCode, tuitionFee);
    }
    
}
