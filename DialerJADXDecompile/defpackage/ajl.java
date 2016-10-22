package defpackage;

import com.android.contacts.common.vcard.ImportVCardActivity;

/* compiled from: PG */
/* renamed from: ajl */
public final class ajl implements Runnable {
    private final int a;
    private /* synthetic */ ImportVCardActivity b;

    public ajl(ImportVCardActivity importVCardActivity, String str) {
        this.b = importVCardActivity;
        this.a = cob.H;
        importVCardActivity.f = str;
    }

    public final void run() {
        if (!this.b.isFinishing()) {
            this.b.showDialog(this.a);
        }
    }
}
