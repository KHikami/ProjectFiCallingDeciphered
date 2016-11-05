import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.List;

public final class gck { //evaluates signal strength into new values
    private static int a; //pre-associated level?

    static {
        a = -1;
    }

    //creates a new gcm with Service State, signal strength level, and context's telephony manager
    static gcm a(Context context, int i, int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i3 = -1;
        CellInfo a = a(context);
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
        if (telephonyManager.getSimState() == 5) { //SimState is ready
            PhoneStateListener gcn = new gcn(context, gcl);//create cell signal listener
            telephonyManager.listen(gcn, 257); //listen for service state change and listen for signal strength
            telephonyManager.listen(gcn, 0); //stop listening for updates
            return;
        }
        gcl.a(a(context, 2, -1));//gdz.a(new cell state with signal level of service state of emergency only and -1 as signal strength level)
        //log this cell state using gdz and then clean up this eval
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

    private static int a(int i) { //returns level associated with signal strngth
        switch (i) {
            case wi.w /*0*/:
                return 0;
            case wi.j /*1*/:
                return 25;
            case wi.l /*2*/:
                return 50;
            case wi.z /*3*/:
                return 75;
            case wi.h /*4*/:
                return 100;
            default:
                return -1;
        }
    }

    static int a(SignalStrength signalStrength) { //returns the related level as long as a is -1 (possibly a might be a pre-associated level?)
        if (a != -1) {
            return a(a);
        }
        try {
            Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getLevel", new Class[0]);
            if (declaredMethod != null) {
                return a(gwb.a((Integer) declaredMethod.invoke(signalStrength, new Object[0])));
            }
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleCellServiceUtils.getSignalLevelPercent, error calling SignalStrength.getLevel", e);
        }
        return -1;
    }
}
