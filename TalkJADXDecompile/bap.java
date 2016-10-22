public final class bap {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public bap(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public bap(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2) {
        a(cls, cls2, null);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
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
        if (!this.a.equals(bap.a)) {
            return false;
        }
        if (!this.b.equals(bap.b)) {
            return false;
        }
        if (baq.a(this.c, bap.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c != null ? this.c.hashCode() : 0) + (((this.a.hashCode() * 31) + this.b.hashCode()) * 31);
    }
}
