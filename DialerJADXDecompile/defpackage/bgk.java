package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgk */
public final class bgk implements bfx {
    private final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public bgk(String str, int i, String str2, boolean z) {
        if (str.startsWith("sip:")) {
            this.a = str.substring(4);
        } else {
            this.a = str;
        }
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/sip_address");
        newInsert.withValue("data1", this.a);
        newInsert.withValue("data2", Integer.valueOf(this.b));
        if (this.b == 0) {
            newInsert.withValue("data3", this.c);
        }
        if (this.d) {
            newInsert.withValue("is_primary", Boolean.valueOf(this.d));
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
        if (!(obj instanceof bgk)) {
            return false;
        }
        bgk bgk = (bgk) obj;
        if (this.b == bgk.b && TextUtils.equals(this.c, bgk.c) && TextUtils.equals(this.a, bgk.a) && this.d == bgk.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = this.b * 31;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return (this.d ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public final String toString() {
        String str = "sip: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final bfz b() {
        return bfz.SIP;
    }
}
