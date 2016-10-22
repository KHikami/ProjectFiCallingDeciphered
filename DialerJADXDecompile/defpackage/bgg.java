package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgg */
public final class bgg implements bfx {
    String a;
    String b;
    String c;
    boolean d;
    private final String e;
    private final int f;

    public bgg(String str, String str2, String str3, String str4, int i, boolean z) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.d = z;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/organization");
        newInsert.withValue("data2", Integer.valueOf(this.f));
        if (this.a != null) {
            newInsert.withValue("data1", this.a);
        }
        if (this.b != null) {
            newInsert.withValue("data5", this.b);
        }
        if (this.c != null) {
            newInsert.withValue("data4", this.c);
        }
        if (this.e != null) {
            newInsert.withValue("data8", this.e);
        }
        if (this.d) {
            newInsert.withValue("is_primary", Integer.valueOf(1));
        }
        list.add(newInsert.build());
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgg)) {
            return false;
        }
        bgg bgg = (bgg) obj;
        if (this.f == bgg.f && TextUtils.equals(this.a, bgg.a) && TextUtils.equals(this.b, bgg.b) && TextUtils.equals(this.c, bgg.c) && this.d == bgg.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.f * 31;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        i2 = (hashCode + i2) * 31;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return (this.d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public final String toString() {
        return String.format("type: %d, organization: %s, department: %s, title: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.f), this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final bfz b() {
        return bfz.ORGANIZATION;
    }
}
