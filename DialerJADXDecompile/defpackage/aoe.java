package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: aoe */
public final class aoe {
    final LinkedList a;
    public aro b;
    public aoh c;
    aog d;
    public volatile boolean e;
    public Handler f;
    private awt g;

    public aoe(awt awt, aog aog) {
        this.e = false;
        this.f = new aof(this);
        this.g = awt;
        this.d = aog;
        this.a = new LinkedList();
        this.b = new aro(new LruCache(100));
    }

    final boolean a(String str, String str2, aws aws) {
        boolean z = false;
        boolean z2 = true;
        aws a = this.g.a(str, str2);
        if (a == null) {
            return false;
        }
        Object obj;
        boolean z3;
        aok aok = new aok(str, str2);
        arp a2 = this.b.a(aok);
        if (a2 == null) {
            obj = null;
        } else {
            obj = a2.a();
        }
        aws aws2 = (aws) obj;
        boolean z4 = a.p != 0;
        if ((aws2 != aws.a || z4) && !a.equals(aws2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.b.a(aok, a);
        awt awt = this.g;
        if (buf.c(awt.b, "android.permission.WRITE_CALL_LOG")) {
            ContentValues contentValues = new ContentValues();
            if (aws != null) {
                if (!TextUtils.equals(a.d, aws.d)) {
                    contentValues.put("name", a.d);
                    z = true;
                }
                if (a.f != aws.f) {
                    contentValues.put("numbertype", Integer.valueOf(a.f));
                    z = true;
                }
                if (!TextUtils.equals(a.g, aws.g)) {
                    contentValues.put("numberlabel", a.g);
                    z = true;
                }
                if (!buf.a(a.b, aws.b)) {
                    contentValues.put("lookup_uri", buf.b(a.b));
                    z = true;
                }
                if (!(TextUtils.isEmpty(a.j) || TextUtils.equals(a.j, aws.j))) {
                    contentValues.put("normalized_number", a.j);
                    z = true;
                }
                if (!TextUtils.equals(a.h, aws.h)) {
                    contentValues.put("matched_number", a.h);
                    z = true;
                }
                if (a.k != aws.k) {
                    contentValues.put("photo_id", Long.valueOf(a.k));
                    z = true;
                }
                Uri d = buf.d(a.l);
                if (!buf.a(d, aws.l)) {
                    contentValues.put("photo_uri", buf.b(d));
                    z = true;
                }
                if (TextUtils.equals(a.i, aws.i)) {
                    z2 = z;
                } else {
                    contentValues.put("formatted_number", a.i);
                }
            } else {
                contentValues.put("name", a.d);
                contentValues.put("numbertype", Integer.valueOf(a.f));
                contentValues.put("numberlabel", a.g);
                contentValues.put("lookup_uri", buf.b(a.b));
                contentValues.put("matched_number", a.h);
                contentValues.put("normalized_number", a.j);
                contentValues.put("photo_id", Long.valueOf(a.k));
                contentValues.put("photo_uri", buf.b(buf.d(a.l)));
                contentValues.put("formatted_number", a.i);
            }
            if (z2) {
                if (str2 == null) {
                    try {
                        awt.b.getContentResolver().update(axk.e(awt.b), contentValues, "number = ? AND countryiso IS NULL", new String[]{str});
                    } catch (Throwable e) {
                        Log.e(awt.a, "Unable to update contact info in call log db", e);
                    }
                } else {
                    awt.b.getContentResolver().update(axk.e(awt.b), contentValues, "number = ? AND countryiso = ?", new String[]{str, str2});
                }
            }
        }
        return z3;
    }

    final synchronized void a() {
        if (!this.e) {
            if (this.c == null) {
                this.c = new aoh(this);
                this.c.setPriority(1);
                this.c.start();
            }
        }
    }

    public final synchronized void b() {
        this.f.removeMessages(2);
        if (this.c != null) {
            this.c.a = true;
            this.c.interrupt();
            this.c = null;
        }
    }

    public final void a(String str, String str2, aws aws, boolean z) {
        aoi aoi = new aoi(str, str2, aws);
        synchronized (this.a) {
            if (!this.a.contains(aoi)) {
                this.a.add(aoi);
                this.a.notifyAll();
            }
        }
        if (z) {
            a();
        }
    }
}
