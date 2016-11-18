package p000;

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

public final class akw {
    private static final Map<Integer, String> f1170a = new HashMap();
    private static final Set<String> f1171b;
    private static final Map<String, Integer> f1172c = new HashMap();
    private static final Map<Integer, String> f1173d;
    private static final Set<String> f1174e = new HashSet(Arrays.asList(new String[]{"MOBILE", "携帯電話", "携帯", "ケイタイ", "ｹｲﾀｲ"}));
    private static final Set<Character> f1175f = new HashSet(Arrays.asList(new Character[]{Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ')}));
    private static final int[] f1176g = new int[]{58, 59, 44, 32};
    private static final int[] f1177h = new int[]{59, 58};

    static {
        f1170a.put(Integer.valueOf(9), "CAR");
        f1172c.put("CAR", Integer.valueOf(9));
        f1170a.put(Integer.valueOf(6), "PAGER");
        f1172c.put("PAGER", Integer.valueOf(6));
        f1170a.put(Integer.valueOf(11), "ISDN");
        f1172c.put("ISDN", Integer.valueOf(11));
        f1172c.put("HOME", Integer.valueOf(1));
        f1172c.put("WORK", Integer.valueOf(3));
        f1172c.put("CELL", Integer.valueOf(2));
        f1172c.put("OTHER", Integer.valueOf(7));
        f1172c.put("CALLBACK", Integer.valueOf(8));
        f1172c.put("COMPANY-MAIN", Integer.valueOf(10));
        f1172c.put("RADIO", Integer.valueOf(14));
        f1172c.put("TTY-TDD", Integer.valueOf(16));
        f1172c.put("ASSISTANT", Integer.valueOf(19));
        f1172c.put("VOICE", Integer.valueOf(7));
        Set hashSet = new HashSet();
        f1171b = hashSet;
        hashSet.add("MODEM");
        f1171b.add("MSG");
        f1171b.add("BBS");
        f1171b.add("VIDEO");
        Map hashMap = new HashMap();
        f1173d = hashMap;
        hashMap.put(Integer.valueOf(0), "X-AIM");
        f1173d.put(Integer.valueOf(1), "X-MSN");
        f1173d.put(Integer.valueOf(2), "X-YAHOO");
        f1173d.put(Integer.valueOf(3), "X-SKYPE-USERNAME");
        f1173d.put(Integer.valueOf(5), "X-GOOGLE-TALK");
        f1173d.put(Integer.valueOf(6), "X-ICQ");
        f1173d.put(Integer.valueOf(7), "X-JABBER");
        f1173d.put(Integer.valueOf(4), "X-QQ");
        f1173d.put(Integer.valueOf(8), "X-NETMEETING");
    }

    public static Object m2815a(Collection<String> collection, String str) {
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
                            Integer num = (Integer) f1172c.get(toUpperCase.toUpperCase());
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
    private static String[] m2822b(int i, String str, String str2, String str3) {
        String[] strArr = new String[3];
        switch (ajq.m2647d(i)) {
            case 4:
                strArr[0] = str2;
                strArr[1] = str3;
                strArr[2] = str;
                break;
            case 8:
                int i2;
                Collection<CharSequence> asList = Arrays.asList(new String[]{str});
                if (asList != null) {
                    for (CharSequence charSequence : asList) {
                        if (!TextUtils.isEmpty(charSequence) && !gwb.m1930a(charSequence)) {
                            i2 = 0;
                            if (i2 != 0) {
                                asList = Arrays.asList(new String[]{str3});
                                if (asList != null) {
                                    for (CharSequence charSequence2 : asList) {
                                        if (TextUtils.isEmpty(charSequence2) && !gwb.m1930a(charSequence2)) {
                                            i2 = 0;
                                            break;
                                        }
                                    }
                                }
                                i2 = 1;
                                break;
                            }
                            strArr[0] = str;
                            strArr[1] = str2;
                            strArr[2] = str3;
                            break;
                        }
                    }
                }
                i2 = 1;
                if (i2 != 0) {
                    asList = Arrays.asList(new String[]{str3});
                    if (asList != null) {
                        for (CharSequence charSequence22 : asList) {
                            if (TextUtils.isEmpty(charSequence22)) {
                                break;
                            }
                        }
                    }
                    i2 = 1;
                }
                strArr[0] = str;
                strArr[1] = str2;
                strArr[2] = str3;
                break;
            default:
                strArr[0] = str3;
                strArr[1] = str2;
                strArr[2] = str;
                break;
        }
        return strArr;
    }

    public static int m2814a(int i) {
        if (ajq.m2648e(i)) {
            return 2;
        }
        return 1;
    }

    public static String m2816a(int i, String str, String str2, String str3) {
        return akw.m2817a(i, str, str2, str3, null, null);
    }

    public static String m2817a(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] b = akw.m2822b(i, str, str2, str3);
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

    public static List<String> m2820a(String str, int i) {
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
                if (ajq.m2646c(i)) {
                    if (charAt2 == 'n' || charAt2 == 'N') {
                        str2 = "\n";
                    } else {
                        str2 = String.valueOf(charAt2);
                    }
                } else if (!ajq.m2645b(i)) {
                    ajq.m2644a(i);
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

    public static boolean m2821a(String str) {
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

    public static String m2819a(String str, boolean z, String str2, String str3) {
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
        stringBuilder3 = stringBuilder4.toString();
        TextUtils.isEmpty(stringBuilder3);
        try {
            bytes = stringBuilder3.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            substring2 = "Failed to decode: ";
            stringBuilder2 = String.valueOf(str2);
            if (stringBuilder2.length() != 0) {
                substring2.concat(stringBuilder2);
            } else {
                stringBuilder2 = new String(substring2);
            }
            bytes = stringBuilder3.getBytes();
        }
        try {
            a = aky.m2823a(bytes);
        } catch (akx e2) {
            Log.e("vCard", "DecoderException is thrown.");
            a = bytes;
        }
        try {
            return new String(a, str3);
        } catch (UnsupportedEncodingException e3) {
            stringBuilder2 = "vCard";
            String str4 = "Failed to encode: charset=";
            stringBuilder3 = String.valueOf(str3);
            Log.e(stringBuilder2, stringBuilder3.length() != 0 ? str4.concat(stringBuilder3) : new String(str4));
            return new String(a);
        }
    }

    public static final String m2818a(String str, String str2, String str3) {
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
