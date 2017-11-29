package com.karumien.easyinventory.core.dto;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mira on 29.11.2017.
 */

public class Gravatar {

    public static String hash(String input) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(input));
            return String.format("%032x", new BigInteger(1, md5.digest()));
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }

    public static String getUrl(String mail) {
            return "http://www.gravatar.com/avatar/" + hash(mail);
    }

}
