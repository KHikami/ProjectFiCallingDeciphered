import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
public final class auj extends auf {
    public boolean a;

    public auj() {
        super();
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        Builder b = buf.a(getActivity(), (DialogFragment) this);
        if (this.a) {
            b.setMessage(buf.iz).setTitle(getString(buf.iC, new Object[]{this.c}));
        } else {
            b.setMessage(getString(buf.iC, new Object[]{this.c}));
        }
        Dialog create = b.setPositiveButton(buf.iB, buf.a((DialogFragment) this, this.d)).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
