package io.github.swgaming780;

public record Student(

        String firstName,
        String lastName,
        int studentID,
        String username,
        String address,
        String city,
        String state,
        String zipCode,
        String phoneNumber
) {
    public boolean equals(Student other) {
        return this.studentID == other.studentID;
    }
}
