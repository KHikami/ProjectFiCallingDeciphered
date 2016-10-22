final class cna extends iiq<Void, Void, Void> {
    final /* synthetic */ int a;
    final /* synthetic */ dr b;
    final /* synthetic */ cmy c;

    cna(cmy cmy, int i, dr drVar) {
        this.c = cmy;
        this.a = i;
        this.b = drVar;
    }

    protected /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        this.c.a(this.a);
        return null;
    }

    private void b() {
        this.c.c = new cnb(this.c, this.b.getChildFragmentManager(), this.b);
        this.c.a.a(this.c.c);
        this.c.b.a(this.c.a);
        this.c.a.a(this.c.c.a, false);
        this.c.c.e();
        this.c.a.setVisibility(0);
        this.c.b.setVisibility(0);
    }
}
