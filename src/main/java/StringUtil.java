// package com.bogotobogo;

public class StringUtil {
    public static String coalesce(String target, String def) {
        if (target == null) {
            return def;
        } else {
            return target;
        }
    }
}
