package p000;

import java.util.List;

public final class esu {
    public static final esu f12208c = new esu();
    public int f12209a = 1;
    public String f12210b = null;

    public esu(lpk lpk) {
        if (lpk != null) {
            this.f12209a = gwb.m1508a(lpk.f26004a, 1);
            if (lpk.f26005b != null) {
                this.f12210b = lpk.f26005b.f28411a;
            }
        }
    }

    public static String m14421a(List<esu> list) {
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
        int i = this.f12209a;
        String str = this.f12210b;
        return new StringBuilder(String.valueOf(str).length() + 33).append("Medium (type=").append(i).append(" phone=").append(str).append(") ").toString();
    }
}
