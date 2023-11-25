package com.github.catvod.spider;
import com.github.catvod.spider.merge.C0025;

import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
public class C0035 {
  public static int m821() {
        return (-1748775) ^ C0039.m876((Object) "ۡۤ۠");
    }

  public static String m827(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
