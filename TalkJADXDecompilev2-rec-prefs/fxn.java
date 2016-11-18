package p000;

public abstract class fxn {
    public abstract int mo2112a();

    public abstract long mo2113b();

    public abstract long mo2114c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fxn)) {
            return false;
        }
        fxn fxn = (fxn) obj;
        if (mo2112a() == fxn.mo2112a() && mo2113b() == fxn.mo2113b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String valueOf = String.valueOf(Integer.toString(mo2112a()));
        String valueOf2 = String.valueOf(Long.toString(mo2113b()));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
