package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: huo */
public abstract class huo {
    public static volatile boolean n;
    public final Context a;
    final hus b;
    public final boolean c;
    public final int d;
    public final Bundle e;
    public final Bundle f;
    public final boolean g;
    public final String h;
    public final hwg i;
    ConnectionResult j;
    DataHolder k;
    DataHolder l;
    Cursor m;
    private final Object o;
    private boolean p;
    private boolean q;
    private Exception r;
    private boolean s;
    private final Collator t;

    static {
        n = true;
    }

    protected huo(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        boolean z2;
        this.o = new Object();
        this.t = Collator.getInstance();
        this.a = context;
        this.b = hus;
        this.c = z;
        this.d = i;
        this.e = bundle;
        this.f = bundle2;
        if (TextUtils.isEmpty(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.g = z2;
        if (!this.g) {
            str = null;
        }
        this.h = str;
        this.i = gwb.ap() ? new hwg("aggregator") : hwh.a;
    }

    protected static void a(hur hur, HashMap<String, Integer> hashMap) {
        hur.a(-1);
        while (hur.c()) {
            CharSequence a = hur.a("gaia_id");
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(a, Integer.valueOf(hur.b()));
            }
        }
    }

    private void e() {
        try {
            new huq(this).start();
        } catch (Exception e) {
            gwb.b("PeopleAggregator", "Unable to start thread", (Throwable) e);
            a(null, e);
        }
    }

    private void f() {
        synchronized (this.o) {
            if (this.p && this.q) {
                if (this.j.b()) {
                    try {
                        new hup(this).start();
                        return;
                    } catch (Throwable e) {
                        gwb.b("PeopleAggregator", "Unable to start thread", e);
                        d();
                        return;
                    }
                }
                d();
                return;
            }
        }
    }

    protected int a(Cursor cursor, hwi hwi, hvh hvh, HashMap<String, String> hashMap) {
        int i = -1;
        long j = -1;
        cursor.moveToPosition(-1);
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(6);
        int i2 = 0;
        while (cursor.moveToNext()) {
            int i3;
            long j2 = cursor.getLong(0);
            if (j2 != j) {
                arrayList.clear();
                arrayList2.clear();
                i3 = i2 + 1;
                i2 = cursor.getPosition();
                j = j2;
            } else {
                i3 = i2;
                i2 = i;
            }
            String string = cursor.getString(2);
            if ("vnd.android.cursor.item/email_v2".equals(string) || "vnd.android.cursor.item/phone_v2".equals(string)) {
                CharSequence string2 = cursor.getString(3);
                if (TextUtils.isEmpty(string2) || arrayList2.contains(string2)) {
                    i = i2;
                    i2 = i3;
                } else {
                    arrayList2.add(string2);
                    string = (String) hashMap.get(string2);
                    if (!(TextUtils.isEmpty(string) || arrayList.contains(string))) {
                        arrayList.add(string);
                        hwi.a(string, i2);
                        hvh.a(Integer.valueOf(i2), string);
                    }
                }
            }
            i = i2;
            i2 = i3;
        }
        return i2;
    }

    protected int a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) ? 0 : -1 : TextUtils.isEmpty(str2) ? 1 : this.t.compare(str, str2);
    }

    protected DataHolder a() {
        return this.l;
    }

    protected abstract hug a(hur hur, hur hur2, Cursor cursor);

    void a(Cursor cursor, Exception exception) {
        if (cursor != null) {
            this.i.a("contacts loaded");
        } else {
            this.i.a("contacts load failure");
        }
        if (gwb.ap()) {
            String str = "PeopleAggregator";
            String valueOf = String.valueOf(exception);
            gwb.i(str, new StringBuilder(String.valueOf(valueOf).length() + 46).append("Contacts loaded.  exception=").append(valueOf).append("  size=").append(cursor == null ? -1 : cursor.getCount()).toString());
        }
        synchronized (this.o) {
            this.q = true;
            this.m = cursor;
            this.r = exception;
        }
        f();
    }

    public void a(ConnectionResult connectionResult, DataHolder[] dataHolderArr) {
        if (connectionResult.b()) {
            this.i.a("people loaded");
        } else {
            this.i.a("people load failure");
        }
        if (gwb.ap()) {
            String str = "PeopleAggregator";
            String valueOf = String.valueOf(connectionResult);
            int g = (dataHolderArr == null || dataHolderArr.length < 2 || dataHolderArr[0] == null) ? -1 : dataHolderArr[0].g();
            gwb.i(str, new StringBuilder(String.valueOf(valueOf).length() + 41).append("People loaded.  status=").append(valueOf).append("  size=").append(g).toString());
        }
        synchronized (this.o) {
            this.p = true;
            this.j = connectionResult;
            if (this.j.b()) {
                this.k = dataHolderArr[0];
                this.l = dataHolderArr[1];
            }
        }
        if (!this.g) {
            f();
        } else if (this.j.b()) {
            e();
        } else {
            synchronized (this.o) {
                this.q = true;
            }
            d();
        }
    }

    public void b() {
        if (!this.g) {
            e();
        }
    }

    protected void b(hur hur, HashMap<String, String> hashMap) {
        hur.a(-1);
        while (hur.c()) {
            hashMap.put(hur.a("value"), hur.a("gaia_id"));
        }
    }

    protected abstract Cursor c();

    void d() {
        synchronized (this.o) {
            gwb.b(this.p);
            gwb.b(this.q);
            if (this.k != null) {
                this.k.close();
            }
            if (this.l != null) {
                this.l.close();
            }
            if (this.m != null) {
                this.m.close();
            }
            if (this.s) {
                return;
            }
            this.s = true;
            this.b.a(8, null, null);
        }
    }
}
