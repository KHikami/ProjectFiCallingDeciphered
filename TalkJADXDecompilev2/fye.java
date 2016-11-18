package defpackage;

import android.net.Uri;
import com.google.api.client.http.HttpStatusCodes;

final class fye {
    final Uri a;
    final boolean b;
    boolean c = false;
    int d;
    byte[] e;
    private int f;

    fye(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    void a(int i, int i2, byte[] bArr) {
        this.d = i;
        this.f = i2;
        this.e = bArr;
        this.c = true;
    }

    int a() {
        switch (this.d) {
            case -1:
                return 0;
            case 3:
                return 1;
            case 4:
                if (this.f != HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
                    return 1;
                }
                return 2;
            default:
                return 2;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MmsSendResult:");
        stringBuilder.append(" pduContentUri=").append(this.a);
        stringBuilder.append(" resultCode=").append(this.d);
        stringBuilder.append(" httpStatusCode=").append(this.f);
        return stringBuilder.toString();
    }
}
