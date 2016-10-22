package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgd */
public final class bgd implements bfx {
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    public String k;

    public final void a(List list, int i) {
        Object obj = 1;
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/name");
        if (!TextUtils.isEmpty(this.b)) {
            newInsert.withValue("data2", this.b);
        }
        if (!TextUtils.isEmpty(this.a)) {
            newInsert.withValue("data3", this.a);
        }
        if (!TextUtils.isEmpty(this.c)) {
            newInsert.withValue("data5", this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            newInsert.withValue("data4", this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            newInsert.withValue("data6", this.e);
        }
        Object obj2 = null;
        if (!TextUtils.isEmpty(this.h)) {
            newInsert.withValue("data7", this.h);
            obj2 = 1;
        }
        if (!TextUtils.isEmpty(this.g)) {
            newInsert.withValue("data9", this.g);
            obj2 = 1;
        }
        if (TextUtils.isEmpty(this.i)) {
            obj = obj2;
        } else {
            newInsert.withValue("data8", this.i);
        }
        if (obj == null) {
            newInsert.withValue("data7", this.j);
        }
        newInsert.withValue("data1", this.k);
        list.add(newInsert.build());
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.h) && TextUtils.isEmpty(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgd)) {
            return false;
        }
        bgd bgd = (bgd) obj;
        if (TextUtils.equals(this.a, bgd.a) && TextUtils.equals(this.c, bgd.c) && TextUtils.equals(this.b, bgd.b) && TextUtils.equals(this.d, bgd.d) && TextUtils.equals(this.e, bgd.e) && TextUtils.equals(this.f, bgd.f) && TextUtils.equals(this.g, bgd.g) && TextUtils.equals(this.i, bgd.i) && TextUtils.equals(this.h, bgd.h) && TextUtils.equals(this.j, bgd.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String[] strArr = new String[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.i, this.h, this.j};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            String str = strArr[i];
            int i3 = i2 * 31;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            i++;
            i2 = i3 + i2;
        }
        return i2;
    }

    public final String toString() {
        return String.format("family: %s, given: %s, middle: %s, prefix: %s, suffix: %s", new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final bfz b() {
        return bfz.NAME;
    }
}
