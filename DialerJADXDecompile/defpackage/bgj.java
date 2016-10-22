package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgj */
public final class bgj implements bfx {
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

    private bgj(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, int i2) {
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

    public static bgj a(List list, int i, String str, boolean z, int i2) {
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
        return new bgj(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5], strArr[6], i, str, z, i2);
    }

    public final void a(List list, int i) {
        Object obj;
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/postal-address_v2");
        newInsert.withValue("data2", Integer.valueOf(this.h));
        if (this.h == 0) {
            newInsert.withValue("data3", this.i);
        }
        if (TextUtils.isEmpty(this.c)) {
            if (TextUtils.isEmpty(this.b)) {
                obj = null;
            } else {
                obj = this.b;
            }
        } else if (TextUtils.isEmpty(this.b)) {
            obj = this.c;
        } else {
            String str = this.c;
            String str2 = this.b;
            obj = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
        }
        newInsert.withValue("data5", this.a);
        newInsert.withValue("data4", obj);
        newInsert.withValue("data7", this.d);
        newInsert.withValue("data8", this.e);
        newInsert.withValue("data9", this.f);
        newInsert.withValue("data10", this.g);
        newInsert.withValue("data1", a(this.k));
        if (this.j) {
            newInsert.withValue("is_primary", Integer.valueOf(1));
        }
        list.add(newInsert.build());
    }

    public final String a(int i) {
        int i2 = 6;
        int i3 = 1;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g};
        Object obj;
        if (bfr.j(i)) {
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

    public final boolean a() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgj)) {
            return false;
        }
        bgj bgj = (bgj) obj;
        if (this.h == bgj.h && ((this.h != 0 || TextUtils.equals(this.i, bgj.i)) && this.j == bgj.j && TextUtils.equals(this.a, bgj.a) && TextUtils.equals(this.b, bgj.b) && TextUtils.equals(this.c, bgj.c) && TextUtils.equals(this.d, bgj.d) && TextUtils.equals(this.e, bgj.e) && TextUtils.equals(this.f, bgj.f) && TextUtils.equals(this.g, bgj.g))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
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

    public final String toString() {
        return String.format("type: %d, label: %s, isPrimary: %s, pobox: %s, extendedAddress: %s, street: %s, localty: %s, region: %s, postalCode %s, country: %s", new Object[]{Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final bfz b() {
        return bfz.POSTAL_ADDRESS;
    }
}
