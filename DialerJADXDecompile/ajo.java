import android.os.AsyncTask;
import com.android.contacts.common.vcard.NfcImportVCardActivity;
import com.android.contacts.common.vcard.VCardService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ajo extends AsyncTask {
    private /* synthetic */ NfcImportVCardActivity a;

    public ajo(NfcImportVCardActivity nfcImportVCardActivity) {
        this.a = nfcImportVCardActivity;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        VCardService[] vCardServiceArr = (VCardService[]) objArr;
        Object a = this.a.a();
        if (a == null) {
            return null;
        }
        List arrayList = new ArrayList();
        arrayList.add(a);
        vCardServiceArr[0].a(arrayList, this.a);
        return a;
    }

    public final void onCancelled() {
        this.a.unbindService(this.a);
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.unbindService(this.a);
    }
}
