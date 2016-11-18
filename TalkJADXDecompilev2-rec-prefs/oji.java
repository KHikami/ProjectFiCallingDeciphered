package p000;

public final class oji {
    private ojh f33083a = new ojh();

    oji() {
    }

    public <T> oji m38564a(ojj<T> ojj_T, T t) {
        this.f33083a.f33082a.put(ojj_T, t);
        return this;
    }

    public <T> oji m38563a(ojh ojh) {
        this.f33083a.f33082a.putAll(ojh.f33082a);
        return this;
    }

    public ojh m38562a() {
        bm.b(this.f33083a != null, "Already built");
        ojh ojh = this.f33083a;
        this.f33083a = null;
        return ojh;
    }
}
