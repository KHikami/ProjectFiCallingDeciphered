package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class dbs implements OnGlobalLayoutListener {
    final /* synthetic */ dbp a;

    dbs(dbp dbp) {
        this.a = dbp;
    }

    public void onGlobalLayout() {
        gwb.a(this.a.d, (OnGlobalLayoutListener) this);
        if (this.a.getActivity() != null) {
            pc pcVar = this.a;
            pcVar.e = new dca(pcVar.getActivity(), pcVar.c, pcVar.s().x, pcVar.c(), pcVar.q(), pcVar.r(), pcVar.e());
            pcVar.d.a(pcVar);
            pcVar.d.c(1);
            pcVar.d.a(pcVar.e);
            pcVar.d.setAccessibilityDelegate(new dby());
            pcVar.d.postInvalidate();
            pcVar.a(pcVar.getActivity().getSharedPreferences("recentEmoji", 0).getInt("lastCategoryKey", 1), true);
        }
    }
}
