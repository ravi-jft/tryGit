package tryGit

class User {
    String name
    String address
    String email
    Integer contact
    String description

    static constraints = {
     name blank: false, maxSize: 255
     address blank: false, maxSize: 255
     email email: true
     description blank: false, maxSize: 255
    }
}
