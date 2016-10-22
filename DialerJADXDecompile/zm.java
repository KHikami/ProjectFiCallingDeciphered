import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
final class zm extends in {
    private /* synthetic */ zl a;

    zm(zl zlVar) {
        this.a = zlVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        super.onInitializeAccessibilityNodeInfo(view, mrVar);
        if (!this.a.a() && this.a.a.k != null) {
            yz yzVar = this.a.a.k;
            zk b = RecyclerView.b(view);
            if (b != null && !b.m() && !yzVar.d.d(b.a)) {
                int a;
                zc zcVar = yzVar.e.c;
                zi ziVar = yzVar.e.A;
                int a2 = yzVar.d() ? yz.a(view) : 0;
                if (yzVar.c()) {
                    a = yz.a(view);
                } else {
                    a = 0;
                }
                mr.a.b(mrVar.b, new na(mr.a.a(a2, 1, a, 1, false, false)).a);
            }
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (this.a.a() || this.a.a.k == null) {
            return false;
        }
        yz yzVar = this.a.a.k;
        zc zcVar = yzVar.e.c;
        zi ziVar = yzVar.e.A;
        return false;
    }
}
