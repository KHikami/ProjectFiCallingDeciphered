package p000;

import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.List;

public final class gck {
    private static int f14658a = -1;

    static gcm m16926a(Context context, int i, int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i3 = -1;
        CellInfo a = gck.m16925a(context);
        if (a != null && (a instanceof CellInfoCdma)) {
            CellIdentityCdma cellIdentity = ((CellInfoCdma) a).getCellIdentity();
            if (cellIdentity != null) {
                i3 = cellIdentity.getSystemId();
            }
        }
        return new gcm(i, i2, telephonyManager.getPhoneType(), telephonyManager.getNetworkOperator(), telephonyManager.getNetworkType(), i3);
    }

    public static void m16927a(Context context, gcl gcl) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            PhoneStateListener gcn = new gcn(context, gcl);
            telephonyManager.listen(gcn, 257);
            telephonyManager.listen(gcn, 0);
            return;
        }
        gcl.mo2190a(gck.m16926a(context, 2, -1));
    }

    public static CellInfo m16925a(Context context) {
        if (gwb.m1442Q(context)) {
            List<CellInfo> allCellInfo = ((TelephonyManager) context.getSystemService("phone")).getAllCellInfo();
            if (allCellInfo != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        return cellInfo;
                    }
                }
            }
            return null;
        }
        glk.m17979c("Babel_telephony", "TeleAccessNetworkInfoUtil.getRegisteredCellInfo, no coarse location permission.", new Object[0]);
        return null;
    }

    private static int m16923a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 25;
            case 2:
                return 50;
            case 3:
                return 75;
            case 4:
                return 100;
            default:
                return -1;
        }
    }

    static int m16924a(SignalStrength signalStrength) {
        if (f14658a != -1) {
            return gck.m16923a(f14658a);
        }
        try {
            Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getLevel", new Class[0]);
            if (declaredMethod != null) {
                return gck.m16923a(gwb.m1507a((Integer) declaredMethod.invoke(signalStrength, new Object[0])));
            }
        } catch (Throwable e) {
            glk.m17980d("Babel_telephony", "TeleCellServiceUtils.getSignalLevelPercent, error calling SignalStrength.getLevel", e);
        }
        return -1;
    }
}
