final class arj implements aro {
    int a;
    private final ark b;
    private Class<?> c;

    arj(ark ark) {
        this.b = ark;
    }

    void a(int i, Class<?> cls) {
        this.a = i;
        this.c = cls;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arj)) {
            return false;
        }
        arj arj = (arj) obj;
        if (this.a == arj.a && this.c == arj.c) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("Key{size=").append(i).append("array=").append(valueOf).append("}").toString();
    }

    public void a() {
        this.b.a(this);
    }

    public int hashCode() {
        return (this.c != null ? this.c.hashCode() : 0) + (this.a * 31);
    }
}
