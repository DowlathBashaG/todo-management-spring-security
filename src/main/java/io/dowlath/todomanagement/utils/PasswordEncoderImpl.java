package io.dowlath.todomanagement.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
/*
$2a$10$LXLE2lyI51n2O.iimUUqHO3RcM9OeTMyHpSxn.kwJvW3/bICCgToy  -> Dowlath
$2a$10$0YVYROKaHKOMHlxXDk0M7OYbdftCc6zpm7tpDC/rwxaOSoSwyWW9y  -> Admin
 */
public class PasswordEncoderImpl {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        /*System.out.println(passwordEncoder.encode("dowlath"));
        System.out.println(passwordEncoder.encode("admin"));*/
    }
}
