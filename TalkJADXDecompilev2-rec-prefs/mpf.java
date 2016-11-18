package p000;

public final class mpf {
    private final mqm f28040a;
    private final String f28041b;

    public <T> T m32650a(moc<T> moc_T) {
        moc_T.m32603a(this);
        return this.f28040a.m32701b(moc_T);
    }

    public String m32651a() {
        return this.f28041b;
    }

    public moa m32652b() {
        return this.f28040a.f28117a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mpf)) {
            return false;
        }
        mpf mpf = (mpf) obj;
        if (this.f28040a.equals(mpf.f28040a) && this.f28041b.equals(mpf.f28041b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28040a.hashCode() ^ this.f28041b.hashCode();
    }
}
