package practiceOne;

/**
 * @author e_jjk
 */
public class User {

    String address;
    String sex;
    String[] carNumbers;

    public User(String sex, String[] carNumbers) {
        this.sex = sex;
        this.carNumbers = carNumbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toCarNumbersString() {
        String result = "";
        for (String carNumber : carNumbers) {
            result += "car number: " + carNumber + "\n";
        }
        return result;
    }

    public String introduce() {
        return "address: " + address + ". sex: " + sex;
    }
}
