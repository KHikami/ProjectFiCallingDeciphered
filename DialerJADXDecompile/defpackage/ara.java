package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ara */
public class ara extends aqd {
    private static final String D;
    axc C;

    static {
        D = ara.class.getSimpleName();
    }

    public ara(Context context) {
        super(context);
        this.C = new axc("", axd.a);
        b(0, false);
    }

    public final Uri l(int i) {
        Cursor cursor = (Cursor) getItem(i);
        if (cursor != null) {
            return ContentUris.withAppendedId(Data.CONTENT_URI, cursor.getLong(0));
        }
        Log.w(D, "Cursor was null in getDataUri() call. Returning null instead.");
        return null;
    }

    public final void a(String str) {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(e());
        int b = ((b(1, z2) | 0) | b(2, z2)) | b(3, z2);
        if (!(z2 && buf.e(this.a))) {
            z = false;
        }
        if ((b(4, z) | b) != 0) {
            notifyDataSetChanged();
        }
        super.a(str);
    }

    protected final void a(adr adr, Cursor cursor) {
        axb axb;
        adr.c.clear();
        adr.d.clear();
        adr.e = null;
        if (this.C.a(cursor.getString(7))) {
            Iterator it = new ArrayList(this.C.b).iterator();
            while (it.hasNext()) {
                axb = (axb) it.next();
                adr.c.add(new adt(axb.a, axb.b));
            }
        }
        axc axc = this.C;
        axb = axc.a(cursor.getString(3), axc.c, true);
        if (axb != null) {
            adr.d.add(new adt(axb.a, axb.b));
        }
    }
}
