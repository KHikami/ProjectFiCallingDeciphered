import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
public class bia extends DialogFragment {
    public static final String a;
    static final bjf b;
    TextView c;
    TextView d;
    bjg e;
    String f;
    Context g;

    static {
        a = bia.class.getSimpleName();
        b = new bjf();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = getActivity().getApplicationContext();
        setRetainInstance(true);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.f = getArguments().getString("number");
        Context activity = getActivity();
        View inflate = getActivity().getLayoutInflater().inflate(buf.ls, null, false);
        this.c = (TextView) inflate.findViewById(buf.lp);
        this.d = (TextView) inflate.findViewById(buf.lq);
        new bid(this).execute(new Void[0]);
        return new Builder(activity).setTitle(buf.lP).setPositiveButton(buf.lM, new bic(this, activity)).setNegativeButton(buf.lx, new bib(this)).setView(inflate).create();
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
