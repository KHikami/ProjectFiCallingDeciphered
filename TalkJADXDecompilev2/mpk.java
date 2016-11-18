package defpackage;

final class mpk extends mpp {
    private final mor a;
    private final a b;

    mpk(mor mor, a aVar) {
        if (mor == null) {
            throw new NullPointerException("Null backend");
        }
        this.a = mor;
        if (aVar == null) {
            throw new NullPointerException("Null data");
        }
        this.b = aVar;
    }

    mor a() {
        return this.a;
    }

    a b() {
        return this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("LogMapping{backend=").append(valueOf).append(", data=").append(valueOf2).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpp)) {
            return false;
        }
        mpp mpp = (mpp) obj;
        if (this.a.equals(mpp.a()) && this.b.equals(mpp.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
