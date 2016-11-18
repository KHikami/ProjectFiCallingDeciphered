package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class huo {
    public static volatile boolean f17315n = true;
    public final Context f17316a;
    final hus f17317b;
    public final boolean f17318c;
    public final int f17319d;
    public final Bundle f17320e;
    public final Bundle f17321f;
    public final boolean f17322g;
    public final String f17323h;
    public final hwg f17324i;
    ConnectionResult f17325j;
    DataHolder f17326k;
    DataHolder f17327l;
    Cursor f17328m;
    private final Object f17329o = new Object();
    private boolean f17330p;
    private boolean f17331q;
    private Exception f17332r;
    private boolean f17333s;
    private final Collator f17334t = Collator.getInstance();

    protected huo(Context context, hus hus, boolean z, int i, Bundle bundle, Bundle bundle2, String str) {
        boolean z2;
        this.f17316a = context;
        this.f17317b = hus;
        this.f17318c = z;
        this.f17319d = i;
        this.f17320e = bundle;
        this.f17321f = bundle2;
        if (TextUtils.isEmpty(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f17322g = z2;
        if (!this.f17322g) {
            str = null;
        }
        this.f17323h = str;
        this.f17324i = gwb.ap() ? new hwg("aggregator") : hwh.f17422a;
    }

    protected static void m20877a(hur hur, HashMap<String, Integer> hashMap) {
        hur.m20892a(-1);
        while (hur.m20894c()) {
            CharSequence a = hur.m20891a("gaia_id");
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(a, Integer.valueOf(hur.m20893b()));
            }
        }
    }

    private void m20878e() {
        try {
            new huq(this).start();
        } catch (Exception e) {
            gwb.m2044b("PeopleAggregator", "Unable to start thread", (Throwable) e);
            m20884a(null, e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20879f() {
        synchronized (this.f17329o) {
            if (!(this.f17330p && this.f17331q)) {
            }
        }
    }

    protected int m20880a(Cursor cursor, hwi hwi, hvh hvh, HashMap<String, String> hashMap) {
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
                        hwi.m21143a(string, i2);
                        hvh.m21050a(Integer.valueOf(i2), string);
                    }
                }
            }
            i = i2;
            i2 = i3;
        }
        return i2;
    }

    protected int m20881a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) ? 0 : -1 : TextUtils.isEmpty(str2) ? 1 : this.f17334t.compare(str, str2);
    }

    protected DataHolder m20882a() {
        return this.f17327l;
    }

    protected abstract hug mo2952a(hur hur, hur hur2, Cursor cursor);

    void m20884a(Cursor cursor, Exception exception) {
        if (cursor != null) {
            this.f17324i.mo3029a("contacts loaded");
        } else {
            this.f17324i.mo3029a("contacts load failure");
        }
        if (gwb.ap()) {
            String str = "PeopleAggregator";
            String valueOf = String.valueOf(exception);
            gwb.m2253i(str, new StringBuilder(String.valueOf(valueOf).length() + 46).append("Contacts loaded.  exception=").append(valueOf).append("  size=").append(cursor == null ? -1 : cursor.getCount()).toString());
        }
        synchronized (this.f17329o) {
            this.f17331q = true;
            this.f17328m = cursor;
            this.f17332r = exception;
        }
        m20879f();
    }

    public void m20885a(ConnectionResult connectionResult, DataHolder[] dataHolderArr) {
        if (connectionResult.m9653b()) {
            this.f17324i.mo3029a("people loaded");
        } else {
            this.f17324i.mo3029a("people load failure");
        }
        if (gwb.ap()) {
            String str = "PeopleAggregator";
            String valueOf = String.valueOf(connectionResult);
            int g = (dataHolderArr == null || dataHolderArr.length < 2 || dataHolderArr[0] == null) ? -1 : dataHolderArr[0].m9684g();
            gwb.m2253i(str, new StringBuilder(String.valueOf(valueOf).length() + 41).append("People loaded.  status=").append(valueOf).append("  size=").append(g).toString());
        }
        synchronized (this.f17329o) {
            this.f17330p = true;
            this.f17325j = connectionResult;
            if (this.f17325j.m9653b()) {
                this.f17326k = dataHolderArr[0];
                this.f17327l = dataHolderArr[1];
            }
        }
        if (!this.f17322g) {
            m20879f();
        } else if (this.f17325j.m9653b()) {
            m20878e();
        } else {
            synchronized (this.f17329o) {
                this.f17331q = true;
            }
            m20889d();
        }
    }

    public void m20886b() {
        if (!this.f17322g) {
            m20878e();
        }
    }

    protected void m20887b(hur hur, HashMap<String, String> hashMap) {
        hur.m20892a(-1);
        while (hur.m20894c()) {
            hashMap.put(hur.m20891a("value"), hur.m20891a("gaia_id"));
        }
    }

    protected abstract Cursor mo2953c();

    void m20889d() {
        synchronized (this.f17329o) {
            gwb.m2047b(this.f17330p);
            gwb.m2047b(this.f17331q);
            if (this.f17326k != null) {
                this.f17326k.close();
            }
            if (this.f17327l != null) {
                this.f17327l.close();
            }
            if (this.f17328m != null) {
                this.f17328m.close();
            }
            if (this.f17333s) {
                return;
            }
            this.f17333s = true;
            this.f17317b.m20896a(8, null, null);
        }
    }
}
