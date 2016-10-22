final class iut extends iur {
    final /* synthetic */ ius a;

    iut(ius ius) {
        this.a = ius;
    }

    public void a(iuq iuq) {
        if (!((Boolean) this.a.b.get(iuq)).booleanValue()) {
            this.a.b.put(iuq, Boolean.valueOf(true));
            ius ius = this.a;
            ius.c++;
            this.a.c();
        }
    }
}
