package com.github.catvod.spider;

public class C0039 {
  public static int m876(Object obj) {
    return obj.hashCode();
  }
  public static String m875(short[] sArr, int i, int i2, int i3) {
    char[] cArr = new char[i2];
    for (int i4 = 0; i4 < i2; i4++) {
      cArr[i4] = (char) (sArr[i + i4] ^ i3);
    }
    return new String(cArr);
  }
  public static int m874() {
        return (-1746926) ^ m876((Object) "۟ۥۨ");
    }



}
