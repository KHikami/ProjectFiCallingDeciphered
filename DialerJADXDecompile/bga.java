import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
public final class bga implements bfx {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final boolean e;

    public bga(int i, String str, String str2, int i2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.a = str2;
        this.e = z;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/im");
        newInsert.withValue("data2", Integer.valueOf(this.d));
        newInsert.withValue("data5", Integer.valueOf(this.b));
        newInsert.withValue("data1", this.a);
        if (this.b == -1) {
            newInsert.withValue("data6", this.c);
        }
        if (this.e) {
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
        if (!(obj instanceof bga)) {
            return false;
        }
        bga bga = (bga) obj;
        if (this.d == bga.d && this.b == bga.b && TextUtils.equals(this.c, bga.c) && TextUtils.equals(this.a, bga.a) && this.e == bga.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int i2 = ((this.d * 31) + this.b) * 31;
        if (this.c != null) {
            hashCode = this.c.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return (this.e ? 1231 : 1237) + ((hashCode + i) * 31);
    }

    public final String toString() {
        return String.format("type: %d, protocol: %d, custom_protcol: %s, data: %s, isPrimary: %s", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.b), this.c, this.a, Boolean.valueOf(this.e)});
    }

    public final bfz b() {
        return bfz.IM;
    }
}
