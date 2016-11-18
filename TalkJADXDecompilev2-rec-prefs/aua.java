package p000;

final class aua implements atx {
    private final String f2344a;

    aua(String str) {
        this.f2344a = str;
    }

    public String mo391a() {
        return this.f2344a;
    }

    public String toString() {
        String str = this.f2344a;
        return new StringBuilder(String.valueOf(str).length() + 29).append("StringHeaderFactory{value='").append(str).append("'}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aua)) {
            return false;
        }
        return this.f2344a.equals(((aua) obj).f2344a);
    }

    public int hashCode() {
        return this.f2344a.hashCode();
    }
}
