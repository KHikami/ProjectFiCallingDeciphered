package defpackage;

/* renamed from: aua */
final class aua implements atx {
    private final String a;

    aua(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 29).append("StringHeaderFactory{value='").append(str).append("'}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aua)) {
            return false;
        }
        return this.a.equals(((aua) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
