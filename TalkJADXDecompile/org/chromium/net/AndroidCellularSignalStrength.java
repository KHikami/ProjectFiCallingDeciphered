package org.chromium.net;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;
import nzf;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class AndroidCellularSignalStrength {
    @CalledByNative
    public static int getSignalStrengthDbm(Context context) {
        List a = a(context);
        if (a == null || a.size() != 1) {
            return nzf.UNSET_ENUM_VALUE;
        }
        CellInfo cellInfo = (CellInfo) a.get(0);
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
        }
        return cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm() : nzf.UNSET_ENUM_VALUE;
    }

    @CalledByNative
    public static int getSignalStrengthLevel(Context context) {
        List a = a(context);
        if (a == null || a.size() != 1) {
            return nzf.UNSET_ENUM_VALUE;
        }
        CellInfo cellInfo = (CellInfo) a.get(0);
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
        }
        return cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel() : nzf.UNSET_ENUM_VALUE;
    }

    private static List<CellInfo> a(Context context) {
        Object obj;
        if (VERSION.SDK_INT < 18 || context.checkPermission("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) != 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        if (allCellInfo == null) {
            return null;
        }
        Iterator it = allCellInfo.iterator();
        while (it.hasNext()) {
            if (!((CellInfo) it.next()).isRegistered()) {
                it.remove();
            }
        }
        return allCellInfo;
    }
}
