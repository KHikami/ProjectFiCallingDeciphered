package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lld extends nyx<lld> {
    public Integer f25319a;
    public Integer f25320b;
    public String f25321c;
    public String f25322d;
    public Long f25323e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29321b(nyt);
    }

    public lld() {
        m29322d();
    }

    private lld m29322d() {
        this.f25321c = null;
        this.f25322d = null;
        this.f25323e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25319a != null) {
            nyu.a(1, this.f25319a.intValue());
        }
        if (this.f25320b != null) {
            nyu.a(2, this.f25320b.intValue());
        }
        if (this.f25321c != null) {
            nyu.a(3, this.f25321c);
        }
        if (this.f25322d != null) {
            nyu.a(4, this.f25322d);
        }
        if (this.f25323e != null) {
            nyu.b(5, this.f25323e.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25319a != null) {
            b += nyu.f(1, this.f25319a.intValue());
        }
        if (this.f25320b != null) {
            b += nyu.f(2, this.f25320b.intValue());
        }
        if (this.f25321c != null) {
            b += nyu.b(3, this.f25321c);
        }
        if (this.f25322d != null) {
            b += nyu.b(4, this.f25322d);
        }
        if (this.f25323e != null) {
            return b + nyu.f(5, this.f25323e.longValue());
        }
        return b;
    }

    private lld m29321b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f25319a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 201:
                        case 202:
                        case 203:
                        case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                        case 205:
                        case 206:
                        case 207:
                        case 208:
                        case 209:
                        case 210:
                        case 211:
                        case 212:
                        case 213:
                        case 214:
                        case 215:
                        case 216:
                        case 217:
                        case 218:
                        case 219:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                        case 225:
                        case 226:
                        case 227:
                        case 228:
                        case 229:
                        case 230:
                        case 231:
                        case 232:
                        case 233:
                        case 234:
                        case 235:
                        case 236:
                        case 237:
                        case 238:
                        case 239:
                        case 240:
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                        case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
                        case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                        case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                        case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                        case 305:
                        case 306:
                        case HttpStatusCodes.STATUS_CODE_TEMPORARY_REDIRECT /*307*/:
                        case 308:
                        case 309:
                        case 310:
                        case 311:
                        case 312:
                        case 313:
                        case 314:
                        case 315:
                        case 316:
                        case 317:
                        case 318:
                        case 319:
                        case 320:
                        case 321:
                        case 322:
                            this.f25320b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f25321c = nyt.j();
                    continue;
                case 34:
                    this.f25322d = nyt.j();
                    continue;
                case 40:
                    this.f25323e = Long.valueOf(nyt.e());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
