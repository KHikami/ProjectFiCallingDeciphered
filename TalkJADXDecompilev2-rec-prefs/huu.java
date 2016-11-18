package p000;

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
    public static final String[] f17342o = new String[]{"contact_id"};
    private final String f17343p;

    public huu(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        super(context, hus, z, i, bundle, bundle2, null);
        this.f17343p = str;
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
        ArrayList Y = gwb.m1468Y();
        hur.m20892a(-1);
        while (hur.m20894c()) {
            a = hur.m20893b();
            String a3 = hur.m20891a("gaia_id");
            hvi.m21054a(a);
            Y.add(a3);
            if (a3 == null || hwi.m21142a(a3) == 0) {
                hvi2.m21057b();
            } else {
                hvi2.m21055a(hwi, a3);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) {
            int position = cursor.getPosition();
            int a4 = hvh.m21048a(position);
            if (a4 == 0) {
                hvi.m21057b();
                hvi2.m21054a(position);
                Y.add(null);
            } else {
                for (a = 0; a < a4; a++) {
                    String a5 = hvh.m21049a(position, a);
                    if (!hashMap.containsKey(a5)) {
                        hvi.m21057b();
                        hvi2.m21054a(position);
                        Y.add(a5);
                    }
                }
            }
            hul.m20871a(cursor);
        }
        this.i.mo3029a("merge finish");
        return new hug(hur.f17337a, cursor, this.a, hvi.m21052a(), hvi, hvi2, Y, hashMap2, this.d, this.f);
    }

    protected Cursor mo2953c() {
        Cursor cursor = null;
        if (!n || VERSION.SDK_INT < 18) {
            hwf hwf = new hwf();
            hul.m20869a(hwf, this.c, this.a);
            hul.m20868a(hwf);
            this.i.mo3029a("lookup start");
            Cursor query = this.a.getContentResolver().query(Phone.CONTENT_FILTER_URI.buildUpon().appendPath(this.f17343p).appendQueryParameter("limit", Integer.toString(100)).build(), f17342o, "(data1 IS NOT NULL AND data1!='')", null, null);
            Cursor query2 = this.a.getContentResolver().query(Email.CONTENT_FILTER_URI.buildUpon().appendPath(this.f17343p).appendQueryParameter("limit", Integer.toString(100)).build(), f17342o, "(data1 IS NOT NULL AND data1!='')", null, null);
            huv huv = new huv(query, 100);
            huv huv2 = new huv(query2, 100);
            Cursor mergeCursor = new MergeCursor(new Cursor[]{huv, huv2});
            try {
                int count = mergeCursor.getCount();
                this.i.mo3029a("lookup finish");
                if (count == 0) {
                    return cursor;
                }
                hwf.m21137b("contact_id IN (");
                String str = "";
                while (mergeCursor.moveToNext()) {
                    hwf.m21136a(str);
                    hwf.m21136a(Long.toString(mergeCursor.getLong(0)));
                    str = ",";
                }
                hwf.m21136a(")");
                mergeCursor.close();
                cursor = this.a.getContentResolver().query(Data.CONTENT_URI, hul.f17297a, hwf.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } finally {
                mergeCursor.close();
            }
        } else {
            Uri build = hum.f17301b.buildUpon().appendPath(this.f17343p).appendQueryParameter("visible_contacts_only", String.valueOf(!this.c)).build();
            hwf hwf2 = new hwf();
            hwf2.m21137b(hul.m20867a());
            hwf2.m21137b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.a.getContentResolver().query(build, hul.f17297a, hwf2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
