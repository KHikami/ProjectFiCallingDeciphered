package defpackage;

import android.text.TextUtils;
import java.util.List;

public final class akg implements ajw {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final String i;
    private boolean j;
    private int k;

    private akg(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, int i2) {
        this.h = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.i = str8;
        this.j = z;
        this.k = i2;
    }

    public static akg a(List<String> list, int i, String str, boolean z, int i2) {
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

    public String a(int i) {
        int i2 = 6;
        int i3 = 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g};
        Object obj;
        if (ajq.e(i)) {
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
        if (this.h == akg.h && ((this.h != 0 || TextUtils.equals(this.i, akg.i)) && this.j == akg.j && TextUtils.equals(this.a, akg.a) && TextUtils.equals(this.b, akg.b) && TextUtils.equals(this.c, akg.c) && TextUtils.equals(this.d, akg.d) && TextUtils.equals(this.e, akg.e) && TextUtils.equals(this.f, akg.f) && TextUtils.equals(this.g, akg.g))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.j ? 1231 : 1237) + (((this.i != null ? this.i.hashCode() : 0) + (this.h * 31)) * 31);
        String[] strArr = new String[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g};
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
        return String.format("type: %d, label: %s, isPrimary: %s, pobox: %s, extendedAddress: %s, street: %s, localty: %s, region: %s, postalCode %s, country: %s", new Object[]{Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final ajy a() {
        return ajy.POSTAL_ADDRESS;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public String j() {
        return this.i;
    }
}
