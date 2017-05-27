package com.ahpoi.commons.utils.security;

import com.ahpoi.commons.utils.base64.Base64Utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class AESUtils {

    private static final String AES = "AES";

    private static Key key;

    private static Cipher cipher;

    public AESUtils(String encodedKey) {
        AESUtils.key = new SecretKeySpec(Base64Utils.decodeString(encodedKey), AES);
        AESUtils.cipher = doCipherGetInstance(AES);
    }

    public static String encrypt(String input) {
        doCipherInit(Cipher.ENCRYPT_MODE, key);
        return Base64Utils.encodeByte(doCipherFinal(input.getBytes()));
    }

    public static String decrypt(String input) {
        doCipherInit(Cipher.DECRYPT_MODE, key);
        return new String(doCipherFinal(Base64Utils.decodeString(input)));
    }

    private static void doCipherInit(int i, Key key) {
        try {
            cipher.init(i, key);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("Invalid Key: " + e.getMessage());
        }
    }

    private static byte[] doCipherFinal(byte[] input) {
        try {
            return cipher.doFinal(input);
        } catch (BadPaddingException e) {
            throw new RuntimeException("Bad Padding: " + e.getMessage());
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException("Illegal Block Size: " + e.getMessage());
        }
    }

    private Cipher doCipherGetInstance(String algorithm) {
        try {
            return Cipher.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No Such Algorithm: " + e.getMessage());
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException("No Such Padding: " + e.getMessage());
        }
    }
}
