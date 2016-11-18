package p000;

import android.net.Uri;
import com.google.api.client.http.HttpStatusCodes;

final class fye {
    final Uri f14359a;
    final boolean f14360b;
    boolean f14361c = false;
    int f14362d;
    byte[] f14363e;
    private int f14364f;

    fye(Uri uri, boolean z) {
        this.f14359a = uri;
        this.f14360b = z;
    }

    void m16575a(int i, int i2, byte[] bArr) {
        this.f14362d = i;
        this.f14364f = i2;
        this.f14363e = bArr;
        this.f14361c = true;
    }

    int m16574a() {
        switch (this.f14362d) {
            case -1:
                return 0;
            case 3:
                return 1;
            case 4:
                if (this.f14364f != HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
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
        stringBuilder.append(" pduContentUri=").append(this.f14359a);
        stringBuilder.append(" resultCode=").append(this.f14362d);
        stringBuilder.append(" httpStatusCode=").append(this.f14364f);
        return stringBuilder.toString();
    }
}
