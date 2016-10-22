import android.accounts.Account;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.util.Pair;

/* compiled from: PG */
final class bjx implements Runnable {
    private final String a;
    private final bek b;
    private final bej c;
    private final boolean d;
    private /* synthetic */ bju e;

    public bjx(bju bju, String str, bek bek, bej bej, boolean z) {
        this.e = bju;
        this.a = str;
        this.b = bek;
        this.c = bej;
        this.d = z;
    }

    public final void run() {
        Object obj = null;
        try {
            Object formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(this.a, this.e.d);
            String str = bju.a;
            String valueOf = String.valueOf(bdf.a(this.a));
            String valueOf2 = String.valueOf(bdf.a(formatNumberToE164));
            bdf.a(str, new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()).append("raw number: ").append(valueOf).append(", formatted e164: ").append(valueOf2).toString());
            if (formatNumberToE164 == null) {
                bdf.a(bju.a, "Could not normalize number to e164 standard.  Skipping lookup.");
                return;
            }
            bjt bjt;
            Pair a;
            bjt bjt2;
            if (bju.b != null) {
                bjg b = bju.b.b(this.e.c, formatNumberToE164);
                if (b != null) {
                    aws aws = b.a;
                    if (!(aws == null || aws == aws.a || aws.m)) {
                        Object obj2;
                        if (aws.p == 1) {
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            String str2;
                            Object obj3;
                            bdf.a(bju.a, "Found contact info in GoogleDialer cache.");
                            if (aws.l == null) {
                                str2 = null;
                            } else {
                                str2 = aws.l.toString();
                            }
                            bjt = new bjt(aws.d, aws.j, aws.h, aws.f, aws.g, str2, aws.c, bjg.b(aws.p), aws.n);
                            bjt.j = 3;
                            if (b.c == 2) {
                                obj3 = 1;
                            } else {
                                obj3 = null;
                            }
                            obj = obj3;
                            if (obj != null || bjt == null) {
                                a = a(formatNumberToE164);
                                if (a != null) {
                                    valueOf2 = (String) a.second;
                                    bjt2 = (bjt) a.first;
                                    if (bjt2 != null || bjt2.a == null || bjt2.f == null) {
                                        bdf.a(bju.a, "Contact lookup. Remote contact found, no image.");
                                    } else {
                                        bdf.a(bju.a, "Contact lookup. Remote contact found, loading image.");
                                        this.e.f.execute(new bjw(this.e, valueOf2, bjt2.b, bjt2.f, this.c));
                                    }
                                    this.e.g.obtainMessage(1, Pair.create(this.b, bjt2)).sendToTarget();
                                }
                            }
                            valueOf2 = null;
                            bjt2 = bjt;
                            if (bjt2 != null) {
                            }
                            bdf.a(bju.a, "Contact lookup. Remote contact found, no image.");
                            this.e.g.obtainMessage(1, Pair.create(this.b, bjt2)).sendToTarget();
                        }
                    }
                }
            }
            bjt = null;
            a = a(formatNumberToE164);
            if (a != null) {
                valueOf2 = (String) a.second;
                bjt2 = (bjt) a.first;
                if (bjt2 != null) {
                }
                bdf.a(bju.a, "Contact lookup. Remote contact found, no image.");
                this.e.g.obtainMessage(1, Pair.create(this.b, bjt2)).sendToTarget();
            }
            valueOf2 = null;
            bjt2 = bjt;
            if (bjt2 != null) {
            }
            bdf.a(bju.a, "Contact lookup. Remote contact found, no image.");
            this.e.g.obtainMessage(1, Pair.create(this.b, bjt2)).sendToTarget();
        } catch (Exception e) {
            bdf.a(bju.a, "Error running phone number lookup.", e);
        }
    }

    private final Pair a(String str) {
        Uri uri = null;
        if (!bjy.a(this.e.c)) {
            return null;
        }
        bju bju = this.e;
        Account[] a = bju.a(this.e.c);
        if (a.length == 0) {
            bdf.a(bju.a, "No google account found. Skipping reverse lookup.");
            return null;
        }
        String formatNumber = PhoneNumberUtils.formatNumber(this.a, str, buf.g(this.e.c));
        boolean z = true;
        int i = 0;
        Object obj = null;
        bjt bjt = null;
        while (i < a.length && i < 3) {
            obj = a[i].name;
            bjt a2 = this.e.e.a(this.e.c, obj, str, formatNumber, z, this.d);
            if (a2 != null && a2.a != null) {
                bjt = a2;
                break;
            }
            i++;
            z = false;
            bjt = a2;
        }
        if (!(bju.b == null || bjt == null || bjt.a == null)) {
            int i2;
            bjt.j = 4;
            aws aws = new aws();
            aws.j = str;
            aws.h = bjt.c;
            if (aws.h == null) {
                aws.h = formatNumber;
            }
            aws.d = bjt.a;
            aws.f = bjt.d;
            aws.g = bjt.e;
            String str2 = bjt.f;
            if (str2 != null) {
                uri = Uri.parse(str2);
            }
            aws.l = uri;
            aws.n = bjt.i;
            bjf bjf = bju.b;
            awq b = bjf.b(aws);
            if (bjt.h) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            b.a(i2, "Google Caller ID", 2147483647L);
            b.e = bjt.g;
            bju.b.a(this.e.c, b);
        }
        return Pair.create(bjt, obj);
    }
}
