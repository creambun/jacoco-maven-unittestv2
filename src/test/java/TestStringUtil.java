// package com.bogotobogo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStringUtil {
    @Test
    public void test_coalesce() {
        StringUtil util = new StringUtil();
        
        String target = null;
        Assert.assertEquals("abc", util.coalesce(target, "abc"));
    }
}
