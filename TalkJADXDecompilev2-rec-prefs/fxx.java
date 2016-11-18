package p000;

import android.net.Uri;
import com.google.api.client.http.HttpStatusCodes;

final class fxx {
    final Uri f14340a;
    boolean f14341b = false;
    int f14342c;
    private int f14343d;

    public fxx(Uri uri) {
        this.f14340a = uri;
    }

    public void m16550a(int i, int i2) {
        this.f14342c = i;
        this.f14343d = i2;
        this.f14341b = true;
    }

    public int m16549a() {
        switch (this.f14342c) {
            case -1:
                return 0;
            case 3:
                return 1;
            case 4:
                if (this.f14343d != HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
                    return 1;
                }
                return 2;
            default:
                return 2;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DownloadResult:");
        stringBuilder.append(" destinationUri=").append(this.f14340a);
        stringBuilder.append(" resultCode=").append(this.f14342c);
        stringBuilder.append(" httpStatusCode=").append(this.f14343d);
        return stringBuilder.toString();
    }
}
