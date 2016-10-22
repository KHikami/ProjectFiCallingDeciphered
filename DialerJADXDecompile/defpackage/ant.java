package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ant */
final class ant extends ann {
    private /* synthetic */ Uri a;
    private /* synthetic */ boolean b;
    private /* synthetic */ CharSequence c;
    private /* synthetic */ CharSequence d;
    private /* synthetic */ int e;

    ant(Uri uri, boolean z, CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = uri;
        this.b = z;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = i;
    }

    public final Intent a(Context context) {
        afj a;
        if (this.a != null) {
            a = afl.a(this.a);
        } else {
            a = null;
        }
        if (a != null) {
            Intent l;
            if (this.b) {
                l = buf.l();
            } else {
                l = buf.m();
            }
            if (a.h.size() != 1) {
                throw new IllegalStateException("Cannot extract content values from an aggregated contact");
            }
            ContentValues contentValues;
            Object c = ((afq) a.h.get(0)).c();
            if (a.d == 0 && a.l != null) {
                contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/photo");
                contentValues.put("data15", a.l);
                c.add(contentValues);
            }
            if (a.c >= 35) {
                l.putExtra("name", a.f);
            } else if (a.c == 30) {
                contentValues = new ContentValues();
                contentValues.put("data1", a.f);
                contentValues.put("mimetype", "vnd.android.cursor.item/organization");
                c.add(contentValues);
            }
            Iterator it = c.iterator();
            while (it.hasNext()) {
                contentValues = (ContentValues) it.next();
                contentValues.remove("last_time_used");
                contentValues.remove("times_used");
            }
            l.putExtra("data", c);
            return l;
        } else if (this.b) {
            return buf.a(this.c, this.d, this.e);
        } else {
            return buf.b(this.c, this.d, this.e);
        }
    }
}
