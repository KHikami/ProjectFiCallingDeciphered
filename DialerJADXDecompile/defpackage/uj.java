package defpackage;

/* compiled from: PG */
/* renamed from: uj */
final class uj implements tk {
    private /* synthetic */ ud a;

    uj(ud udVar) {
        this.a = udVar;
    }

    public final boolean a(su suVar) {
        if (suVar == null) {
            return false;
        }
        ((tr) suVar).getItem().getItemId();
        tk tkVar = this.a.d;
        return tkVar != null ? tkVar.a(suVar) : false;
    }

    public final void a(su suVar, boolean z) {
        if (suVar instanceof tr) {
            suVar.k().a(false);
        }
        tk tkVar = this.a.d;
        if (tkVar != null) {
            tkVar.a(suVar, z);
        }
    }
}
