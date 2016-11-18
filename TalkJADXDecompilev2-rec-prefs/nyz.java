package p000;

import java.lang.reflect.Array;
import java.util.List;

final class nyz<M extends nyx<M>, T> extends nyy<M, T> {
    private final int f31297e = 0;
    private final int f31298f = 0;

    protected Object mo4077a(nyt nyt) {
        try {
            switch (this.a) {
                case 1:
                    return Double.valueOf(nyt.m37104b());
                case 2:
                    return Float.valueOf(nyt.m37106c());
                case 3:
                    return Long.valueOf(nyt.m37110e());
                case 4:
                    return Long.valueOf(nyt.m37109d());
                case 5:
                    return Integer.valueOf(nyt.m37112f());
                case 6:
                    return Long.valueOf(nyt.m37114g());
                case 7:
                    return Integer.valueOf(nyt.m37115h());
                case 8:
                    return Boolean.valueOf(nyt.m37116i());
                case 9:
                    return nyt.m37117j();
                case 12:
                    return nyt.m37118k();
                case 13:
                    return Integer.valueOf(nyt.m37119l());
                case 14:
                    return Integer.valueOf(nyt.m37120m());
                case 15:
                    return Integer.valueOf(nyt.m37121n());
                case 16:
                    return Long.valueOf(nyt.m37122o());
                case wi.dK /*17*/:
                    return Integer.valueOf(nyt.m37123p());
                case wi.dH /*18*/:
                    return Long.valueOf(nyt.m37124q());
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
        throw new IllegalArgumentException("Error reading extension field", e);
    }

    protected void mo4078a(nzj nzj, List<Object> list) {
        if (nzj.f31318a == this.f31297e) {
            byte[] bArr = nzj.f31319b;
            list.add(mo4077a(nyt.m37092a(bArr, 0, bArr.length)));
            return;
        }
        bArr = nzj.f31319b;
        nyt a = nyt.m37092a(bArr, 0, bArr.length);
        try {
            a.m37108d(a.m37125r());
            while (!a.m37127t()) {
                list.add(mo4077a(a));
            }
        } catch (Throwable e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
    }

    protected final void mo4080b(Object obj, nyu nyu) {
        try {
            nyu.m37198i(this.c);
            switch (this.a) {
                case 1:
                    nyu.m37163a(((Double) obj).doubleValue());
                    return;
                case 2:
                    nyu.m37164a(((Float) obj).floatValue());
                    return;
                case 3:
                    nyu.m37183b(((Long) obj).longValue());
                    return;
                case 4:
                    nyu.m37174a(((Long) obj).longValue());
                    return;
                case 5:
                    nyu.m37165a(((Integer) obj).intValue());
                    return;
                case 6:
                    nyu.m37188c(((Long) obj).longValue());
                    return;
                case 7:
                    nyu.m37179b(((Integer) obj).intValue());
                    return;
                case 8:
                    nyu.m37177a(((Boolean) obj).booleanValue());
                    return;
                case 9:
                    nyu.m37175a((String) obj);
                    return;
                case 12:
                    nyu.m37178a((byte[]) obj);
                    return;
                case 13:
                    nyu.m37185c(((Integer) obj).intValue());
                    return;
                case 14:
                    nyu.m37190d(((Integer) obj).intValue());
                    return;
                case 15:
                    nyu.m37194e(((Integer) obj).intValue());
                    return;
                case 16:
                    nyu.m37193d(((Long) obj).longValue());
                    return;
                case wi.dK /*17*/:
                    nyu.m37197f(((Integer) obj).intValue());
                    return;
                case wi.dH /*18*/:
                    nyu.m37196e(((Long) obj).longValue());
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void mo4082c(Object obj, nyu nyu) {
        int i = 0;
        if (this.c == this.f31297e) {
            super.mo4082c(obj, nyu);
        } else if (this.c == this.f31298f) {
            r1 = Array.getLength(obj);
            r2 = m37214d(obj);
            try {
                nyu.m37198i(this.c);
                nyu.m37198i(r2);
                switch (this.a) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        while (i < r1) {
                            nyu.m37177a(Array.getBoolean(obj, i));
                            i++;
                        }
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case wi.dK /*17*/:
                        break;
                    case wi.dH /*18*/:
                        break;
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.a);
                }
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else {
            r1 = this.c;
            r2 = this.f31297e;
            throw new IllegalArgumentException("Unexpected repeated extension tag " + r1 + ", unequal to both non-packed variant " + r2 + " and packed variant " + this.f31298f);
        }
    }

    private int m37214d(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        int i2;
        int f;
        switch (this.a) {
            case 1:
            case 6:
            case 16:
                return length << 3;
            case 2:
            case 7:
            case 15:
                return length << 2;
            case 3:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37149f(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 4:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37149f(Array.getLong(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 5:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37150g(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 8:
                return length;
            case 13:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37158j(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case 14:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37158j(Array.getInt(obj, i2)) + i;
                    i2++;
                    i = f;
                }
                return i;
            case wi.dK /*17*/:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37158j(nyu.m37159k(Array.getInt(obj, i2))) + i;
                    i2++;
                    i = f;
                }
                return i;
            case wi.dH /*18*/:
                i2 = 0;
                while (i2 < length) {
                    f = nyu.m37149f(nyu.m37153g(Array.getLong(obj, i2))) + i;
                    i2++;
                    i = f;
                }
                return i;
            default:
                throw new IllegalArgumentException("Unexpected non-packable type " + this.a);
        }
    }

    protected int mo4079b(Object obj) {
        if (this.c == this.f31297e) {
            return super.mo4079b(obj);
        }
        if (this.c == this.f31298f) {
            int d = m37214d(obj);
            return (d + nyu.m37158j(d)) + nyu.m37158j(this.c);
        }
        int i = this.c;
        int i2 = this.f31297e;
        throw new IllegalArgumentException("Unexpected repeated extension tag " + i + ", unequal to both non-packed variant " + i2 + " and packed variant " + this.f31298f);
    }

    protected final int mo4081c(Object obj) {
        int i = this.c >>> 3;
        switch (this.a) {
            case 1:
                ((Double) obj).doubleValue();
                return nyu.m37154h(i) + 8;
            case 2:
                ((Float) obj).floatValue();
                return nyu.m37154h(i) + 4;
            case 3:
                return nyu.m37148f(i, ((Long) obj).longValue());
            case 4:
                return nyu.m37146e(i, ((Long) obj).longValue());
            case 5:
                return nyu.m37147f(i, ((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return nyu.m37154h(i) + 8;
            case 7:
                ((Integer) obj).intValue();
                return nyu.m37154h(i) + 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return nyu.m37154h(i) + 1;
            case 9:
                return nyu.m37137b(i, (String) obj);
            case 12:
                return nyu.m37139b(i, (byte[]) obj);
            case 13:
                return nyu.m37151g(i, ((Integer) obj).intValue());
            case 14:
                return nyu.m37154h(i) + nyu.m37158j(((Integer) obj).intValue());
            case 15:
                ((Integer) obj).intValue();
                return nyu.m37154h(i) + 4;
            case 16:
                ((Long) obj).longValue();
                return nyu.m37154h(i) + 8;
            case wi.dK /*17*/:
                return nyu.m37155h(i, ((Integer) obj).intValue());
            case wi.dH /*18*/:
                return nyu.m37152g(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }

    public nyz(int i, Class<T> cls, int i2, boolean z, int i3, int i4) {
        super(i, cls, i2, false);
    }
}
