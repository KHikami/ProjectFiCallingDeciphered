import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;

/* compiled from: PG */
public final class aui extends auf {
    public aui() {
        super();
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public static DialogFragment a(String str, aug aug, OnDismissListener onDismissListener) {
        DialogFragment aui = new aui();
        aui.c = str;
        aui.d = aug;
        aui.e = onDismissListener;
        return aui;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        Dialog create = buf.a(getActivity(), (DialogFragment) this).setTitle(buf.iv).setMessage(getString(buf.iu, new Object[]{this.c})).setPositiveButton(buf.it, buf.a((DialogFragment) this, this.d)).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
