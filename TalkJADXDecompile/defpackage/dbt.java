package defpackage;

/* renamed from: dbt */
final class dbt implements Runnable {
    final /* synthetic */ dbp a;

    dbt(dbp dbp) {
        this.a = dbp;
    }

    public void run() {
        if (this.a.c != null) {
            this.a.c.a();
        }
        this.a.i.postDelayed(this.a.h, 50);
    }
}
