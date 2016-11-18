package p000;

public final class lfg implements lff {
    private final Class<? extends jca> f24899a;

    public lfg(Class<? extends jca> cls) {
        if (cls == null) {
            throw new NullPointerException("Null handler");
        }
        this.f24899a = cls;
    }

    public Class<? extends lff> annotationType() {
        return lff.class;
    }

    public Class<? extends jca> mo3690a() {
        return this.f24899a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("@com.google.apps.tiktok.account.ActivityAccountHandler(");
        stringBuilder.append("handler=");
        stringBuilder.append(this.f24899a);
        return stringBuilder.append(')').toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lff)) {
            return false;
        }
        return this.f24899a.equals(((lff) obj).mo3690a());
    }

    public int hashCode() {
        return 2086686134 ^ this.f24899a.hashCode();
    }
}
