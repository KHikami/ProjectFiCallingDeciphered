package defpackage;

import android.net.Uri;
import com.google.api.client.http.HttpStatusCodes;

final class fxx {
    final Uri a;
    boolean b = false;
    int c;
    private int d;

    public fxx(Uri uri) {
        this.a = uri;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.b = true;
    }

    public int a() {
        switch (this.c) {
            case -1:
                return 0;
            case 3:
                return 1;
            case 4:
                if (this.d != HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
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
        stringBuilder.append(" destinationUri=").append(this.a);
        stringBuilder.append(" resultCode=").append(this.c);
        stringBuilder.append(" httpStatusCode=").append(this.d);
        return stringBuilder.toString();
    }
}
