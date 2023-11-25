package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0007;
import com.github.catvod.spider.C0039;
import com.github.catvod.spider.C0031;
import android.os.Build;

public class C0022{ 
  public static String m587() {
    if (C0031.m763() > 0) {
      return Build.VERSION.RELEASE;
    }
    return null;
  }
      public static String m597() {
        if (m590() <= 0) {
            return Build.MODEL;
        }
        return null;
    }
    public static int m590() {
        return (-1748828) ^ C0039.m876((Object) "ۡۧۤ");
    }
        public static String m591() {
        if (C0007.m111() >= 0) {
            return Build.BRAND;
        }
        return null;
    }
}

