package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class dbs implements OnGlobalLayoutListener {
    final /* synthetic */ dbp f9477a;

    dbs(dbp dbp) {
        this.f9477a = dbp;
    }

    public void onGlobalLayout() {
        gwb.m1797a(this.f9477a.f5431d, (OnGlobalLayoutListener) this);
        if (this.f9477a.getActivity() != null) {
            pc pcVar = this.f9477a;
            pcVar.f5432e = new dca(pcVar.getActivity(), pcVar.f5430c, pcVar.m7790s().x, pcVar.mo990c(), pcVar.mo994q(), pcVar.mo995r(), pcVar.mo993e());
            pcVar.f5431d.mo1265a(pcVar);
            pcVar.f5431d.m3193c(1);
            pcVar.f5431d.m3181a(pcVar.f5432e);
            pcVar.f5431d.setAccessibilityDelegate(new dby());
            pcVar.f5431d.postInvalidate();
            pcVar.m7781a(pcVar.getActivity().getSharedPreferences("recentEmoji", 0).getInt("lastCategoryKey", 1), true);
        }
    }
}
