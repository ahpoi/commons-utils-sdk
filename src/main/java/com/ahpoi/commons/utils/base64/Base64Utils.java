package com.ahpoi.commons.utils.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Base64Utils {

    private Base64Utils() {
    }

    public static String encodeString(String value) {
        return encodeByte(value.getBytes(StandardCharsets.UTF_8));
    }

    public static String encodeByte(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] decodeString(String encodedValue) {
        return Base64.getDecoder().decode(encodedValue);
    }

}