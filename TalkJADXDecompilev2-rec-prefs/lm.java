package p000;

public class lm<T> implements ll<T> {
    private final Object[] f25452a;
    private int f25453b;

    public lm(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f25452a = new Object[i];
    }

    public T mo436a() {
        if (this.f25453b <= 0) {
            return null;
        }
        int i = this.f25453b - 1;
        T t = this.f25452a[i];
        this.f25452a[i] = null;
        this.f25453b--;
        return t;
    }

    public boolean mo437a(T t) {
        boolean z;
        for (int i = 0; i < this.f25453b; i++) {
            if (this.f25452a[i] == t) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        } else if (this.f25453b >= this.f25452a.length) {
            return false;
        } else {
            this.f25452a[this.f25453b] = t;
            this.f25453b++;
            return true;
        }
    }
}
