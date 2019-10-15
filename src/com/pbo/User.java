package com.pbo;

public class User {

    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private static Boolean statusAkun;

    private Boolean checkAkun(String UserName, String Password) {
        if (UserName.equals(username) && Password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    private void hasilLogin(Boolean status, String UserName) {
        System.out.println();
        if (status == true) {
            System.out.println("***** HALLO RIZKIADAM");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, username atau password anda salah");
        }
    }

    public void pengecekkanLogin(String UserName, String Password) {
        statusAkun = checkAkun(UserName, Password);
        hasilLogin(statusAkun, UserName);
    }

}
