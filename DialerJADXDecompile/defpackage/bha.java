package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bha */
public final class bha {
    static final Map a;
    static final Set b;
    static final Map c;
    private static final Map d;
    private static final Set e;
    private static final Set f;
    private static final int[] g;
    private static final int[] h;

    static {
        a = new HashMap();
        d = new HashMap();
        a.put(Integer.valueOf(9), "CAR");
        d.put("CAR", Integer.valueOf(9));
        a.put(Integer.valueOf(6), "PAGER");
        d.put("PAGER", Integer.valueOf(6));
        a.put(Integer.valueOf(11), "ISDN");
        d.put("ISDN", Integer.valueOf(11));
        d.put("HOME", Integer.valueOf(1));
        d.put("WORK", Integer.valueOf(3));
        d.put("CELL", Integer.valueOf(2));
        d.put("OTHER", Integer.valueOf(7));
        d.put("CALLBACK", Integer.valueOf(8));
        d.put("COMPANY-MAIN", Integer.valueOf(10));
        d.put("RADIO", Integer.valueOf(14));
        d.put("TTY-TDD", Integer.valueOf(16));
        d.put("ASSISTANT", Integer.valueOf(19));
        d.put("VOICE", Integer.valueOf(7));
        Set hashSet = new HashSet();
        b = hashSet;
        hashSet.add("MODEM");
        b.add("MSG");
        b.add("BBS");
        b.add("VIDEO");
        Map hashMap = new HashMap();
        c = hashMap;
        hashMap.put(Integer.valueOf(0), "X-AIM");
        c.put(Integer.valueOf(1), "X-MSN");
        c.put(Integer.valueOf(2), "X-YAHOO");
        c.put(Integer.valueOf(3), "X-SKYPE-USERNAME");
        c.put(Integer.valueOf(5), "X-GOOGLE-TALK");
        c.put(Integer.valueOf(6), "X-ICQ");
        c.put(Integer.valueOf(7), "X-JABBER");
        c.put(Integer.valueOf(4), "X-QQ");
        c.put(Integer.valueOf(8), "X-NETMEETING");
        e = new HashSet(Arrays.asList(new String[]{"MOBILE", "\u643a\u5e2f\u96fb\u8a71", "\u643a\u5e2f", "\u30b1\u30a4\u30bf\u30a4", "\uff79\uff72\uff80\uff72"}));
        f = new HashSet(Arrays.asList(new Character[]{Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ')}));
        g = new int[]{58, 59, 44, 32};
        h = new int[]{59, 58};
    }

    public static Object a(Collection collection, String str) {
        Object obj;
        Object obj2;
        int intValue;
        Object obj3;
        if (str == null) {
            str = "";
        }
        int i = -1;
        String str2 = null;
        if (collection != null) {
            obj = null;
            obj2 = null;
            for (String str3 : collection) {
                String str32;
                if (str32 != null) {
                    String toUpperCase = str32.toUpperCase();
                    if (toUpperCase.equals("PREF")) {
                        obj = 1;
                    } else if (toUpperCase.equals("FAX")) {
                        obj2 = 1;
                    } else {
                        if (!toUpperCase.startsWith("X-") || i >= 0) {
                            toUpperCase = str32;
                        } else {
                            toUpperCase = str32.substring(2);
                        }
                        if (toUpperCase.length() != 0) {
                            Integer num = (Integer) d.get(toUpperCase.toUpperCase());
                            if (num != null) {
                                intValue = num.intValue();
                                int indexOf = str.indexOf("@");
                                if ((intValue == 6 && indexOf > 0 && indexOf < str.length() - 1) || i < 0 || i == 0 || i == 7) {
                                    i = num.intValue();
                                }
                            } else {
                                if (i < 0) {
                                    str32 = toUpperCase;
                                    intValue = 0;
                                } else {
                                    str32 = str2;
                                    intValue = i;
                                }
                                str2 = str32;
                                i = intValue;
                            }
                        }
                    }
                }
            }
            obj3 = str2;
            intValue = i;
        } else {
            obj = null;
            obj2 = null;
            obj3 = null;
            intValue = -1;
        }
        if (intValue < 0) {
            if (obj != null) {
                intValue = 12;
            } else {
                intValue = 1;
            }
        }
        if (obj2 != null) {
            if (intValue == 1) {
                intValue = 5;
            } else if (intValue == 3) {
                intValue = 4;
            } else if (intValue == 7) {
                intValue = 13;
            }
        }
        return intValue == 0 ? obj3 : Integer.valueOf(intValue);
    }

    public static boolean a(String str) {
        return "_AUTO_CELL".equals(str) || e.contains(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] b(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
        r6 = 2;
        r2 = 1;
        r1 = 0;
        r0 = 3;
        r3 = new java.lang.String[r0];
        r0 = defpackage.bfr.e(r7);
        switch(r0) {
            case 4: goto L_0x0071;
            case 8: goto L_0x0014;
            default: goto L_0x000d;
        };
    L_0x000d:
        r3[r1] = r10;
        r3[r2] = r9;
        r3[r6] = r8;
    L_0x0013:
        return r3;
    L_0x0014:
        r0 = new java.lang.String[r2];
        r0[r1] = r8;
        r0 = java.util.Arrays.asList(r0);
        if (r0 == 0) goto L_0x006d;
    L_0x001e:
        r4 = r0.iterator();
    L_0x0022:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x006d;
    L_0x0028:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x0022;
    L_0x0034:
        r0 = defpackage.buf.g(r0);
        if (r0 != 0) goto L_0x0022;
    L_0x003a:
        r0 = r1;
    L_0x003b:
        if (r0 == 0) goto L_0x0066;
    L_0x003d:
        r0 = new java.lang.String[r2];
        r0[r1] = r10;
        r0 = java.util.Arrays.asList(r0);
        if (r0 == 0) goto L_0x006f;
    L_0x0047:
        r4 = r0.iterator();
    L_0x004b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x006f;
    L_0x0051:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x004b;
    L_0x005d:
        r0 = defpackage.buf.g(r0);
        if (r0 != 0) goto L_0x004b;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        if (r0 != 0) goto L_0x000d;
    L_0x0066:
        r3[r1] = r8;
        r3[r2] = r9;
        r3[r6] = r10;
        goto L_0x0013;
    L_0x006d:
        r0 = r2;
        goto L_0x003b;
    L_0x006f:
        r0 = r2;
        goto L_0x0064;
    L_0x0071:
        r3[r1] = r9;
        r3[r2] = r10;
        r3[r6] = r8;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: bha.b(int, java.lang.String, java.lang.String, java.lang.String):java.lang.String[]");
    }

    public static int a(int i) {
        if (bfr.j(i)) {
            return 2;
        }
        return 1;
    }

    public static String a(int i, String str, String str2, String str3) {
        return bha.a(i, str, str2, str3, null, null);
    }

    public static String a(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] b = bha.b(i, str, str2, str3);
        Object obj = 1;
        if (!TextUtils.isEmpty(str4)) {
            stringBuilder.append(str4);
            obj = null;
        }
        for (Object obj2 : b) {
            if (!TextUtils.isEmpty(obj2)) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(obj2);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            if (obj == null) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str5);
        }
        return stringBuilder.toString();
    }

    public static List a(String str, int i) {
        List arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3;
            StringBuilder stringBuilder2;
            char charAt = str.charAt(i2);
            if (charAt == '\\' && i2 < length - 1) {
                String str2;
                char charAt2 = str.charAt(i2 + 1);
                if (bfr.c(i)) {
                    if (charAt2 == 'n' || charAt2 == 'N') {
                        str2 = "\n";
                    } else {
                        str2 = String.valueOf(charAt2);
                    }
                } else if (!bfr.b(i)) {
                    if (!bfr.a(i)) {
                        Log.w("vCard", "Unknown vCard type");
                    }
                    if (charAt2 == '\\' || charAt2 == ';' || charAt2 == ':' || charAt2 == ',') {
                        str2 = String.valueOf(charAt2);
                    } else {
                        str2 = null;
                    }
                } else if (charAt2 == 'n' || charAt2 == 'N') {
                    str2 = "\n";
                } else {
                    str2 = String.valueOf(charAt2);
                }
                if (str2 != null) {
                    stringBuilder.append(str2);
                    i3 = i2 + 1;
                    stringBuilder2 = stringBuilder;
                } else {
                    stringBuilder.append(charAt);
                    i3 = i2;
                    stringBuilder2 = stringBuilder;
                }
            } else if (charAt == ';') {
                arrayList.add(stringBuilder.toString());
                int i4 = i2;
                stringBuilder2 = new StringBuilder();
                i3 = i4;
            } else {
                stringBuilder.append(charAt);
                i3 = i2;
                stringBuilder2 = stringBuilder;
            }
            stringBuilder = stringBuilder2;
            i2 = i3 + 1;
        }
        arrayList.add(stringBuilder.toString());
        return arrayList;
    }

    public static boolean a(String... strArr) {
        Collection<CharSequence> asList = Arrays.asList(strArr);
        if (asList != null) {
            for (CharSequence charSequence : asList) {
                if (!TextUtils.isEmpty(charSequence) && !buf.g(charSequence)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(String... strArr) {
        return bha.a(Arrays.asList(strArr));
    }

    public static boolean a(Collection collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                    int codePointAt = str.codePointAt(i);
                    if (32 > codePointAt || codePointAt > 126) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    public static boolean c(String... strArr) {
        Collection<String> asList = Arrays.asList(strArr);
        if (asList != null) {
            for (String str : asList) {
                if (!TextUtils.isEmpty(str)) {
                    int length = str.length();
                    for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                        int codePointAt = str.codePointAt(i);
                        if ((97 > codePointAt || codePointAt >= 123) && ((65 > codePointAt || codePointAt >= 91) && ((48 > codePointAt || codePointAt >= 58) && codePointAt != 45))) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return true;
    }

    private static boolean e(String... strArr) {
        Collection<String> asList = Arrays.asList(strArr);
        if (asList != null) {
            for (String str : asList) {
                if (!TextUtils.isEmpty(str)) {
                    int length = str.length();
                    for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                        if (!Character.isWhitespace(str.codePointAt(i))) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (32 > codePointAt || codePointAt > 126 || f.contains(Character.valueOf((char) codePointAt))) {
                return false;
            }
            i = str.offsetByCodePoints(i, 1);
        }
        return true;
    }

    public static String c(String str) {
        return bha.a(str, g);
    }

    public static String d(String str) {
        return bha.a(str, h);
    }

    private static String a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2 = str.offsetByCodePoints(i2, 1)) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt >= 32 && codePointAt != 34) {
                stringBuilder.appendCodePoint(codePointAt);
                for (int i3 : iArr) {
                    if (codePointAt == i3) {
                        i = 1;
                        break;
                    }
                }
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        if (!stringBuilder2.isEmpty()) {
            if (!bha.e(stringBuilder2)) {
                return i != 0 ? new StringBuilder(String.valueOf(stringBuilder2).length() + 2).append("\"").append(stringBuilder2).append("\"").toString() : stringBuilder2;
            }
        }
        return "";
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            String str2;
            char charAt = str.charAt(i);
            if (bfm.a.containsKey(Character.valueOf(charAt))) {
                str2 = (String) bfm.a.get(Character.valueOf(charAt));
            } else {
                str2 = null;
            }
            if (str2 != null) {
                stringBuilder.append(str2);
            } else {
                stringBuilder.append(charAt);
            }
            i = str.offsetByCodePoints(i, 1);
        }
        return stringBuilder.toString();
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 3 && bArr[0] == (byte) 71 && bArr[1] == 73 && bArr[2] == 70) {
            return "GIF";
        }
        if (bArr.length >= 4 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == (byte) 71) {
            return "PNG";
        }
        if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40) {
            return "JPEG";
        }
        return null;
    }

    public static boolean d(String... strArr) {
        for (CharSequence isEmpty : strArr) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str) {
        int length = str.length() % 3;
        if (str.length() < 2) {
            return false;
        }
        if (length != 1 && length != 0) {
            return false;
        }
        for (length = 0; length < str.length(); length += 3) {
            if (str.charAt(length) != '=') {
                return false;
            }
        }
        return true;
    }

    public static String a(String str, boolean z, String str2, String str3) {
        String substring;
        byte[] bytes;
        byte[] a;
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '=' && i < length - 1) {
                char charAt2 = str.charAt(i + 1);
                if (charAt2 == ' ' || charAt2 == '\t') {
                    stringBuilder.append(charAt2);
                    i++;
                    i++;
                }
            }
            stringBuilder.append(charAt);
            i++;
        }
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        int length2 = stringBuilder2.length();
        ArrayList arrayList = new ArrayList();
        i = 0;
        while (i < length2) {
            char charAt3 = stringBuilder2.charAt(i);
            if (charAt3 == '\n') {
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            } else if (charAt3 == '\r') {
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                if (i < length2 - 1 && stringBuilder2.charAt(i + 1) == '\n') {
                    i++;
                }
            } else {
                stringBuilder.append(charAt3);
            }
            i++;
        }
        String stringBuilder3 = stringBuilder.toString();
        if (stringBuilder3.length() > 0) {
            arrayList.add(stringBuilder3);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        StringBuilder stringBuilder4 = new StringBuilder();
        for (String substring2 : strArr) {
            if (substring2.endsWith("=")) {
                substring2 = substring2.substring(0, substring2.length() - 1);
            }
            stringBuilder4.append(substring2);
        }
        substring2 = stringBuilder4.toString();
        if (TextUtils.isEmpty(substring2)) {
            Log.w("vCard", "Given raw string is empty.");
        }
        try {
            bytes = substring2.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            stringBuilder2 = "vCard";
            String str4 = "Failed to decode: ";
            stringBuilder3 = String.valueOf(str2);
            Log.w(stringBuilder2, stringBuilder3.length() != 0 ? str4.concat(stringBuilder3) : new String(str4));
            bytes = substring2.getBytes();
        }
        try {
            a = bhc.a(bytes);
        } catch (bhb e2) {
            Log.e("vCard", "DecoderException is thrown.");
            a = bytes;
        }
        try {
            return new String(a, str3);
        } catch (UnsupportedEncodingException e3) {
            stringBuilder2 = "vCard";
            str4 = "Failed to encode: charset=";
            stringBuilder3 = String.valueOf(str3);
            Log.e(stringBuilder2, stringBuilder3.length() != 0 ? str4.concat(stringBuilder3) : new String(str4));
            return new String(a);
        }
    }

    public static final String a(String str, String str2, String str3) {
        if (str2.equalsIgnoreCase(str3)) {
            return str;
        }
        ByteBuffer encode = Charset.forName(str2).encode(str);
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        try {
            return new String(bArr, str3);
        } catch (UnsupportedEncodingException e) {
            String str4 = "vCard";
            String str5 = "Failed to encode: charset=";
            String valueOf = String.valueOf(str3);
            Log.e(str4, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
            return null;
        }
    }
}
