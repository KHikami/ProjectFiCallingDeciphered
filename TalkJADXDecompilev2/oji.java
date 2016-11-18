package defpackage;

public final class oji {
    private ojh a = new ojh();

    oji() {
    }

    public <T> oji a(ojj<T> ojj_T, T t) {
        this.a.a.put(ojj_T, t);
        return this;
    }

    public <T> oji a(ojh ojh) {
        this.a.a.putAll(ojh.a);
        return this;
    }

    public ojh a() {
        bm.b(this.a != null, "Already built");
        ojh ojh = this.a;
        this.a = null;
        return ojh;
    }
}
