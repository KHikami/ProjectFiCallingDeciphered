package p000;

import android.text.TextUtils;
import java.util.List;

public final class akg implements ajw {
    private final String f1107a;
    private final String f1108b;
    private final String f1109c;
    private final String f1110d;
    private final String f1111e;
    private final String f1112f;
    private final String f1113g;
    private final int f1114h;
    private final String f1115i;
    private boolean f1116j;
    private int f1117k;

    private akg(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, int i2) {
        this.f1114h = i;
        this.f1107a = str;
        this.f1108b = str2;
        this.f1109c = str3;
        this.f1110d = str4;
        this.f1111e = str5;
        this.f1112f = str6;
        this.f1113g = str7;
        this.f1115i = str8;
        this.f1116j = z;
        this.f1117k = i2;
    }

    public static akg m2700a(List<String> list, int i, String str, boolean z, int i2) {
        int i3;
        String[] strArr = new String[7];
        int size = list.size();
        if (size > 7) {
            i3 = 7;
        } else {
            i3 = size;
        }
        int i4 = 0;
        for (String str2 : list) {
            strArr[i4] = str2;
            size = i4 + 1;
            if (size >= i3) {
                break;
            }
            i4 = size;
        }
        size = i4;
        while (size < 7) {
            i4 = size + 1;
            strArr[size] = null;
            size = i4;
        }
        return new akg(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5], strArr[6], i, str, z, i2);
    }

    public String m2702a(int i) {
        int i2 = 6;
        int i3 = 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[]{this.f1107a, this.f1108b, this.f1109c, this.f1110d, this.f1111e, this.f1112f, this.f1113g};
        Object obj;
        if (ajq.m2648e(i)) {
            while (i2 >= 0) {
                obj = strArr[i2];
                if (!TextUtils.isEmpty(obj)) {
                    if (i3 == 0) {
                        stringBuilder.append(' ');
                    } else {
                        i3 = 0;
                    }
                    stringBuilder.append(obj);
                }
                i2--;
            }
        } else {
            for (i2 = 0; i2 < 7; i2++) {
                obj = strArr[i2];
                if (!TextUtils.isEmpty(obj)) {
                    if (i3 == 0) {
                        stringBuilder.append(' ');
                    } else {
                        i3 = 0;
                    }
                    stringBuilder.append(obj);
                }
            }
        }
        return stringBuilder.toString().trim();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akg)) {
            return false;
        }
        akg akg = (akg) obj;
        if (this.f1114h == akg.f1114h && ((this.f1114h != 0 || TextUtils.equals(this.f1115i, akg.f1115i)) && this.f1116j == akg.f1116j && TextUtils.equals(this.f1107a, akg.f1107a) && TextUtils.equals(this.f1108b, akg.f1108b) && TextUtils.equals(this.f1109c, akg.f1109c) && TextUtils.equals(this.f1110d, akg.f1110d) && TextUtils.equals(this.f1111e, akg.f1111e) && TextUtils.equals(this.f1112f, akg.f1112f) && TextUtils.equals(this.f1113g, akg.f1113g))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f1116j ? 1231 : 1237) + (((this.f1115i != null ? this.f1115i.hashCode() : 0) + (this.f1114h * 31)) * 31);
        String[] strArr = new String[]{this.f1107a, this.f1108b, this.f1109c, this.f1110d, this.f1111e, this.f1112f, this.f1113g};
        int i = 0;
        while (i < 7) {
            String str = strArr[i];
            int i2 = hashCode * 31;
            if (str != null) {
                hashCode = str.hashCode();
            } else {
                hashCode = 0;
            }
            i++;
            hashCode = i2 + hashCode;
        }
        return hashCode;
    }

    public String toString() {
        return String.format("type: %d, label: %s, isPrimary: %s, pobox: %s, extendedAddress: %s, street: %s, localty: %s, region: %s, postalCode %s, country: %s", new Object[]{Integer.valueOf(this.f1114h), this.f1115i, Boolean.valueOf(this.f1116j), this.f1107a, this.f1108b, this.f1109c, this.f1110d, this.f1111e, this.f1112f, this.f1113g});
    }

    public final ajy mo229a() {
        return ajy.POSTAL_ADDRESS;
    }

    public String m2703b() {
        return this.f1107a;
    }

    public String m2704c() {
        return this.f1108b;
    }

    public String m2705d() {
        return this.f1109c;
    }

    public String m2706e() {
        return this.f1110d;
    }

    public String m2707f() {
        return this.f1111e;
    }

    public String m2708g() {
        return this.f1112f;
    }

    public String m2709h() {
        return this.f1113g;
    }

    public int m2710i() {
        return this.f1114h;
    }

    public String m2711j() {
        return this.f1115i;
    }
}
