
public class LC1108 {
    // 1108. Defanging an IP Address
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String defangIPaddr = defangIPaddr(address);
        System.out.println(defangIPaddr);
    }

    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
