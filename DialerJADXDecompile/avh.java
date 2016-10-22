import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/* compiled from: PG */
public final class avh extends DialogFragment {
    public aum a;
    public auo b;

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        Dialog create = new Builder(getActivity()).setTitle(buf.is).setMessage(buf.ir).setPositiveButton(buf.ip, null).setNegativeButton(buf.iq, null).create();
        create.setOnShowListener(new avi(this));
        return create;
    }

    public final void onPause() {
        dismiss();
        this.a = null;
        this.b = null;
        super.onPause();
    }
}
