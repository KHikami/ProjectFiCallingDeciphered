package p000;

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
    private final ehz f10765a;
    private final ContentResolver f10766b;

    dxn(Context context) {
        this.f10765a = (ehz) jyn.m25426a(context, ehz.class);
        this.f10766b = context.getContentResolver();
    }

    public void mo1746a(int i, String str) {
        if (this.f10765a.mo1882a("android.permission.WRITE_CONTACTS")) {
            Builder buildUpon = dwz.f6496g.buildUpon();
            buildUpon.appendQueryParameter("account_id", Integer.toString(i));
            buildUpon.appendQueryParameter("gaia_id", str);
            dxb dxb = new dxb(null, this.f10766b.query(buildUpon.build(), dxa.m12954c(), null, null, null));
            while (dxb.moveToNext()) {
                bjg a = dxb.mo592a();
                if (!TextUtils.isEmpty(a.mo582p())) {
                    if (a.mo570d().isEmpty()) {
                        try {
                            if (!a.mo568b().isEmpty()) {
                                m12980a(a.mo582p(), ((bjo) a.mo568b().iterator().next()).m5473c());
                            }
                        } finally {
                            dxb.close();
                        }
                    } else {
                        String p = a.mo582p();
                        String c = ((bje) a.mo570d().iterator().next()).m5365c();
                        Cursor query = this.f10766b.query(Email.CONTENT_URI, new String[]{"_id"}, "contact_id=? and data1=?", new String[]{p, c}, null);
                        if (query.moveToNext()) {
                            this.f10766b.update(DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(query.getString(0)).appendQueryParameter("type", "short_text").build(), new ContentValues(), null, null);
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

    public void mo1747a(String str) {
        if (this.f10765a.mo1882a("android.permission.WRITE_CONTACTS")) {
            m12980a(null, str);
        }
    }

    private void m12980a(String str, String str2) {
        Cursor query;
        if (str != null) {
            query = this.f10766b.query(Phone.CONTENT_URI, new String[]{"contact_id", "_id"}, "contact_id=? and data1=? or data4=?", new String[]{str, str2, str2}, null);
        } else {
            query = this.f10766b.query(Phone.CONTENT_URI, new String[]{"contact_id", "_id"}, "data1=? or data4=?", new String[]{str2, str2}, null);
        }
        Set hashSet = new HashSet();
        while (query.moveToNext()) {
            String string = query.getString(0);
            String string2 = query.getString(1);
            if (!hashSet.contains(string)) {
                this.f10766b.update(DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(string2).appendQueryParameter("type", "short_text").build(), new ContentValues(), null, null);
                hashSet.add(string);
            }
        }
        query.close();
    }
}
