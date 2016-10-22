package defpackage;

/* renamed from: bth */
public final class bth {
    public boolean a;
    public boolean b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bth bth = (bth) obj;
        if (gwb.g(Boolean.valueOf(this.a), Boolean.valueOf(bth.a)) && gwb.g(Boolean.valueOf(this.b), Boolean.valueOf(bth.b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.c(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
