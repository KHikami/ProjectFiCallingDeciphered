package p000;

public final class lfh extends lfd {
    private final int f24900a;

    public lfh(int i) {
        this.f24900a = i;
    }

    public int mo3691a() {
        return this.f24900a;
    }

    public String toString() {
        return "AccountId{id=" + this.f24900a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lfd)) {
            return false;
        }
        if (this.f24900a != ((lfd) obj).mo3691a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1000003 ^ this.f24900a;
    }
}
