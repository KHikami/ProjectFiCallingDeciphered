package defpackage;

public abstract class fxn {
    public abstract int a();

    public abstract long b();

    public abstract long c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fxn)) {
            return false;
        }
        fxn fxn = (fxn) obj;
        if (a() == fxn.a() && b() == fxn.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String valueOf = String.valueOf(Integer.toString(a()));
        String valueOf2 = String.valueOf(Long.toString(b()));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
