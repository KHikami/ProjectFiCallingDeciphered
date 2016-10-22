import android.database.sqlite.SQLiteException;

final class bod extends bpf {
    private /* synthetic */ bob d;

    bod(bob bob, bnp bnp) {
        this.d = bob;
        super(bnp);
    }

    public final void a() {
        bob bob = this.d;
        try {
            bny bny = bob.b;
            cqn.b();
            bny.o();
            if (bny.c.a(86400000)) {
                bny.c.a();
                bny.b("Deleting stale hits (if any)");
                bny.a("Deleted stale hits, count", Integer.valueOf(bny.m().delete("hits2", "hit_time < ?", new String[]{Long.toString(bny.f().a() - 2592000000L)})));
            }
            bob.l();
        } catch (SQLiteException e) {
            bob.d("Failed to delete stale hits", e);
        }
        bob.e.a(86400000);
    }
}
