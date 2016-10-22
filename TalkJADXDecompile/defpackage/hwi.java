package defpackage;

/* renamed from: hwi */
public final class hwi {
    private final hwj<Integer> a;

    public hwi() {
        this.a = new hwj();
    }

    public int a(String str) {
        return this.a.a(str);
    }

    public void a(String str, int i) {
        this.a.a(str, Integer.valueOf(i));
    }

    public int b(String str, int i) {
        return ((Integer) this.a.a(str, i)).intValue();
    }

    public String toString() {
        return this.a.toString();
    }
}
