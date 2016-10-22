import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

public class iim {
    private final Context a;
    private final ConnectivityManager b;
    private final WifiManager c;
    private final TelephonyManager d;

    public iim(Context context) {
        this.a = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = (WifiManager) context.getSystemService("wifi");
        this.d = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lks a(int r11) {
        /*
        r10 = this;
        r5 = 2;
        r3 = 0;
        r6 = 0;
        r4 = 1;
        r1 = -1;
        r7 = new lks;
        r7.<init>();
        if (r11 != r5) goto L_0x0041;
    L_0x000c:
        r0 = r10.b;
        r0 = r0.getNetworkInfo(r4);
        if (r0 == 0) goto L_0x0024;
    L_0x0014:
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x0024;
    L_0x001a:
        if (r4 != 0) goto L_0x0026;
    L_0x001c:
        r0 = r1;
    L_0x001d:
        r0 = java.lang.Integer.valueOf(r0);
        r7.a = r0;
    L_0x0023:
        return r7;
    L_0x0024:
        r4 = r6;
        goto L_0x001a;
    L_0x0026:
        r0 = r10.c;
        r0 = r0.getConnectionInfo();
        if (r0 != 0) goto L_0x0030;
    L_0x002e:
        r0 = r1;
        goto L_0x001d;
    L_0x0030:
        r0 = r0.getRssi();
        r2 = -200; // 0xffffffffffffff38 float:NaN double:NaN;
        if (r0 != r2) goto L_0x003a;
    L_0x0038:
        r0 = r1;
        goto L_0x001d;
    L_0x003a:
        r1 = 100;
        r0 = android.net.wifi.WifiManager.calculateSignalLevel(r0, r1);
        goto L_0x001d;
    L_0x0041:
        r0 = 5;
        if (r11 == r0) goto L_0x004e;
    L_0x0044:
        r0 = 6;
        if (r11 == r0) goto L_0x004e;
    L_0x0047:
        r0 = 7;
        if (r11 == r0) goto L_0x004e;
    L_0x004a:
        r0 = 8;
        if (r11 != r0) goto L_0x0082;
    L_0x004e:
        r0 = r4;
    L_0x004f:
        if (r0 == 0) goto L_0x0023;
    L_0x0051:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 17;
        if (r0 < r2) goto L_0x010a;
    L_0x0057:
        r0 = r10.a;
        r2 = "android.permission.ACCESS_COARSE_LOCATION";
        r0 = r0.checkCallingOrSelfPermission(r2);
        if (r0 != 0) goto L_0x0121;
    L_0x0061:
        r0 = r10.d;
        r0 = r0.getAllCellInfo();
        if (r0 == 0) goto L_0x0121;
    L_0x0069:
        r8 = r0.iterator();
        r2 = r3;
    L_0x006e:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0084;
    L_0x0074:
        r0 = r8.next();
        r0 = (android.telephony.CellInfo) r0;
        r9 = r0.isRegistered();
        if (r9 == 0) goto L_0x011e;
    L_0x0080:
        r2 = r0;
        goto L_0x006e;
    L_0x0082:
        r0 = r6;
        goto L_0x004f;
    L_0x0084:
        r0 = r2;
    L_0x0085:
        if (r0 != 0) goto L_0x00a6;
    L_0x0087:
        r0 = r1;
    L_0x0088:
        r0 = java.lang.Integer.valueOf(r0);
        r7.b = r0;
        if (r3 == 0) goto L_0x00fc;
    L_0x0090:
        r0 = r3.getLevel();
        r0 = java.lang.Integer.valueOf(r0);
        r7.c = r0;
        r0 = r3.getAsuLevel();
        r0 = java.lang.Integer.valueOf(r0);
        r7.d = r0;
        goto L_0x0023;
    L_0x00a6:
        r2 = r0 instanceof android.telephony.CellInfoCdma;
        if (r2 == 0) goto L_0x00b2;
    L_0x00aa:
        r0 = (android.telephony.CellInfoCdma) r0;
        r3 = r0.getCellSignalStrength();
        r0 = r4;
        goto L_0x0088;
    L_0x00b2:
        r2 = r0 instanceof android.telephony.CellInfoGsm;
        if (r2 == 0) goto L_0x00be;
    L_0x00b6:
        r0 = (android.telephony.CellInfoGsm) r0;
        r3 = r0.getCellSignalStrength();
        r0 = r5;
        goto L_0x0088;
    L_0x00be:
        r2 = r0 instanceof android.telephony.CellInfoLte;
        if (r2 == 0) goto L_0x00cb;
    L_0x00c2:
        r2 = 3;
        r0 = (android.telephony.CellInfoLte) r0;
        r3 = r0.getCellSignalStrength();
        r0 = r2;
        goto L_0x0088;
    L_0x00cb:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 18;
        if (r2 < r5) goto L_0x00f8;
    L_0x00d1:
        r2 = r0 instanceof android.telephony.CellInfoWcdma;
        if (r2 == 0) goto L_0x00fa;
    L_0x00d5:
        r2 = 4;
        r2 = java.lang.Integer.valueOf(r2);
        r7.b = r2;
        r0 = (android.telephony.CellInfoWcdma) r0;
        r0 = r0.getCellSignalStrength();
        r2 = r0.getLevel();
        r2 = java.lang.Integer.valueOf(r2);
        r7.c = r2;
        r0 = r0.getAsuLevel();
        r0 = java.lang.Integer.valueOf(r0);
        r7.d = r0;
    L_0x00f6:
        if (r4 != 0) goto L_0x0023;
    L_0x00f8:
        r0 = r6;
        goto L_0x0088;
    L_0x00fa:
        r4 = r6;
        goto L_0x00f6;
    L_0x00fc:
        r0 = java.lang.Integer.valueOf(r1);
        r7.c = r0;
        r0 = java.lang.Integer.valueOf(r1);
        r7.d = r0;
        goto L_0x0023;
    L_0x010a:
        r0 = java.lang.Integer.valueOf(r1);
        r7.b = r0;
        r0 = java.lang.Integer.valueOf(r1);
        r7.c = r0;
        r0 = java.lang.Integer.valueOf(r1);
        r7.d = r0;
        goto L_0x0023;
    L_0x011e:
        r0 = r2;
        goto L_0x0080;
    L_0x0121:
        r0 = r3;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: iim.a(int):lks");
    }

    public int a() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo == null ? 0 : b(activeNetworkInfo.getType());
    }

    public int b(int i) {
        Object obj;
        if (i == 0 || i == 4 || i == 5 || i == 3) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            switch (this.d.getNetworkType()) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                case wi.h /*4*/:
                case wi.q /*7*/:
                case wi.dB /*11*/:
                    return 6;
                case wi.z /*3*/:
                case wi.p /*5*/:
                case wi.s /*6*/:
                case wi.m /*8*/:
                case wi.n /*9*/:
                case wi.dr /*10*/:
                case wi.dM /*12*/:
                case wi.g /*14*/:
                case wi.dJ /*15*/:
                    return 7;
                case wi.dD /*13*/:
                    return 8;
                default:
                    return 5;
            }
        }
        switch (i) {
            case wi.j /*1*/:
                return 2;
            case wi.s /*6*/:
                return 3;
            case wi.q /*7*/:
                return 4;
            case wi.n /*9*/:
                return 1;
            default:
                return 0;
        }
    }
}
