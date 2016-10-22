package defpackage;

import android.net.Uri;
import com.android.contacts.common.vcard.ImportVCardActivity;

/* compiled from: PG */
/* renamed from: aji */
public final class aji implements Runnable {
    private /* synthetic */ Uri[] a;
    private /* synthetic */ String[] b;
    private /* synthetic */ ImportVCardActivity c;

    public aji(ImportVCardActivity importVCardActivity, Uri[] uriArr, String[] strArr) {
        this.c = importVCardActivity;
        this.a = uriArr;
        this.b = strArr;
    }

    public final void run() {
        if (!this.c.isFinishing()) {
            this.c.d = new ajn(this.c, this.a, this.b);
            this.c.a = new ajp(this.c);
            this.c.showDialog(cob.E);
        }
    }
}
