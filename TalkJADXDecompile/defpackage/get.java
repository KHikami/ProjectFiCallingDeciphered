package defpackage;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.TelephonyManager;

/* renamed from: get */
public final class get {
    static final int[] a;

    static {
        a = new int[]{4103, 4106, 4107, 4120, 4121, 4124, 4126, 4132, 4135, 4139, 4144, 4145, 4148, 4151, 4153, 4155, 4157, 4159, 4162, 4164, 4166, 4168, 4170, 4171, 4174, 4180, 4181, 4183, 4186, 4188, 4190, 4195, 4198, 4274, 4376, 4384, 4390, 4396, 4418, 4500, 4622, 4654, 4694, 4812, 4982, 5116, 5142, 22404, 22405, 22406, 22407, 22408, 22409, 22410, 22411, 22412, 22413, 22414, 22415, 22416, 22417, 22418, 22419, 22420, 22421, 22422, 22423, 22424, 22425, 22426, 22427, 22428, 22430, 22431, 22432, 22434, 22435, 22436, 22437, 22438, 22439, 22440, 22441, 22442, 22443, 22444, 22445, 22446, 22447, 22448};
    }

    public static int a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.isNetworkRoaming()) {
            glk.c("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, is roaming", new Object[0]);
            return 1;
        }
        CellInfo a = gck.a(context);
        if (a == null) {
            glk.c("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, unable to get cell info, roaming status is unknown", new Object[0]);
            return 3;
        }
        if (telephonyManager.getPhoneType() == 2 && (a instanceof CellInfoCdma)) {
            int i;
            int systemId = ((CellInfoCdma) a).getCellIdentity().getSystemId();
            for (int i2 : a) {
                if (systemId == i2) {
                    i = 1;
                    break;
                }
            }
            i = 0;
            if (i == 0) {
                glk.c("Babel_telephony", "TeleRoamingDetector.getRoamingStatus, not on Sprint Cdma, is roaming", new Object[0]);
                return 1;
            }
        }
        return 2;
    }
}
