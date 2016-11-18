package p000;

import java.util.Locale;

final class dxe implements dws {
    dxe() {
    }

    public int mo1745a(String str, String str2, bji bji) {
        String toUpperCase = str.toUpperCase(Locale.getDefault());
        String toUpperCase2 = str2.toUpperCase(Locale.getDefault());
        switch (dxf.f10707a[bji.ordinal()]) {
            case 1:
                if (toUpperCase.startsWith(toUpperCase2)) {
                    return 0;
                }
                int indexOf = toUpperCase.indexOf(new StringBuilder(String.valueOf(toUpperCase2).length() + 1).append(" ").append(toUpperCase2).toString());
                return indexOf != -1 ? indexOf + 1 : -1;
            case 2:
                if (toUpperCase.startsWith(toUpperCase2)) {
                    return 0;
                }
                break;
            case 3:
                return toUpperCase.indexOf(toUpperCase2);
            case 4:
                break;
            default:
                String valueOf = String.valueOf(bji);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Invalid highlight type: ").append(valueOf).toString());
        }
        return -1;
    }
}
