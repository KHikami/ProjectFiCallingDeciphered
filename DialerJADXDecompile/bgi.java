import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class bgi implements bfx {
    private final String a;
    private final boolean b;
    private final byte[] c;
    private Integer d;

    public bgi(String str, byte[] bArr, boolean z) {
        this.d = null;
        this.a = str;
        this.c = bArr;
        this.b = z;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/photo");
        newInsert.withValue("data15", this.c);
        if (this.b) {
            newInsert.withValue("is_primary", Integer.valueOf(1));
        }
        list.add(newInsert.build());
    }

    public final boolean a() {
        return this.c == null || this.c.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgi)) {
            return false;
        }
        bgi bgi = (bgi) obj;
        if (TextUtils.equals(this.a, bgi.a) && Arrays.equals(this.c, bgi.c) && this.b == bgi.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        if (this.d != null) {
            return this.d.intValue();
        }
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.c != null) {
            byte[] bArr = this.c;
            while (i < bArr.length) {
                hashCode += bArr[i];
                i++;
            }
        }
        hashCode = (this.b ? 1231 : 1237) + (hashCode * 31);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final String toString() {
        return String.format("format: %s: size: %d, isPrimary: %s", new Object[]{this.a, Integer.valueOf(this.c.length), Boolean.valueOf(this.b)});
    }

    public final bfz b() {
        return bfz.PHOTO;
    }
}
