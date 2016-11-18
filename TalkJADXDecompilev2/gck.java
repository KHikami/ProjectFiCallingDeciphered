package defpackage;

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
    private static int a = -1;

    static gcm a(Context context, int i, int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i3 = -1;
        CellInfo a = gck.a(context);
        if (a != null && (a instanceof CellInfoCdma)) {
            CellIdentityCdma cellIdentity = ((CellInfoCdma) a).getCellIdentity();
            if (cellIdentity != null) {
                i3 = cellIdentity.getSystemId();
            }
        }
        return new gcm(i, i2, telephonyManager.getPhoneType(), telephonyManager.getNetworkOperator(), telephonyManager.getNetworkType(), i3);
    }

    public static void a(Context context, gcl gcl) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            PhoneStateListener gcn = new gcn(context, gcl);
            telephonyManager.listen(gcn, 257);
            telephonyManager.listen(gcn, 0);
            return;
        }
        gcl.a(gck.a(context, 2, -1));
    }

    public static CellInfo a(Context context) {
        if (gwb.Q(context)) {
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
        glk.c("Babel_telephony", "TeleAccessNetworkInfoUtil.getRegisteredCellInfo, no coarse location permission.", new Object[0]);
        return null;
    }

    private static int a(int i) {
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

    static int a(SignalStrength signalStrength) {
        if (a != -1) {
            return gck.a(a);
        }
        try {
            Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getLevel", new Class[0]);
            if (declaredMethod != null) {
                return gck.a(gwb.a((Integer) declaredMethod.invoke(signalStrength, new Object[0])));
            }
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleCellServiceUtils.getSignalLevelPercent, error calling SignalStrength.getLevel", e);
        }
        return -1;
    }
}
