package p000;

final class ipd<T> extends iiq<Void, Void, T> {
    final /* synthetic */ ioy f18638a;
    private final ipb<T> f18639b;

    protected /* bridge */ /* synthetic */ Object mo470a(Object[] objArr) {
        return m22834a();
    }

    ipd(ioy ioy, ipb<T> ipb_T) {
        this.f18638a = ioy;
        super(iiq.f3070j);
        this.f18639b = ipb_T;
    }

    protected void onPreExecute() {
        this.f18639b.mo3353b();
    }

    private T m22834a() {
        return this.f18639b.mo3354c();
    }

    protected void onPostExecute(T t) {
        this.f18639b.mo3351a(t);
    }
}
