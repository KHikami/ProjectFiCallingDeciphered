import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.android.contacts.common.vcard.SelectAccountActivity;
import java.util.List;

/* compiled from: PG */
public final class ajr extends aii {
    private /* synthetic */ SelectAccountActivity b;

    public ajr(SelectAccountActivity selectAccountActivity, Context context, List list, int i) {
        this.b = selectAccountActivity;
        super(context, list, i);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        agd agd = (agd) this.a.get(i);
        Intent intent = new Intent();
        intent.putExtra("account_name", agd.a);
        intent.putExtra("account_type", agd.b);
        intent.putExtra("data_set", agd.c);
        this.b.setResult(-1, intent);
        this.b.finish();
    }
}
