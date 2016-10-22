/* compiled from: PG */
final class vb {
    int a;
    int b;
    Object c;
    int d;

    vb(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
        switch (this.a) {
            case rq.b /*1*/:
                str = "add";
                break;
            case rq.c /*2*/:
                str = "rm";
                break;
            case rl.f /*4*/:
                str = "up";
                break;
            case rl.j /*8*/:
                str = "mv";
                break;
            default:
                str = "??";
                break;
        }
        return append.append(str).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vb vbVar = (vb) obj;
        if (this.a != vbVar.a) {
            return false;
        }
        if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == vbVar.b && this.b == vbVar.d) {
            return true;
        }
        if (this.d != vbVar.d) {
            return false;
        }
        if (this.b != vbVar.b) {
            return false;
        }
        if (this.c != null) {
            if (this.c.equals(vbVar.c)) {
                return true;
            }
            return false;
        } else if (vbVar.c != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
