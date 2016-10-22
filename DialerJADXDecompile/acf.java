import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
public final class acf implements OnClickListener {
    private /* synthetic */ CallSubjectDialog a;

    public acf(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void onClick(View view) {
        boolean z;
        Context context = this.a;
        View view2 = this.a.d;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
        }
        Context context2 = this.a;
        if (this.a.e.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (!z || context2.e.getVisibility() != 0) {
            if (z || context2.e.getVisibility() != 8) {
                int bottom = context2.c.getBottom();
                if (z) {
                    context2.e.setAdapter(new ArrayAdapter(context2, buf.dp, context2.g));
                    context2.e.setVisibility(0);
                } else {
                    context2.e.setVisibility(8);
                }
                ViewTreeObserver viewTreeObserver = context2.b.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ack(context2, viewTreeObserver, bottom, z));
            }
        }
    }
}
