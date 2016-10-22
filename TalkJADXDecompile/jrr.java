import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class jrr {
    private final String a;
    private final Context b;
    private final jpt c;
    private final String d;
    private final mzw e;
    private final odm f;
    private final kou g;
    private final jpz h;
    private final pbc i;
    private long j;
    private String k;
    private boolean l;
    private long m;
    private Uri n;
    private Uri o;
    private jpt p;
    private int q;

    jrr(jrs jrs) {
        this.b = jrs.a;
        this.n = jrs.b;
        this.o = jrs.b;
        this.d = jrs.c;
        this.e = jrs.e;
        this.f = jrs.f;
        this.g = jrs.g;
        this.h = jrs.h;
        this.i = jrs.i;
        String str = jrs.d;
        if (str == null) {
            str = gwb.a(this.b, this.n);
        }
        this.a = str;
        jpt a = a(this.o);
        this.c = a;
        this.p = this.c;
        this.m = a == null ? 0 : a.b();
        if (this.m <= 0) {
            String valueOf = String.valueOf(this.o);
            throw new jqj(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Empty content at ").append(valueOf).toString());
        }
        str = null;
        if (kdj.b(this.n)) {
            jrt a2 = a(this.n, this.a);
            str = a2.a;
            this.j = a2.b;
        } else {
            this.j = System.currentTimeMillis();
        }
        if (str == null) {
            str = this.n.toString();
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        this.k = str;
    }

    public void a() {
        jru b = gwb.b(this.b, this.o, this.h);
        if (b != null) {
            this.o = b.a();
            this.q = b.b();
            jpt a = a(this.o);
            this.p = a;
            this.m = a.b();
            this.l = true;
        }
    }

    public InputStream a(long j) {
        InputStream bufferedInputStream = new BufferedInputStream(this.b.getContentResolver().openInputStream(this.o));
        if (j > 0) {
            bufferedInputStream.skip(j);
        }
        return bufferedInputStream;
    }

    public boolean b() {
        return this.l;
    }

    public Uri c() {
        return this.o;
    }

    public void a(String str) {
        this.k = str;
    }

    public String d() {
        return this.k;
    }

    public String e() {
        return this.a;
    }

    public long f() {
        return this.j;
    }

    public void b(long j) {
        this.j = j;
    }

    public Uri g() {
        return this.n;
    }

    public jpt h() {
        return this.c;
    }

    public jpt i() {
        return this.p;
    }

    public String j() {
        return this.d;
    }

    public long k() {
        return this.m;
    }

    public mzw l() {
        return this.e;
    }

    public odm m() {
        return this.f;
    }

    public kou n() {
        return this.g;
    }

    public int o() {
        return this.q;
    }

    private jpt a(Uri uri) {
        jpt jpt = null;
        try {
            jpt = jpt.a(this.b.getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException e) {
        } catch (IOException e2) {
        }
        return jpt;
    }

    private jrt a(Uri uri, String str) {
        String str2;
        Cursor query;
        Throwable th;
        if (kdj.b(str)) {
            str2 = "datetaken";
        } else if (kdj.c(str)) {
            str2 = "datetaken";
        } else {
            String valueOf = String.valueOf(uri);
            throw new jqi(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid content at: ").append(valueOf).toString(), true);
        }
        try {
            query = this.b.getContentResolver().query(uri, new String[]{str2, "_data"}, null, null, null);
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
