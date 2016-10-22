package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* renamed from: aii */
public class aii implements OnClickListener {
    public final List a;
    private final Context b;
    private final int c;
    private final int d;

    private aii(Context context, List list, int i, int i2) {
        if (list == null || list.size() == 0) {
            Log.e("AccountSelectionUtil", "The size of Account list is 0.");
        }
        this.b = context;
        this.a = list;
        this.c = i;
        this.d = -1;
    }

    public aii(Context context, List list, int i) {
        this(context, list, i, -1);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aig.a(this.b, this.c, (agd) this.a.get(i), this.d);
    }
}
