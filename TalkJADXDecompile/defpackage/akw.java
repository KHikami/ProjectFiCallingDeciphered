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

/* renamed from: akw */
public final class akw {
    private static final Map<Integer, String> a;
    private static final Set<String> b;
    private static final Map<String, Integer> c;
    private static final Map<Integer, String> d;
    private static final Set<String> e;
    private static final Set<Character> f;
    private static final int[] g;
    private static final int[] h;

    static {
        a = new HashMap();
        c = new HashMap();
        a.put(Integer.valueOf(9), "CAR");
        c.put("CAR", Integer.valueOf(9));
        a.put(Integer.valueOf(6), "PAGER");
        c.put("PAGER", Integer.valueOf(6));
        a.put(Integer.valueOf(11), "ISDN");
        c.put("ISDN", Integer.valueOf(11));
        c.put("HOME", Integer.valueOf(1));
        c.put("WORK", Integer.valueOf(3));
        c.put("CELL", Integer.valueOf(2));
        c.put("OTHER", Integer.valueOf(7));
        c.put("CALLBACK", Integer.valueOf(8));
        c.put("COMPANY-MAIN", Integer.valueOf(10));
        c.put("RADIO", Integer.valueOf(14));
        c.put("TTY-TDD", Integer.valueOf(16));
        c.put("ASSISTANT", Integer.valueOf(19));
        c.put("VOICE", Integer.valueOf(7));
        Set hashSet = new HashSet();
        b = hashSet;
        hashSet.add("MODEM");
        b.add("MSG");
        b.add("BBS");
        b.add("VIDEO");
        Map hashMap = new HashMap();
        d = hashMap;
        hashMap.put(Integer.valueOf(0), "X-AIM");
        d.put(Integer.valueOf(1), "X-MSN");
        d.put(Integer.valueOf(2), "X-YAHOO");
        d.put(Integer.valueOf(3), "X-SKYPE-USERNAME");
        d.put(Integer.valueOf(5), "X-GOOGLE-TALK");
        d.put(Integer.valueOf(6), "X-ICQ");
        d.put(Integer.valueOf(7), "X-JABBER");
        d.put(Integer.valueOf(4), "X-QQ");
        d.put(Integer.valueOf(8), "X-NETMEETING");
        e = new HashSet(Arrays.asList(new String[]{"MOBILE", "\u643a\u5e2f\u96fb\u8a71", "\u643a\u5e2f", "\u30b1\u30a4\u30bf\u30a4", "\uff79\uff72\uff80\uff72"}));
        f = new HashSet(Arrays.asList(new Character[]{Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ')}));
        g = new int[]{58, 59, 44, 32};
        h = new int[]{59, 58};
    }

    public static Object a(Collection<String> collection, String str) {
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
                            Integer num = (Integer) c.get(toUpperCase.toUpperCase());
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] b(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
        r6 = 2;
        r2 = 1;
        r1 = 0;
        r0 = 3;
        r3 = new java.lang.String[r0];
        r0 = defpackage.ajq.d(r7);
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
        r0 = defpackage.gwb.a(r0);
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
        r0 = defpackage.gwb.a(r0);
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
        throw new UnsupportedOperationException("Method not decompiled: akw.b(int, java.lang.String, java.lang.String, java.lang.String):java.lang.String[]");
    }

    public static int a(int i) {
        if (ajq.e(i)) {
            return 2;
        }
        return 1;
    }

    public static String a(int i, String str, String str2, String str3) {
        return akw.a(i, str, str2, str3, null, null);
    }

    public static String a(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] b = akw.b(i, str, str2, str3);
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

    public static List<String> a(String str, int i) {
        List<String> arrayList = new ArrayList();
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
                if (ajq.c(i)) {
                    if (charAt2 == 'n' || charAt2 == 'N') {
                        str2 = "\n";
                    } else {
                        str2 = String.valueOf(charAt2);
                    }
                } else if (!ajq.b(i)) {
                    ajq.a(i);
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

    public static boolean a(String str) {
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
        for (String str4 : strArr) {
            String str42;
            if (str42.endsWith("=")) {
                str42 = str42.substring(0, str42.length() - 1);
            }
            stringBuilder4.append(str42);
        }
        stringBuilder3 = stringBuilder4.toString();
        TextUtils.isEmpty(stringBuilder3);
        try {
            bytes = stringBuilder3.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            str42 = "Failed to decode: ";
            stringBuilder2 = String.valueOf(str2);
            if (stringBuilder2.length() != 0) {
                str42.concat(stringBuilder2);
            } else {
                stringBuilder2 = new String(str42);
            }
            bytes = stringBuilder3.getBytes();
        }
        try {
            a = aky.a(bytes);
        } catch (akx e2) {
            Log.e("vCard", "DecoderException is thrown.");
            a = bytes;
        }
        try {
            return new String(a, str3);
        } catch (UnsupportedEncodingException e3) {
            stringBuilder2 = "vCard";
            String str5 = "Failed to encode: charset=";
            stringBuilder3 = String.valueOf(str3);
            Log.e(stringBuilder2, stringBuilder3.length() != 0 ? str5.concat(stringBuilder3) : new String(str5));
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
