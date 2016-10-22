final class aaa {
    int a;
    int b;
    Object c;
    int d;

    aaa(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    private String a() {
        switch (this.a) {
            case wi.j /*1*/:
                return "add";
            case wi.l /*2*/:
                return "rm";
            case wi.h /*4*/:
                return "up";
            case wi.m /*8*/:
                return "mv";
            default:
                return "??";
        }
    }

    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaa aaa = (aaa) obj;
        if (this.a != aaa.a) {
            return false;
        }
        if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == aaa.b && this.b == aaa.d) {
            return true;
        }
        if (this.d != aaa.d) {
            return false;
        }
        if (this.b != aaa.b) {
            return false;
        }
        if (this.c != null) {
            if (this.c.equals(aaa.c)) {
                return true;
            }
            return false;
        } else if (aaa.c != null) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
