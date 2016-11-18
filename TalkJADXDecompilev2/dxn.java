package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.DataUsageFeedback;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

final class dxn implements dwv {
    private final ehz a;
    private final ContentResolver b;

    dxn(Context context) {
        this.a = (ehz) jyn.a(context, ehz.class);
        this.b = context.getContentResolver();
    }

    public void a(int i, String str) {
        if (this.a.a("android.permission.WRITE_CONTACTS")) {
            Builder buildUpon = dwz.g.buildUpon();
            buildUpon.appendQueryParameter("account_id", Integer.toString(i));
            buildUpon.appendQueryParameter("gaia_id", str);
            dxb dxb = new dxb(null, this.b.query(buildUpon.build(), dxa.c(), null, null, null));
            while (dxb.moveToNext()) {
                bjg a = dxb.a();
                if (!TextUtils.isEmpty(a.p())) {
                    if (a.d().isEmpty()) {
                        try {
                            if (!a.b().isEmpty()) {
                                a(a.p(), ((bjo) a.b().iterator().next()).c());
                            }
                        } finally {
                            dxb.close();
                        }
                    } else {
                        String p = a.p();
                        String c = ((bje) a.d().iterator().next()).c();
                        Cursor query = this.b.query(Email.CONTENT_URI, new String[]{"_id"}, "contact_id=? and data1=?", new String[]{p, c}, null);
                        if (query.moveToNext()) {
                            this.b.update(DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(query.getString(0)).appendQueryParameter("type", "short_text").build(), new ContentValues(), null, null);
                        }
                        query.close();
                    }
                } else {
                    return;
                }
            }
            dxb.close();
        }
    }

    public void a(String str) {
        if (this.a.a("android.permission.WRITE_CONTACTS")) {
            a(null, str);
        }
    }

    private void a(String str, String str2) {
        Cursor query;
        if (str != null) {
            query = this.b.query(Phone.CONTENT_URI, new String[]{"contact_id", "_id"}, "contact_id=? and data1=? or data4=?", new String[]{str, str2, str2}, null);
        } else {
            query = this.b.query(Phone.CONTENT_URI, new String[]{"contact_id", "_id"}, "data1=? or data4=?", new String[]{str2, str2}, null);
        }
        Set hashSet = new HashSet();
        while (query.moveToNext()) {
            String string = query.getString(0);
            String string2 = query.getString(1);
            if (!hashSet.contains(string)) {
                this.b.update(DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(string2).appendQueryParameter("type", "short_text").build(), new ContentValues(), null, null);
                hashSet.add(string);
            }
        }
        query.close();
    }
}
