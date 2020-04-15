public class Address {

    public String address(String country) {
        System.out.println("Address: " + country);
        return String.format ("country: " + country);
    }
    public String address(String country, String city) {
        System.out.println("Address:  "+ country + ","+ city);
        return String.format("country: " +country+ ", city: "+city);
    }

    public String address(String country, String city, int code) {
        System.out.println("Address:  "+ country + ", "+ city + ", " + code);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code);
    }

    public String address(String country, String city, int code, String street) {
        System.out.println("Address:  "+ country + ", "+ city + ", " + code +", "+street);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street);
    }

    public String address(String country, String city, int code, String street, int apartment) {
        System.out.println("Address:  "+ country + ", "+ city + ", " + code +", "+street+", "+apartment);
        return String.format("country: " +country+ ", city: " +city+ ", code: " +code+ ", street:  " +street+ ", apartment: " +apartment);
    }

}
