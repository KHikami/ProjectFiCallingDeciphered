/* compiled from: PG */
public final class djf {
    boolean a;
    String[] b;
    String[] c;
    boolean d;

    public djf(boolean z) {
        this.a = z;
    }

    public djf(dje dje) {
        this.a = dje.a;
        this.b = dje.b;
        this.c = dje.c;
        this.d = dje.d;
    }

    public final djf a(djd... djdArr) {
        if (this.a) {
            String[] strArr = new String[djdArr.length];
            for (int i = 0; i < djdArr.length; i++) {
                strArr[i] = djdArr[i].o;
            }
            this.b = strArr;
            return this;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final djf a(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.b = null;
            } else {
                this.b = (String[]) strArr.clone();
            }
            return this;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final djf a(djo... djoArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (djoArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        } else {
            String[] strArr = new String[djoArr.length];
            for (int i = 0; i < djoArr.length; i++) {
                strArr[i] = djoArr[i].d;
            }
            this.c = strArr;
            return this;
        }
    }

    public final djf b(String... strArr) {
        if (this.a) {
            if (strArr == null) {
                this.c = null;
            } else {
                this.c = (String[]) strArr.clone();
            }
            return this;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final djf a(boolean z) {
        if (this.a) {
            this.d = z;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final dje a() {
        return new dje(this);
    }
}
