// package com.bogotobogo;

import org.junit.Assert;
import org.junit.Test;

public class TestStringUtil {
    @Test
    public void test_coalesce() {
        Assert.assertEquals("abc", StringUtil.coalesce(null, "abc"));
    }
}
