package tryGit

class User {
    String name
    String address
    String email
    Integer contact
    String description
    String country
    String state
    String city

    static constraints = {
     name blank: false, maxSize: 255
     address blank: false, maxSize: 255
     email email: true
     description blank: false, maxSize: 255
    }
}
