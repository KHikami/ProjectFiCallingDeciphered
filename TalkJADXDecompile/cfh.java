import android.widget.AbsListView;
import android.widget.ListView;

final class cfh implements Runnable {
    final /* synthetic */ AbsListView a;
    final /* synthetic */ bko b;
    final /* synthetic */ cdr c;

    cfh(cdr cdr, AbsListView absListView, bko bko) {
        this.c = cdr;
        this.a = absListView;
        this.b = bko;
    }

    public void run() {
        if (!this.c.at && this.c.getActivity() != null && !this.c.getActivity().isFinishing()) {
            ((ListView) this.c.bI).setSelection(((bns) this.c.bH).getCount() - 1);
            gwb.a(new cfi(this), 200);
        }
    }
}
