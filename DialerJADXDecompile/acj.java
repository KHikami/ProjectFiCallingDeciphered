import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
public final class acj implements OnItemClickListener {
    private /* synthetic */ CallSubjectDialog a;

    public acj(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setText((CharSequence) this.a.g.get(i));
        CallSubjectDialog callSubjectDialog = this.a;
        if (callSubjectDialog.e.getVisibility() != 8) {
            int bottom = callSubjectDialog.c.getBottom();
            callSubjectDialog.e.setVisibility(8);
            ViewTreeObserver viewTreeObserver = callSubjectDialog.b.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ack(callSubjectDialog, viewTreeObserver, bottom, false));
        }
    }
}
