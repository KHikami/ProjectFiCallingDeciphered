package p000;

import java.util.Collection;

public final class hsa {
    public static final hsa f17153a = new hsa();
    private String f17154b;
    private Collection<String> f17155c;
    private int f17156d = 2097151;
    private boolean f17157e;
    private long f17158f;
    private String f17159g;
    private int f17160h = 7;
    private int f17161i = 0;
    private int f17162j;

    public hsa m20750a(String str) {
        this.f17159g = str;
        return this;
    }

    public hsa m20751a(boolean z) {
        this.f17157e = true;
        return this;
    }

    public String m20752a() {
        return this.f17154b;
    }

    public Collection<String> m20753b() {
        return this.f17155c;
    }

    public int m20754c() {
        return this.f17156d;
    }

    public boolean m20755d() {
        return this.f17157e;
    }

    public long m20756e() {
        return this.f17158f;
    }

    public String m20757f() {
        return this.f17159g;
    }

    public int m20758g() {
        return this.f17160h;
    }

    public int m20759h() {
        return this.f17161i;
    }

    public int m20760i() {
        return this.f17162j;
    }

    public String toString() {
        return gwb.m2002b("mCircleId", this.f17154b, "mQualifiedIds", this.f17155c, "mProjection", Integer.valueOf(this.f17156d), "mPeopleOnly", Boolean.valueOf(this.f17157e), "mChangedSince", Long.valueOf(this.f17158f), "mQuery", this.f17159g, "mSearchFields", Integer.valueOf(this.f17160h), "mSortOrder", Integer.valueOf(this.f17161i), "mExtraColumns", Integer.valueOf(this.f17162j));
    }
}
