package p000;

public final class bap {
    private Class<?> f2737a;
    private Class<?> f2738b;
    private Class<?> f2739c;

    public bap(Class<?> cls, Class<?> cls2) {
        m4678a(cls, cls2);
    }

    public bap(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m4679a(cls, cls2, cls3);
    }

    public void m4678a(Class<?> cls, Class<?> cls2) {
        m4679a(cls, cls2, null);
    }

    public void m4679a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f2737a = cls;
        this.f2738b = cls2;
        this.f2739c = cls3;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2737a);
        String valueOf2 = String.valueOf(this.f2738b);
        return new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()).append("MultiClassKey{first=").append(valueOf).append(", second=").append(valueOf2).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bap bap = (bap) obj;
        if (!this.f2737a.equals(bap.f2737a)) {
            return false;
        }
        if (!this.f2738b.equals(bap.f2738b)) {
            return false;
        }
        if (baq.m4687a(this.f2739c, bap.f2739c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2739c != null ? this.f2739c.hashCode() : 0) + (((this.f2737a.hashCode() * 31) + this.f2738b.hashCode()) * 31);
    }
}
