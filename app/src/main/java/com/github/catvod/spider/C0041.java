package com.github.catvod.spider;
import com.github.catvod.parser.C0010;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.Iterator;
import okhttp3.ResponseBody;

public class C0041 {
public static String m899(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
public static StringBuilder m893(Object obj, Object obj2) {
        if (C0010.m161() < 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

}
