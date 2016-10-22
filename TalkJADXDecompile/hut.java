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
    private static final String[] o;

    static {
        o = new String[]{"contact_id"};
    }

    public hut(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        super(context, hus, z, i, bundle, bundle2, str);
    }

    private String e() {
        if (!this.g) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("contact_id IN(");
        Cursor query = this.a.getContentResolver().query(Data.CONTENT_URI, o, f(), null, null);
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

    private String f() {
        gwb.a(this.g);
        Object a = a();
        gwb.L(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("data1 IN(");
        hur hur = new hur(a);
        a = 1;
        while (hur.c()) {
            if (a == null) {
                stringBuilder.append(",");
            }
            a = null;
            DatabaseUtils.appendEscapedSQLString(stringBuilder, hur.a("value"));
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    protected hug a(hur hur, hur hur2, Cursor cursor) {
        gwb.L((Object) hur);
        gwb.L((Object) cursor);
        hvi hvi = new hvi();
        hvi hvi2 = new hvi();
        int a = hur.a();
        cursor.getCount();
        HashMap hashMap = new HashMap();
        this.i.a("people-map start");
        huo.a(hur, hashMap);
        this.i.a("people-map finish");
        hwi hwi = new hwi();
        hvh hvh = new hvh();
        HashMap hashMap2 = new HashMap();
        b(hur2, hashMap2);
        this.i.a("contact-map start");
        int a2 = a(cursor, hwi, hvh, hashMap2);
        this.i.a("contact-map finish");
        if (gwb.ap()) {
            gwb.i("PeopleAggregator", "#people=" + a + ", #contacts=" + a2);
        }
        this.i.a("merge start");
        hur.a(0);
        cursor.moveToPosition(0);
        ArrayList Y = gwb.Y();
        while (true) {
            Object obj = !hur.d() ? 1 : null;
            Object obj2 = !cursor.isAfterLast() ? 1 : null;
            if (obj == null && obj2 == null) {
                this.i.a("merge finish");
                return new hug(hur.a, cursor, this.a, hvi.a(), hvi, hvi2, Y, hashMap2, this.d, this.f);
            }
            a = (obj == null || obj2 == null) ? obj != null ? -1 : 1 : a(obj != null ? hur.a("name") : null, obj2 != null ? cursor.getString(1) : null);
            if (a <= 0) {
                a2 = hur.b();
                String a3 = hur.a("gaia_id");
                hvi.a(a2);
                Y.add(a3);
                if (a3 == null || hwi.a(a3) == 0) {
                    hvi2.b();
                } else {
                    hvi2.a(hwi, a3);
                }
                hur.c();
            }
            if (a >= 0) {
                a2 = cursor.getPosition();
                int a4 = hvh.a(a2);
                if (a4 == 0) {
                    hvi.b();
                    hvi2.a(a2);
                    Y.add(null);
                } else {
                    for (a = 0; a < a4; a++) {
                        String a5 = hvh.a(a2, a);
                        if (!hashMap.containsKey(a5)) {
                            hvi.b();
                            hvi2.a(a2);
                            Y.add(a5);
                        }
                    }
                }
                hul.a(cursor);
            }
        }
    }

    protected Cursor c() {
        Cursor cursor = null;
        String e = e();
        if (e != null) {
            hwf hwf;
            if (!n || VERSION.SDK_INT < 18) {
                hwf = new hwf();
                hul.a(hwf, this.c, this.a);
                hul.a(hwf);
                hwf.b(e);
                hwf.b("(data1 IS NOT NULL AND data1!='')");
                cursor = this.a.getContentResolver().query(Data.CONTENT_URI, hul.a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } else {
                Uri build = hum.a.buildUpon().appendQueryParameter("visible_contacts_only", String.valueOf(!this.c)).build();
                hwf = new hwf();
                hwf.b(hul.a());
                hwf.b(e);
                hwf.b("(data1 IS NOT NULL AND data1!='')");
                cursor = this.a.getContentResolver().query(build, hul.a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            }
            if (cursor != null) {
                cursor.getCount();
            }
        }
        return cursor;
    }
}
