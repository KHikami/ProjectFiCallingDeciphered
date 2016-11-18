package p000;

final class mpk extends mpp {
    private final mor f28046a;
    private final C0000a f28047b;

    mpk(mor mor, C0000a c0000a) {
        if (mor == null) {
            throw new NullPointerException("Null backend");
        }
        this.f28046a = mor;
        if (c0000a == null) {
            throw new NullPointerException("Null data");
        }
        this.f28047b = c0000a;
    }

    mor mo3907a() {
        return this.f28046a;
    }

    C0000a mo3908b() {
        return this.f28047b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28046a);
        String valueOf2 = String.valueOf(this.f28047b);
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
        if (this.f28046a.equals(mpp.mo3907a()) && this.f28047b.equals(mpp.mo3908b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f28046a.hashCode() ^ 1000003) * 1000003) ^ this.f28047b.hashCode();
    }
}
