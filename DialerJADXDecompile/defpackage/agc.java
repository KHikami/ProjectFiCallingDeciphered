package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: agc */
public final class agc {
    private static final String[] a;
    private static final Uri b;
    private String c;
    private String d;

    static {
        a = new String[]{"_id"};
        b = RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1").build();
    }

    private agc(String str, String str2) {
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.c = str;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        this.d = str3;
    }

    public static agc a(String str, String str2) {
        return new agc(str, str2);
    }

    public final boolean a(Context context) {
        String str;
        String[] strArr;
        if (TextUtils.isEmpty(this.d)) {
            str = "account_type = ? AND data_set IS NULL";
            strArr = new String[]{this.c};
        } else {
            str = "account_type = ? AND data_set = ?";
            strArr = new String[]{this.c, this.d};
        }
        Cursor query = context.getContentResolver().query(b, a, str, strArr, null);
        if (query == null) {
            return false;
        }
        try {
            boolean moveToFirst = query.moveToFirst();
            return moveToFirst;
        } finally {
            query.close();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agc)) {
            return false;
        }
        agc agc = (agc) obj;
        if (Objects.equals(this.c, agc.c) && Objects.equals(this.d, agc.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.c == null ? 0 : this.c.hashCode();
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        return new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append("[").append(str).append("/").append(str2).append("]").toString();
    }
}
