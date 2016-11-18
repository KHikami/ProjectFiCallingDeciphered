package defpackage;

import java.util.List;

public final class esu {
    public static final esu c = new esu();
    public int a = 1;
    public String b = null;

    public esu(lpk lpk) {
        if (lpk != null) {
            this.a = gwb.a(lpk.a, 1);
            if (lpk.b != null) {
                this.b = lpk.b.a;
            }
        }
    }

    public static String a(List<esu> list) {
        if (list == null || list.size() == 0) {
            return "Empty deliveryMediumList. ";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (esu append : list) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 33).append("Medium (type=").append(i).append(" phone=").append(str).append(") ").toString();
    }
}
