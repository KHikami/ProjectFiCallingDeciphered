package p000;

final class arj implements aro {
    int f2216a;
    private final ark f2217b;
    private Class<?> f2218c;

    arj(ark ark) {
        this.f2217b = ark;
    }

    void m3855a(int i, Class<?> cls) {
        this.f2216a = i;
        this.f2218c = cls;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arj)) {
            return false;
        }
        arj arj = (arj) obj;
        if (this.f2216a == arj.f2216a && this.f2218c == arj.f2218c) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.f2216a;
        String valueOf = String.valueOf(this.f2218c);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("Key{size=").append(i).append("array=").append(valueOf).append("}").toString();
    }

    public void mo356a() {
        this.f2217b.m3821a(this);
    }

    public int hashCode() {
        return (this.f2218c != null ? this.f2218c.hashCode() : 0) + (this.f2216a * 31);
    }
}
