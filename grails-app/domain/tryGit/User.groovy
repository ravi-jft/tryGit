package tryGit

class User {
    String name
    String address

    static constraints = {
     name blank: false
     address blank: false
    }
}
