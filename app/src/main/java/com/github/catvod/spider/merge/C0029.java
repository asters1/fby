package com.github.catvod.spider.merge;

public class C0029 {  
  public static String m710(short[] sArr, int i, int i2, int i3) {
    char[] cArr = new char[i2];
    for (int i4 = 0; i4 < i2; i4++) {
      cArr[i4] = (char) (sArr[i + i4] ^ i3);
    }
    return new String(cArr);
  }
}

