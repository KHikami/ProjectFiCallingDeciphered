/* compiled from: PG */
public class ii {
    final Object[] a;
    int b;

    public Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    public boolean a(Object obj) {
        if (b(obj)) {
            throw new IllegalStateException("Already in the pool!");
        } else if (this.b >= this.a.length) {
            return false;
        } else {
            this.a[this.b] = obj;
            this.b++;
            return true;
        }
    }

    public ii(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    boolean b(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == obj) {
                return true;
            }
        }
        return false;
    }
}
