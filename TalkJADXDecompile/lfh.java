public final class lfh extends lfd {
    private final int a;

    public lfh(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        return "AccountId{id=" + this.a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lfd)) {
            return false;
        }
        if (this.a != ((lfd) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1000003 ^ this.a;
    }
}
