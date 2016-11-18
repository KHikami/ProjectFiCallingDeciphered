package p000;

public final class lk<F, S> {
    public final F f25131a;
    public final S f25132b;

    public lk(F f, S s) {
        this.f25131a = f;
        this.f25132b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        if (lk.m29198a(lkVar.f25131a, this.f25131a) && lk.m29198a(lkVar.f25132b, this.f25132b)) {
            return true;
        }
        return false;
    }

    private static boolean m29198a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f25131a == null ? 0 : this.f25131a.hashCode();
        if (this.f25132b != null) {
            i = this.f25132b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f25131a) + " " + String.valueOf(this.f25132b) + "}";
    }
}
