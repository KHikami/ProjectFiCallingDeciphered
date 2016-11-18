package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

public final class aim {
    private SparseArray<Object> a;

    public aim() {
        this.a = null;
        this.a = new SparseArray();
    }

    protected int a(int i) {
        Integer num = (Integer) this.a.get(i);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected void a(int i, int i2) {
        switch (i2) {
            case 134:
            case 144:
            case 145:
            case 148:
            case 162:
            case 167:
            case 169:
            case 171:
            case 177:
            case 187:
            case 188:
                if (!(128 == i || 129 == i)) {
                    throw new ahy("Invalid Octet value!");
                }
            case 140:
                if (i < 128 || i > 151) {
                    throw new ahy("Invalid Octet value!");
                }
            case 141:
                if (i < 16 || i > 19) {
                    i = 18;
                    break;
                }
            case 143:
                if (i < 128 || i > 130) {
                    throw new ahy("Invalid Octet value!");
                }
            case 146:
                if (i <= 196 || i >= 224) {
                    if ((i > 235 && i <= 255) || i < 128 || ((i > 136 && i < 192) || i > 255)) {
                        i = 224;
                        break;
                    }
                }
                i = 192;
                break;
                break;
            case 149:
                if (i < 128 || i > 135) {
                    throw new ahy("Invalid Octet value!");
                }
            case 153:
                if (i <= 194 || i >= 224) {
                    if (i <= 227 || i > 255) {
                        if (i < 128 || ((i > 128 && i < 192) || i > 255)) {
                            i = 224;
                            break;
                        }
                    }
                    i = 224;
                    break;
                }
                i = 192;
                break;
                break;
            case 155:
                if (!(128 == i || 129 == i)) {
                    throw new ahy("Invalid Octet value!");
                }
            case 156:
                if (i < 128 || i > 131) {
                    throw new ahy("Invalid Octet value!");
                }
            case 163:
                if (i < 128 || i > 132) {
                    throw new ahy("Invalid Octet value!");
                }
            case 165:
                if (i <= 193 || i >= 224) {
                    if (i <= 228 || i > 255) {
                        if (i < 128 || ((i > 128 && i < 192) || i > 255)) {
                            i = 224;
                            break;
                        }
                    }
                    i = 224;
                    break;
                }
                i = 192;
                break;
                break;
            case 180:
                if (128 != i) {
                    throw new ahy("Invalid Octet value!");
                }
                break;
            case 186:
                if (i < 128 || i > 135) {
                    throw new ahy("Invalid Octet value!");
                }
            case 191:
                if (!(128 == i || 129 == i)) {
                    throw new ahy("Invalid Octet value!");
                }
            default:
                throw new RuntimeException("Invalid header field!");
        }
        this.a.put(i2, Integer.valueOf(i));
    }

    protected byte[] b(int i) {
        return (byte[]) this.a.get(i);
    }

    protected void a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        switch (i) {
            case 131:
            case 132:
            case 138:
            case 139:
            case 152:
            case 158:
            case 183:
            case 184:
            case 185:
            case 189:
            case 190:
                this.a.put(i, bArr);
                return;
            default:
                throw new RuntimeException("Invalid header field!");
        }
    }

    protected aic c(int i) {
        return (aic) this.a.get(i);
    }

    protected aic[] d(int i) {
        ArrayList arrayList = (ArrayList) this.a.get(i);
        if (arrayList == null) {
            return null;
        }
        return (aic[]) arrayList.toArray(new aic[arrayList.size()]);
    }

    protected void a(aic aic, int i) {
        if (aic == null) {
            throw new NullPointerException();
        }
        switch (i) {
            case 137:
            case 147:
            case 150:
            case 154:
            case 160:
            case 164:
            case 166:
            case 181:
            case 182:
                this.a.put(i, aic);
                return;
            default:
                throw new RuntimeException("Invalid header field!");
        }
    }

    protected void a(aic[] aicArr, int i) {
        if (aicArr == null) {
            throw new NullPointerException();
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : aicArr) {
            arrayList.add(add);
        }
        this.a.put(151, arrayList);
    }

    protected void b(aic aic, int i) {
        if (aic == null) {
            throw new NullPointerException();
        }
        switch (i) {
            case 129:
            case 130:
            case 151:
                ArrayList arrayList = (ArrayList) this.a.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aic);
                this.a.put(i, arrayList);
                return;
            default:
                throw new RuntimeException("Invalid header field!");
        }
    }

    protected long e(int i) {
        Long l = (Long) this.a.get(i);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    protected void a(long j, int i) {
        switch (i) {
            case 133:
            case 135:
            case 136:
            case 142:
            case 157:
            case 159:
            case 161:
            case 173:
            case 175:
            case 179:
                this.a.put(i, Long.valueOf(j));
                return;
            default:
                throw new RuntimeException("Invalid header field!");
        }
    }
}
