import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
public final class bgm implements bfx {
    private final String a;

    public bgm(String str) {
        this.a = str;
    }

    public final void a(List list, int i) {
        Builder newInsert = ContentProviderOperation.newInsert(Data.CONTENT_URI);
        newInsert.withValueBackReference("raw_contact_id", i);
        newInsert.withValue("mimetype", "vnd.android.cursor.item/website");
        newInsert.withValue("data1", this.a);
        newInsert.withValue("data2", Integer.valueOf(1));
        list.add(newInsert.build());
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm)) {
            return false;
        }
        return TextUtils.equals(this.a, ((bgm) obj).a);
    }

    public final int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }

    public final String toString() {
        String str = "website: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final bfz b() {
        return bfz.WEBSITE;
    }
}
