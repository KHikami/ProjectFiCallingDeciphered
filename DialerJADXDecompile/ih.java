/* compiled from: PG */
public final class ih {
    public final Object a;
    public final Object b;

    public ih(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ih)) {
            return false;
        }
        ih ihVar = (ih) obj;
        if (a(ihVar.a, this.a) && a(ihVar.b, this.b)) {
            return true;
        }
        return false;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.a == null ? 0 : this.a.hashCode();
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode ^ i;
    }
}
