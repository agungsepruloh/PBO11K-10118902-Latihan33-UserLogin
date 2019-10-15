package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk memvalidasi user login atau sebagai sistem keamanan
 *
 */

public class Latihan33Login {

    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        System.out.print("Masukkan Username\t: ");
        Scanner scanner = new Scanner(System.in);
        usName = scanner.nextLine();
        System.out.print("Masukkan Password\t: ");
        Scanner scanner1 = new Scanner(System.in);
        passWord = scanner1.nextLine();

        User user = new User();
        user.pengecekkanLogin(usName, passWord);
    }
}
