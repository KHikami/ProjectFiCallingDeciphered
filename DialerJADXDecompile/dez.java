/* compiled from: PG */
public final class dez {
    boolean a;
    String[] b;
    String[] c;
    boolean d;

    dez(boolean z) {
        this.a = z;
    }

    public dez(dey dey) {
        this.a = dey.b;
        this.b = dey.d;
        this.c = dey.e;
        this.d = dey.c;
    }

    public final dez a(dex... dexArr) {
        if (this.a) {
            Object obj = new String[dexArr.length];
            for (int i = 0; i < dexArr.length; i++) {
                obj[i] = dexArr[i].s;
            }
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (obj.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                this.b = (String[]) obj.clone();
                return this;
            }
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final dez a(dfa... dfaArr) {
        if (this.a) {
            Object obj = new String[dfaArr.length];
            for (int i = 0; i < dfaArr.length; i++) {
                obj[i] = dfaArr[i].d;
            }
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (obj.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                this.c = (String[]) obj.clone();
                return this;
            }
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final dez a(boolean z) {
        if (this.a) {
            this.d = true;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final dey a() {
        return new dey(this);
    }
}
