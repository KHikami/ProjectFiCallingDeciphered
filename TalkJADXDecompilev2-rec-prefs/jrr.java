package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class jrr {
    private final String f20907a;
    private final Context f20908b;
    private final jpt f20909c;
    private final String f20910d;
    private final mzw f20911e;
    private final odm f20912f;
    private final kou f20913g;
    private final jpz f20914h;
    private final pbc f20915i;
    private long f20916j;
    private String f20917k;
    private boolean f20918l;
    private long f20919m;
    private Uri f20920n;
    private Uri f20921o;
    private jpt f20922p;
    private int f20923q;

    jrr(jrs jrs) {
        this.f20908b = jrs.f20924a;
        this.f20920n = jrs.f20925b;
        this.f20921o = jrs.f20925b;
        this.f20910d = jrs.f20926c;
        this.f20911e = jrs.f20928e;
        this.f20912f = jrs.f20929f;
        this.f20913g = jrs.f20930g;
        this.f20914h = jrs.f20931h;
        this.f20915i = jrs.f20932i;
        String str = jrs.f20927d;
        if (str == null) {
            str = gwb.m1646a(this.f20908b, this.f20920n);
        }
        this.f20907a = str;
        jpt a = m25100a(this.f20921o);
        this.f20909c = a;
        this.f20922p = this.f20909c;
        this.f20919m = a == null ? 0 : a.m24961b();
        if (this.f20919m <= 0) {
            String valueOf = String.valueOf(this.f20921o);
            throw new jqj(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Empty content at ").append(valueOf).toString());
        }
        str = null;
        if (kdj.m25590b(this.f20920n)) {
            jrt a2 = m25101a(this.f20920n, this.f20907a);
            str = a2.f20933a;
            this.f20916j = a2.f20934b;
        } else {
            this.f20916j = System.currentTimeMillis();
        }
        if (str == null) {
            str = this.f20920n.toString();
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        this.f20917k = str;
    }

    public void m25103a() {
        jru b = gwb.m2008b(this.f20908b, this.f20921o, this.f20914h);
        if (b != null) {
            this.f20921o = b.m25129a();
            this.f20923q = b.m25130b();
            jpt a = m25100a(this.f20921o);
            this.f20922p = a;
            this.f20919m = a.m24961b();
            this.f20918l = true;
        }
    }

    public InputStream m25102a(long j) {
        InputStream bufferedInputStream = new BufferedInputStream(this.f20908b.getContentResolver().openInputStream(this.f20921o));
        if (j > 0) {
            bufferedInputStream.skip(j);
        }
        return bufferedInputStream;
    }

    public boolean m25106b() {
        return this.f20918l;
    }

    public Uri m25107c() {
        return this.f20921o;
    }

    public void m25104a(String str) {
        this.f20917k = str;
    }

    public String m25108d() {
        return this.f20917k;
    }

    public String m25109e() {
        return this.f20907a;
    }

    public long m25110f() {
        return this.f20916j;
    }

    public void m25105b(long j) {
        this.f20916j = j;
    }

    public Uri m25111g() {
        return this.f20920n;
    }

    public jpt m25112h() {
        return this.f20909c;
    }

    public jpt m25113i() {
        return this.f20922p;
    }

    public String m25114j() {
        return this.f20910d;
    }

    public long m25115k() {
        return this.f20919m;
    }

    public mzw m25116l() {
        return this.f20911e;
    }

    public odm m25117m() {
        return this.f20912f;
    }

    public kou m25118n() {
        return this.f20913g;
    }

    public int m25119o() {
        return this.f20923q;
    }

    private jpt m25100a(Uri uri) {
        jpt jpt = null;
        try {
            jpt = jpt.m24959a(this.f20908b.getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException e) {
        } catch (IOException e2) {
        }
        return jpt;
    }

    private jrt m25101a(Uri uri, String str) {
        String str2;
        Throwable th;
        if (kdj.m25591b(str)) {
            str2 = "datetaken";
        } else if (kdj.m25593c(str)) {
            str2 = "datetaken";
        } else {
            String valueOf = String.valueOf(uri);
            throw new jqi(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid content at: ").append(valueOf).toString(), true);
        }
        Cursor query;
        try {
            query = this.f20908b.getContentResolver().query(uri, new String[]{str2, "_data"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        jrt jrt = new jrt(query.getString(query.getColumnIndexOrThrow("_data")), query.getLong(query.getColumnIndexOrThrow(str2)));
                        if (query != null) {
                            query.close();
                        }
                        return jrt;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            String valueOf2 = String.valueOf(uri);
            throw new jqj(new StringBuilder(String.valueOf(valueOf2).length() + 20).append("No content for URI: ").append(valueOf2).toString());
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }
}
