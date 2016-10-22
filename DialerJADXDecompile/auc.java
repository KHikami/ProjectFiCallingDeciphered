import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/* compiled from: PG */
public final class auc extends auf {
    auh a;
    boolean b;

    public auc() {
        super();
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public static DialogFragment a(String str, boolean z, auh auh, OnDismissListener onDismissListener) {
        DialogFragment auc = new auc();
        auc.b = z;
        auc.c = str;
        auc.a = auh;
        auc.e = onDismissListener;
        return auc;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View inflate = View.inflate(getActivity(), buf.ic, null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(buf.ib);
        checkBox.setChecked(this.b);
        checkBox.setOnCheckedChangeListener(new aud(this));
        ((TextView) inflate.findViewById(buf.ia)).setText(buf.o(r1));
        Dialog create = buf.a(getActivity(), (DialogFragment) this).setView(inflate).setTitle(getString(buf.il, new Object[]{this.c})).setPositiveButton(buf.ii, new aue(this, checkBox)).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
