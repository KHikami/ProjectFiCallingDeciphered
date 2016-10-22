package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: bfw */
public final class bfw implements bfx {
    final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public bfw(String str, int i, String str2, boolean z) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = z;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/email_v2");
        newInsert.withValue("data2", Integer.valueOf(this.b));
        if (this.b == 0) {
            newInsert.withValue("data3", this.c);
        }
        newInsert.withValue("data1", this.a);
        if (this.d) {
            newInsert.withValue("is_primary", Integer.valueOf(1));
        }
        list.add(newInsert.build());
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfw)) {
            return false;
        }
        bfw bfw = (bfw) obj;
        if (this.b == bfw.b && TextUtils.equals(this.a, bfw.a) && TextUtils.equals(this.c, bfw.c) && this.d == bfw.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.b * 31;
        if (this.a != null) {
            hashCode = this.a.hashCode();
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
        return String.format("type: %d, data: %s, label: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.b), this.a, this.c, Boolean.valueOf(this.d)});
    }

    public final bfz b() {
        return bfz.EMAIL;
    }
}
