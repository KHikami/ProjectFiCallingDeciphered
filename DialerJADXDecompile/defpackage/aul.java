package defpackage;

/* compiled from: PG */
/* renamed from: aul */
public final class aul implements auy {
    private /* synthetic */ auk a;

    public aul(auk auk) {
        this.a = auk;
    }

    public final void a(boolean z) {
        if (z) {
            buf.a("BlockedNumbersAutoMigrator, not auto-migrating: blocked numbers exist.", new Object[0]);
            return;
        }
        buf.a("BlockedNumbersAutoMigrator, auto-migrating: no blocked numbers.", new Object[0]);
        buf.a(this.a.a, true);
    }
}
