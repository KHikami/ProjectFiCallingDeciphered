package p000;

final class cna extends iiq<Void, Void, Void> {
    final /* synthetic */ int f5678a;
    final /* synthetic */ dr f5679b;
    final /* synthetic */ cmy f5680c;

    cna(cmy cmy, int i, dr drVar) {
        this.f5680c = cmy;
        this.f5678a = i;
        this.f5679b = drVar;
    }

    protected /* bridge */ /* synthetic */ Object mo470a(Object[] objArr) {
        return m7945a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7946b();
    }

    private Void m7945a() {
        this.f5680c.m7915a(this.f5678a);
        return null;
    }

    private void m7946b() {
        this.f5680c.f5633c = new cnb(this.f5680c, this.f5679b.getChildFragmentManager(), this.f5679b);
        this.f5680c.f5631a.m3181a(this.f5680c.f5633c);
        this.f5680c.f5632b.m8367a(this.f5680c.f5631a);
        this.f5680c.f5631a.m3178a(this.f5680c.f5633c.f5684a, false);
        this.f5680c.f5633c.m7963e();
        this.f5680c.f5631a.setVisibility(0);
        this.f5680c.f5632b.setVisibility(0);
    }
}
