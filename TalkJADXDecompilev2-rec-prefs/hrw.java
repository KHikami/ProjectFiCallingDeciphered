package p000;

public final class hrw {
    public static final hrw f17139a = new hrw();
    private boolean f17140b;
    private String f17141c;
    private boolean f17142d;
    private int f17143e = 2097151;
    private int f17144f;
    private String f17145g;
    private boolean f17146h;
    private int f17147i = 7;
    private int f17148j = 3;
    private int f17149k = 0;

    public hrw m20736a(String str) {
        this.f17141c = str;
        return this;
    }

    public hrw m20737a(boolean z) {
        this.f17142d = true;
        return this;
    }

    public boolean m20738a() {
        return this.f17140b;
    }

    public String m20739b() {
        return this.f17141c;
    }

    public boolean m20740c() {
        return this.f17142d;
    }

    public int m20741d() {
        return this.f17143e;
    }

    public int m20742e() {
        return this.f17144f;
    }

    public String m20743f() {
        return this.f17145g;
    }

    public boolean m20744g() {
        return this.f17146h;
    }

    public int m20745h() {
        return this.f17149k;
    }

    public String toString() {
        return gwb.m2002b("mIncludeInvisible", Boolean.valueOf(this.f17140b), "mQuery", this.f17141c, "mPeopleOnly", Boolean.valueOf(this.f17142d), "mProjection", Integer.valueOf(this.f17143e), "mExtraColumns", Integer.valueOf(this.f17144f), "mFilterGaiaId", this.f17145g, "mIncludeEvergreenPeople", Boolean.valueOf(this.f17146h), "mSearchFields", Integer.valueOf(this.f17147i), "mFilterGaiaEdgeTypes", Integer.valueOf(this.f17148j), "mSortOrder", Integer.valueOf(this.f17149k));
    }
}
