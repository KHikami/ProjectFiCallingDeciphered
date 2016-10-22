public final class mpf {
    private final mqm a;
    private final String b;

    public <T> T a(moc<T> moc_T) {
        moc_T.a(this);
        return this.a.b(moc_T);
    }

    public String a() {
        return this.b;
    }

    public moa b() {
        return this.a.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mpf)) {
            return false;
        }
        mpf mpf = (mpf) obj;
        if (this.a.equals(mpf.a) && this.b.equals(mpf.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
