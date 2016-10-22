package org.chromium.net;

import android.content.Context;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.chromium.net.BidirectionalStream.Callback;
import oum;
import owk;
import wi;

public abstract class CronetEngine {

    public class Builder {
        private static final Pattern a;
        private final Context b;
        private final List<QuicHint> c;
        private final List<Pkp> d;
        private boolean e;
        private String f;
        private String g;
        private boolean h;
        private LibraryLoader i;
        private String j;
        private boolean k;
        private boolean l;
        private boolean m;
        private String n;
        private String o;
        private String p;
        private String q;
        private boolean r;
        private int s;
        private long t;
        private String u;
        private long v;
        private boolean w;
        private String x;

        @Retention(RetentionPolicy.SOURCE)
        public @interface HttpCacheSetting {
        }

        static {
            a = Pattern.compile("^[0-9\\.]*$");
        }

        public Builder(Context context) {
            this.c = new LinkedList();
            this.d = new LinkedList();
            this.b = context;
            c("cronet");
            a(false);
            b(false);
            c(true);
            d(false);
            a(0, 0);
            f(false);
            e(true);
        }

        public String a() {
            return owk.a(this.b);
        }

        public Builder a(String str) {
            this.f = str;
            return this;
        }

        public String b() {
            return this.f;
        }

        public Builder b(String str) {
            if (new File(str).isDirectory()) {
                this.g = str;
                return this;
            }
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }

        public String c() {
            return this.g;
        }

        @Deprecated
        public Builder a(boolean z) {
            this.h = false;
            return this;
        }

        public boolean d() {
            return this.h;
        }

        public Builder c(String str) {
            this.j = str;
            return this;
        }

        public String e() {
            return this.j;
        }

        public LibraryLoader f() {
            return this.i;
        }

        public Builder b(boolean z) {
            this.k = z;
            return this;
        }

        public boolean g() {
            return this.k;
        }

        public String a(Context context) {
            return this.k ? owk.b(context) : "";
        }

        public Builder c(boolean z) {
            this.l = true;
            return this;
        }

        public boolean h() {
            return this.l;
        }

        public Builder d(boolean z) {
            this.m = false;
            return this;
        }

        public boolean i() {
            return this.m;
        }

        public String j() {
            return this.n;
        }

        public String k() {
            return this.o;
        }

        public String l() {
            return this.p;
        }

        public String m() {
            return this.q;
        }

        public Builder a(int i, long j) {
            if (i == 3 || i == 2) {
                if (c() == null) {
                    throw new IllegalArgumentException("Storage path must be set");
                }
            } else if (c() != null) {
                throw new IllegalArgumentException("Storage path must not be set");
            }
            boolean z = i == 0 || i == 2;
            this.r = z;
            this.t = j;
            switch (i) {
                case wi.w /*0*/:
                    this.s = 0;
                    break;
                case wi.j /*1*/:
                    this.s = 2;
                    break;
                case wi.l /*2*/:
                case wi.z /*3*/:
                    this.s = 1;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cache mode");
            }
            return this;
        }

        public boolean n() {
            return this.r;
        }

        public long o() {
            return this.t;
        }

        public int p() {
            return this.s;
        }

        public Builder a(String str, int i, int i2) {
            if (str.contains("/")) {
                throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
            }
            this.c.add(new QuicHint(str, i, i2));
            return this;
        }

        public List<QuicHint> q() {
            return this.c;
        }

        public List<Pkp> r() {
            return this.d;
        }

        public Builder e(boolean z) {
            this.e = true;
            return this;
        }

        public boolean s() {
            return this.e;
        }

        public String t() {
            return this.u;
        }

        public long u() {
            return this.v;
        }

        public Builder f(boolean z) {
            this.w = false;
            return this;
        }

        public boolean v() {
            return this.w;
        }

        public String w() {
            return this.x;
        }

        public Context x() {
            return this.b;
        }

        public CronetEngine y() {
            if (b() == null) {
                a(a());
            }
            CronetEngine cronetEngine = null;
            if (!d()) {
                cronetEngine = CronetEngine.a(this);
            }
            if (cronetEngine == null) {
                cronetEngine = new oum(b());
            }
            new StringBuilder("Using network stack: ").append(cronetEngine.b());
            this.v = 0;
            return cronetEngine;
        }
    }

    public abstract BidirectionalStream a(String str, Callback callback, Executor executor, String str2, List<Entry<String, String>> list, int i, boolean z);

    @Deprecated
    public abstract UrlRequest a(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2);

    public abstract void a(RequestFinishedInfo$Listener requestFinishedInfo$Listener);

    public abstract boolean a();

    public abstract String b();

    public abstract void c();

    static CronetEngine a(Builder builder) {
        try {
            CronetEngine cronetEngine = (CronetEngine) builder.x().getClassLoader().loadClass("org.chromium.net.impl.CronetUrlRequestContext").asSubclass(CronetEngine.class).getConstructor(new Class[]{Builder.class}).newInstance(new Object[]{builder});
            if (cronetEngine.a()) {
                return cronetEngine;
            }
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Throwable e2) {
            throw new IllegalStateException("Cannot instantiate: org.chromium.net.impl.CronetUrlRequestContext", e2);
        }
    }
}
