package Week41;

public class User {
    private static int nextID = 0;
    private final int ID;
    private String userName;
    private String password;

    private static int getNextID(){
        return nextID++;
    }

    public User() {
        this.ID = getNextID();
    }

    private boolean isValidUserName(String userName) {
        return userName.contains("@");
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    public int getID(){
        return this.ID;
    }

    // Getter für userName
    public String getUserName() {
        return userName;
    }

    // Setter für userName mit Validierung
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        }
    }

    // Getter für password
    public String getPassword() {
        return password;
    }

    // Setter für password mit Validierung
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        }
    }


    // Überschreiben der toString-Methode, um Benutzername und ID auszugeben
    @Override
    public String toString() {
        return userName + " " + ID;
    }
}
