package tryGit

class User {
    String name
    String address
    String email

    static constraints = {
     name blank: false
     address blank: false
     email email: true
    }
}
