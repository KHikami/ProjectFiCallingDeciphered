import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
public final class bdg extends DialogFragment {
    String a;
    private String b;

    public bdg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        if (this.b == null && bundle != null) {
            this.a = bundle.getString("CALL_ID");
            this.b = bundle.getString("POST_CHARS");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getResources().getText(aq.dD));
        stringBuilder.append(this.b);
        Builder builder = new Builder(getActivity());
        builder.setMessage(stringBuilder.toString());
        builder.setPositiveButton(aq.dl, new bdh(this));
        builder.setNegativeButton(aq.dk, new bdi(this));
        return builder.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        bdp.a().a(this.a, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("CALL_ID", this.a);
        bundle.putString("POST_CHARS", this.b);
    }
}
