package p000;

final class aaa {
    int f3a;
    int f4b;
    Object f5c;
    int f6d;

    aaa(int i, int i2, int i3, Object obj) {
        this.f3a = i;
        this.f4b = i2;
        this.f6d = i3;
        this.f5c = obj;
    }

    private String m30a() {
        switch (this.f3a) {
            case 1:
                return "add";
            case 2:
                return "rm";
            case 4:
                return "up";
            case 8:
                return "mv";
            default:
                return "??";
        }
    }

    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + "[" + m30a() + ",s:" + this.f4b + "c:" + this.f6d + ",p:" + this.f5c + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaa aaa = (aaa) obj;
        if (this.f3a != aaa.f3a) {
            return false;
        }
        if (this.f3a == 8 && Math.abs(this.f6d - this.f4b) == 1 && this.f6d == aaa.f4b && this.f4b == aaa.f6d) {
            return true;
        }
        if (this.f6d != aaa.f6d) {
            return false;
        }
        if (this.f4b != aaa.f4b) {
            return false;
        }
        if (this.f5c != null) {
            if (this.f5c.equals(aaa.f5c)) {
                return true;
            }
            return false;
        } else if (aaa.f5c != null) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return (((this.f3a * 31) + this.f4b) * 31) + this.f6d;
    }
}
