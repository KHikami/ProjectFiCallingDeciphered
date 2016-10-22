package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
/* renamed from: acg */
public final class acg implements OnClickListener {
    private /* synthetic */ CallSubjectDialog a;

    public acg(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void onClick(View view) {
        if (this.a.e.getVisibility() == 0) {
            CallSubjectDialog callSubjectDialog = this.a;
            if (callSubjectDialog.e.getVisibility() != 8) {
                int bottom = callSubjectDialog.c.getBottom();
                callSubjectDialog.e.setVisibility(8);
                ViewTreeObserver viewTreeObserver = callSubjectDialog.b.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ack(callSubjectDialog, viewTreeObserver, bottom, false));
            }
        }
    }
}
