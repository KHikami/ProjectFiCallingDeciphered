import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.contacts.common.vcard.ImportVCardActivity;
import com.android.contacts.common.vcard.VCardService;
import java.util.Arrays;

/* compiled from: PG */
public final class ajm implements ServiceConnection {
    VCardService a;
    final /* synthetic */ ImportVCardActivity b;

    public ajm(ImportVCardActivity importVCardActivity) {
        this.b = importVCardActivity;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a = ((ajv) iBinder).a;
        String.format("Connected to VCardService. Kick a vCard cache thread (uri: %s)", new Object[]{Arrays.toString(this.b.d.a)});
        this.b.d.start();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
