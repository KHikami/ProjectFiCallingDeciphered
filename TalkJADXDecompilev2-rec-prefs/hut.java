package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.Data;
import java.util.ArrayList;
import java.util.HashMap;

public final class hut extends huo {
    private static final String[] f17341o = new String[]{"contact_id"};

    public hut(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        super(context, hus, z, i, bundle, bundle2, str);
    }

    private String m20897e() {
        if (!this.g) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("contact_id IN(");
        Cursor query = this.a.getContentResolver().query(Data.CONTENT_URI, f17341o, m20898f(), null, null);
        if (query == null) {
            return null;
        }
        Object obj = 1;
        while (query.moveToNext()) {
            try {
                if (obj == null) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(query.getLong(0));
                obj = null;
            } finally {
                query.close();
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private String m20898f() {
        gwb.m1885a(this.g);
        Object a = m20882a();
        gwb.m1419L(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("data1 IN(");
        hur hur = new hur(a);
        a = 1;
        while (hur.m20894c()) {
            if (a == null) {
                stringBuilder.append(",");
            }
            a = null;
            DatabaseUtils.appendEscapedSQLString(stringBuilder, hur.m20891a("value"));
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    protected hug mo2952a(hur hur, hur hur2, Cursor cursor) {
        gwb.m1419L((Object) hur);
        gwb.m1419L((Object) cursor);
        hvi hvi = new hvi();
        hvi hvi2 = new hvi();
        int a = hur.m20890a();
        cursor.getCount();
        HashMap hashMap = new HashMap();
        this.i.mo3029a("people-map start");
        huo.m20877a(hur, hashMap);
        this.i.mo3029a("people-map finish");
        hwi hwi = new hwi();
        hvh hvh = new hvh();
        HashMap hashMap2 = new HashMap();
        m20887b(hur2, hashMap2);
        this.i.mo3029a("contact-map start");
        int a2 = m20880a(cursor, hwi, hvh, hashMap2);
        this.i.mo3029a("contact-map finish");
        if (gwb.ap()) {
            gwb.m2253i("PeopleAggregator", "#people=" + a + ", #contacts=" + a2);
        }
        this.i.mo3029a("merge start");
        hur.m20892a(0);
        cursor.moveToPosition(0);
        ArrayList Y = gwb.m1468Y();
        while (true) {
            Object obj = !hur.m20895d() ? 1 : null;
            Object obj2 = !cursor.isAfterLast() ? 1 : null;
            if (obj == null && obj2 == null) {
                this.i.mo3029a("merge finish");
                return new hug(hur.f17337a, cursor, this.a, hvi.m21052a(), hvi, hvi2, Y, hashMap2, this.d, this.f);
            }
            a = (obj == null || obj2 == null) ? obj != null ? -1 : 1 : m20881a(obj != null ? hur.m20891a("name") : null, obj2 != null ? cursor.getString(1) : null);
            if (a <= 0) {
                a2 = hur.m20893b();
                String a3 = hur.m20891a("gaia_id");
                hvi.m21054a(a2);
                Y.add(a3);
                if (a3 == null || hwi.m21142a(a3) == 0) {
                    hvi2.m21057b();
                } else {
                    hvi2.m21055a(hwi, a3);
                }
                hur.m20894c();
            }
            if (a >= 0) {
                a2 = cursor.getPosition();
                int a4 = hvh.m21048a(a2);
                if (a4 == 0) {
                    hvi.m21057b();
                    hvi2.m21054a(a2);
                    Y.add(null);
                } else {
                    for (a = 0; a < a4; a++) {
                        String a5 = hvh.m21049a(a2, a);
                        if (!hashMap.containsKey(a5)) {
                            hvi.m21057b();
                            hvi2.m21054a(a2);
                            Y.add(a5);
                        }
                    }
                }
                hul.m20871a(cursor);
            }
        }
    }

    protected Cursor mo2953c() {
        Cursor cursor = null;
        String e = m20897e();
        if (e != null) {
            hwf hwf;
            if (!n || VERSION.SDK_INT < 18) {
                hwf = new hwf();
                hul.m20869a(hwf, this.c, this.a);
                hul.m20868a(hwf);
                hwf.m21137b(e);
                hwf.m21137b("(data1 IS NOT NULL AND data1!='')");
                cursor = this.a.getContentResolver().query(Data.CONTENT_URI, hul.f17297a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } else {
                Uri build = hum.f17300a.buildUpon().appendQueryParameter("visible_contacts_only", String.valueOf(!this.c)).build();
                hwf = new hwf();
                hwf.m21137b(hul.m20867a());
                hwf.m21137b(e);
                hwf.m21137b("(data1 IS NOT NULL AND data1!='')");
                cursor = this.a.getContentResolver().query(build, hul.f17297a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            }
            if (cursor != null) {
                cursor.getCount();
            }
        }
        return cursor;
    }
}
