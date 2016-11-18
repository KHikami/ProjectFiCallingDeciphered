package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import java.util.List;

public class iim {
    private final Context f17734a;
    private final ConnectivityManager f17735b;
    private final WifiManager f17736c;
    private final TelephonyManager f17737d;

    public iim(Context context) {
        this.f17734a = context;
        this.f17735b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f17736c = (WifiManager) context.getSystemService("wifi");
        this.f17737d = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lks m21885a(int i) {
        CellSignalStrength cellSignalStrength = null;
        int i2 = 1;
        lks lks = new lks();
        int i3;
        if (i == 2) {
            NetworkInfo networkInfo = this.f17735b.getNetworkInfo(1);
            if (networkInfo == null || !networkInfo.isConnected()) {
                i2 = 0;
            }
            if (i2 == 0) {
                i3 = -1;
            } else {
                WifiInfo connectionInfo = this.f17736c.getConnectionInfo();
                if (connectionInfo == null) {
                    i3 = -1;
                } else {
                    i3 = connectionInfo.getRssi();
                    if (i3 == -200) {
                        i3 = -1;
                    } else {
                        i3 = WifiManager.calculateSignalLevel(i3, 100);
                    }
                }
            }
            lks.f25212a = Integer.valueOf(i3);
        } else {
            if (i == 5 || i == 6 || i == 7 || i == 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                if (VERSION.SDK_INT >= 17) {
                    CellSignalStrength cellSignalStrength2;
                    if (this.f17734a.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        List<CellInfo> allCellInfo = this.f17737d.getAllCellInfo();
                        if (allCellInfo != null) {
                            CellSignalStrength cellSignalStrength3 = null;
                            for (CellInfo cellInfo : allCellInfo) {
                                if (!cellInfo.isRegistered()) {
                                    Object obj = cellSignalStrength3;
                                }
                                Object obj2 = cellInfo;
                            }
                            cellSignalStrength2 = cellSignalStrength3;
                            if (cellSignalStrength2 == null) {
                                i3 = -1;
                            } else if (cellSignalStrength2 instanceof CellInfoCdma) {
                                cellSignalStrength = ((CellInfoCdma) cellSignalStrength2).getCellSignalStrength();
                                i3 = 1;
                            } else if (cellSignalStrength2 instanceof CellInfoGsm) {
                                cellSignalStrength = ((CellInfoGsm) cellSignalStrength2).getCellSignalStrength();
                                i3 = 2;
                            } else if (cellSignalStrength2 instanceof CellInfoLte) {
                                if (VERSION.SDK_INT >= 18) {
                                    if (cellSignalStrength2 instanceof CellInfoWcdma) {
                                        i2 = 0;
                                    } else {
                                        lks.f25213b = Integer.valueOf(4);
                                        cellSignalStrength2 = ((CellInfoWcdma) cellSignalStrength2).getCellSignalStrength();
                                        lks.f25214c = Integer.valueOf(cellSignalStrength2.getLevel());
                                        lks.f25215d = Integer.valueOf(cellSignalStrength2.getAsuLevel());
                                    }
                                }
                                i3 = 0;
                            } else {
                                cellSignalStrength = ((CellInfoLte) cellSignalStrength2).getCellSignalStrength();
                                i3 = 3;
                            }
                            lks.f25213b = Integer.valueOf(i3);
                            if (cellSignalStrength == null) {
                                lks.f25214c = Integer.valueOf(cellSignalStrength.getLevel());
                                lks.f25215d = Integer.valueOf(cellSignalStrength.getAsuLevel());
                            } else {
                                lks.f25214c = Integer.valueOf(-1);
                                lks.f25215d = Integer.valueOf(-1);
                            }
                        }
                    }
                    cellSignalStrength2 = null;
                    if (cellSignalStrength2 == null) {
                        i3 = -1;
                    } else if (cellSignalStrength2 instanceof CellInfoCdma) {
                        cellSignalStrength = ((CellInfoCdma) cellSignalStrength2).getCellSignalStrength();
                        i3 = 1;
                    } else if (cellSignalStrength2 instanceof CellInfoGsm) {
                        cellSignalStrength = ((CellInfoGsm) cellSignalStrength2).getCellSignalStrength();
                        i3 = 2;
                    } else if (cellSignalStrength2 instanceof CellInfoLte) {
                        if (VERSION.SDK_INT >= 18) {
                            if (cellSignalStrength2 instanceof CellInfoWcdma) {
                                i2 = 0;
                            } else {
                                lks.f25213b = Integer.valueOf(4);
                                cellSignalStrength2 = ((CellInfoWcdma) cellSignalStrength2).getCellSignalStrength();
                                lks.f25214c = Integer.valueOf(cellSignalStrength2.getLevel());
                                lks.f25215d = Integer.valueOf(cellSignalStrength2.getAsuLevel());
                            }
                        }
                        i3 = 0;
                    } else {
                        cellSignalStrength = ((CellInfoLte) cellSignalStrength2).getCellSignalStrength();
                        i3 = 3;
                    }
                    lks.f25213b = Integer.valueOf(i3);
                    if (cellSignalStrength == null) {
                        lks.f25214c = Integer.valueOf(-1);
                        lks.f25215d = Integer.valueOf(-1);
                    } else {
                        lks.f25214c = Integer.valueOf(cellSignalStrength.getLevel());
                        lks.f25215d = Integer.valueOf(cellSignalStrength.getAsuLevel());
                    }
                } else {
                    lks.f25213b = Integer.valueOf(-1);
                    lks.f25214c = Integer.valueOf(-1);
                    lks.f25215d = Integer.valueOf(-1);
                }
            }
        }
        return lks;
    }

    public int m21884a() {
        NetworkInfo activeNetworkInfo = this.f17735b.getActiveNetworkInfo();
        return activeNetworkInfo == null ? 0 : m21886b(activeNetworkInfo.getType());
    }

    public int m21886b(int i) {
        Object obj;
        if (i == 0 || i == 4 || i == 5 || i == 3) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            switch (this.f17737d.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 6;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 7;
                case 13:
                    return 8;
                default:
                    return 5;
            }
        }
        switch (i) {
            case 1:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 9:
                return 1;
            default:
                return 0;
        }
    }
}
