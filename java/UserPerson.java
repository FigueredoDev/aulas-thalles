
public class UserPerson {
    String name;
    String last_name;
    String email;
    int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {

        try {
            UserPerson person1 = new UserPerson();

            person1.setName("Jhonata Figueredo");
            System.out.println(String.format("Ola, me chamo %s", person1.getName()));
          
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ao inicializar a classe, verifique novamente!");
        }

    }
}