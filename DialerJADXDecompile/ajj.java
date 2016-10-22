import android.widget.Toast;
import com.android.contacts.common.vcard.ImportVCardActivity;

/* compiled from: PG */
public final class ajj implements Runnable {
    private /* synthetic */ ImportVCardActivity a;

    public ajj(ImportVCardActivity importVCardActivity) {
        this.a = importVCardActivity;
    }

    public final void run() {
        Toast.makeText(this.a, this.a.getString(buf.gR), 1).show();
    }
}
