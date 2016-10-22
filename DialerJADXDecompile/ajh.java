import android.accounts.Account;
import android.net.Uri;

/* compiled from: PG */
public final class ajh {
    public final Account a;
    public final Uri b;
    public final byte[] c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;

    public ajh(agd agd, byte[] bArr, Uri uri, String str, int i, String str2, int i2, int i3) {
        Account account = null;
        if (!(agd == null || agd.a == null || agd.b == null)) {
            account = new Account(agd.a, agd.b);
        }
        this.a = account;
        this.c = bArr;
        this.b = uri;
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = i2;
        this.h = i3;
    }
}
