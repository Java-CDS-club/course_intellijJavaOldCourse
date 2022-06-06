public class ExtendedPassword extends Password
{
    private int decryptedPassword;

    public ExtendedPassword(int Password) {
        super(Password);
        this.decryptedPassword = Password;
    }

/*    @Override
    public void storePassword() {
        System.out.println("Saving password as "+this.decryptedPassword);
    }*/
}
