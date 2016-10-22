import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.android.contacts.common.vcard.ImportVCardActivity;

/* compiled from: PG */
public final class ajk implements OnCancelListener, OnClickListener {
    private /* synthetic */ ImportVCardActivity a;

    public ajk(ImportVCardActivity importVCardActivity) {
        this.a = importVCardActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
