package defpackage;

import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import com.android.contacts.common.vcard.VCardService;

/* compiled from: PG */
/* renamed from: aju */
public final class aju implements MediaScannerConnectionClient {
    public final MediaScannerConnection a;
    private String b;
    private /* synthetic */ VCardService c;

    public aju(VCardService vCardService, String str) {
        this.c = vCardService;
        this.a = new MediaScannerConnection(vCardService, this);
        this.b = str;
    }

    public final void onMediaScannerConnected() {
        this.a.scanFile(this.b, null);
    }

    public final void onScanCompleted(String str, Uri uri) {
        this.a.disconnect();
        this.c.a(this);
    }
}
