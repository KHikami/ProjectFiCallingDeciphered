package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import java.util.ArrayList;
import java.util.HashMap;

public final class huu extends huo {
    public static final String[] o = new String[]{"contact_id"};
    private final String p;

    public huu(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        super(context, hus, z, i, bundle, bundle2, null);
        this.p = str;
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
        ArrayList Y = gwb.Y();
        hur.a(-1);
        while (hur.c()) {
            a = hur.b();
            String a3 = hur.a("gaia_id");
            hvi.a(a);
            Y.add(a3);
            if (a3 == null || hwi.a(a3) == 0) {
                hvi2.b();
            } else {
                hvi2.a(hwi, a3);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) {
            int position = cursor.getPosition();
            int a4 = hvh.a(position);
            if (a4 == 0) {
                hvi.b();
                hvi2.a(position);
                Y.add(null);
            } else {
                for (a = 0; a < a4; a++) {
                    String a5 = hvh.a(position, a);
                    if (!hashMap.containsKey(a5)) {
                        hvi.b();
                        hvi2.a(position);
                        Y.add(a5);
                    }
                }
            }
            hul.a(cursor);
        }
        this.i.a("merge finish");
        return new hug(hur.a, cursor, this.a, hvi.a(), hvi, hvi2, Y, hashMap2, this.d, this.f);
    }

    protected Cursor c() {
        Cursor cursor = null;
        if (!n || VERSION.SDK_INT < 18) {
            hwf hwf = new hwf();
            hul.a(hwf, this.c, this.a);
            hul.a(hwf);
            this.i.a("lookup start");
            Cursor query = this.a.getContentResolver().query(Phone.CONTENT_FILTER_URI.buildUpon().appendPath(this.p).appendQueryParameter("limit", Integer.toString(100)).build(), o, "(data1 IS NOT NULL AND data1!='')", null, null);
            Cursor query2 = this.a.getContentResolver().query(Email.CONTENT_FILTER_URI.buildUpon().appendPath(this.p).appendQueryParameter("limit", Integer.toString(100)).build(), o, "(data1 IS NOT NULL AND data1!='')", null, null);
            huv huv = new huv(query, 100);
            huv huv2 = new huv(query2, 100);
            Cursor mergeCursor = new MergeCursor(new Cursor[]{huv, huv2});
            try {
                int count = mergeCursor.getCount();
                this.i.a("lookup finish");
                if (count == 0) {
                    return cursor;
                }
                hwf.b("contact_id IN (");
                String str = "";
                while (mergeCursor.moveToNext()) {
                    hwf.a(str);
                    hwf.a(Long.toString(mergeCursor.getLong(0)));
                    str = ",";
                }
                hwf.a(")");
                mergeCursor.close();
                cursor = this.a.getContentResolver().query(Data.CONTENT_URI, hul.a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } finally {
                mergeCursor.close();
            }
        } else {
            Uri build = hum.b.buildUpon().appendPath(this.p).appendQueryParameter("visible_contacts_only", String.valueOf(!this.c)).build();
            hwf hwf2 = new hwf();
            hwf2.b(hul.a());
            hwf2.b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.a.getContentResolver().query(build, hul.a, hwf2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
