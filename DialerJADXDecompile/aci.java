import android.view.View;
import android.view.View.OnClickListener;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
public final class aci implements OnClickListener {
    private /* synthetic */ CallSubjectDialog a;

    public aci(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void onClick(View view) {
        this.a.finish();
    }
}
