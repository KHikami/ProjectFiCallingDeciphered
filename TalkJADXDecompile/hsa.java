import java.util.Collection;

public final class hsa {
    public static final hsa a;
    private String b;
    private Collection<String> c;
    private int d;
    private boolean e;
    private long f;
    private String g;
    private int h;
    private int i;
    private int j;

    static {
        a = new hsa();
    }

    public hsa() {
        this.d = 2097151;
        this.h = 7;
        this.i = 0;
    }

    public hsa a(String str) {
        this.g = str;
        return this;
    }

    public hsa a(boolean z) {
        this.e = true;
        return this;
    }

    public String a() {
        return this.b;
    }

    public Collection<String> b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public long e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public String toString() {
        return gwb.b("mCircleId", this.b, "mQualifiedIds", this.c, "mProjection", Integer.valueOf(this.d), "mPeopleOnly", Boolean.valueOf(this.e), "mChangedSince", Long.valueOf(this.f), "mQuery", this.g, "mSearchFields", Integer.valueOf(this.h), "mSortOrder", Integer.valueOf(this.i), "mExtraColumns", Integer.valueOf(this.j));
    }
}
