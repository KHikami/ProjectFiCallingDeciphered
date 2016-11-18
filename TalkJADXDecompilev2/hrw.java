package defpackage;

public final class hrw {
    public static final hrw a = new hrw();
    private boolean b;
    private String c;
    private boolean d;
    private int e = 2097151;
    private int f;
    private String g;
    private boolean h;
    private int i = 7;
    private int j = 3;
    private int k = 0;

    public hrw a(String str) {
        this.c = str;
        return this;
    }

    public hrw a(boolean z) {
        this.d = true;
        return this;
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public int h() {
        return this.k;
    }

    public String toString() {
        return gwb.b("mIncludeInvisible", Boolean.valueOf(this.b), "mQuery", this.c, "mPeopleOnly", Boolean.valueOf(this.d), "mProjection", Integer.valueOf(this.e), "mExtraColumns", Integer.valueOf(this.f), "mFilterGaiaId", this.g, "mIncludeEvergreenPeople", Boolean.valueOf(this.h), "mSearchFields", Integer.valueOf(this.i), "mFilterGaiaEdgeTypes", Integer.valueOf(this.j), "mSortOrder", Integer.valueOf(this.k));
    }
}
