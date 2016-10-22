final class ipd<T> extends iiq<Void, Void, T> {
    final /* synthetic */ ioy a;
    private final ipb<T> b;

    protected /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return a();
    }

    ipd(ioy ioy, ipb<T> ipb_T) {
        this.a = ioy;
        super(iiq.j);
        this.b = ipb_T;
    }

    protected void onPreExecute() {
        this.b.b();
    }

    private T a() {
        return this.b.c();
    }

    protected void onPostExecute(T t) {
        this.b.a(t);
    }
}
