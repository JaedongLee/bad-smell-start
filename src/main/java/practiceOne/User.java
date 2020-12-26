/* 以下代码有什么坏味道？ */

package practiceOne;

public class User {

    String ad; // 地址
    String sx; // 性别

    String[] num; //车牌号

    public User(String sx, String[] num) {
        this.sx = sx;
        this.num = num;
    }

    public void setAd(String param1) {
        this.ad = param1;
    }

    public String showCarNumber() {
        String result = "";
        for (String carNumber : num) {
            result += "car number: " + carNumber + "\n";
        }
        return result;
    }

    public String introduce() {
        return "address: " + ad + ". sex: " + sx;
    }
}
