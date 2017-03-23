package tryGit

class User {
    String name
    String address
    String email

    static constraints = {
     name blank: false, maxSize: 255
     address blank: false, maxSize: 255
     email email: true
    }
}
