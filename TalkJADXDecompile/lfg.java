public final class lfg implements lff {
    private final Class<? extends jca> a;

    public lfg(Class<? extends jca> cls) {
        if (cls == null) {
            throw new NullPointerException("Null handler");
        }
        this.a = cls;
    }

    public Class<? extends lff> annotationType() {
        return lff.class;
    }

    public Class<? extends jca> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("@com.google.apps.tiktok.account.ActivityAccountHandler(");
        stringBuilder.append("handler=");
        stringBuilder.append(this.a);
        return stringBuilder.append(')').toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lff)) {
            return false;
        }
        return this.a.equals(((lff) obj).a());
    }

    public int hashCode() {
        return 2086686134 ^ this.a.hashCode();
    }
}
