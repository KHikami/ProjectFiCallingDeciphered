import android.telecom.Call;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class bay implements OnClickListener {
    bay(baw baw) {
    }

    public final void onClick(View view) {
        String str = (String) ((View) view.getParent()).getTag();
        Object a = bdp.a();
        Call a2 = bdp.a(str);
        if (a2 != null) {
            a2.splitFromConference();
            return;
        }
        String str2 = "error separateCall, call not in call list ";
        str = String.valueOf(str);
        bdf.c(a, str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
