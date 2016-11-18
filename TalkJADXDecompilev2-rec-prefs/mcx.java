package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class mcx extends nyx<mcx> {
    public String f27413a;
    public Integer f27414b;
    public Integer f27415c;
    public mcy f27416d;
    public Integer f27417e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31784b(nyt);
    }

    public mcx() {
        m31785d();
    }

    private mcx m31785d() {
        this.f27413a = null;
        this.f27414b = null;
        this.f27416d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27413a != null) {
            nyu.a(1, this.f27413a);
        }
        if (this.f27414b != null) {
            nyu.a(2, this.f27414b.intValue());
        }
        if (this.f27415c != null) {
            nyu.a(3, this.f27415c.intValue());
        }
        if (this.f27416d != null) {
            nyu.b(4, this.f27416d);
        }
        if (this.f27417e != null) {
            nyu.a(5, this.f27417e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27413a != null) {
            b += nyu.b(1, this.f27413a);
        }
        if (this.f27414b != null) {
            b += nyu.f(2, this.f27414b.intValue());
        }
        if (this.f27415c != null) {
            b += nyu.f(3, this.f27415c.intValue());
        }
        if (this.f27416d != null) {
            b += nyu.d(4, this.f27416d);
        }
        if (this.f27417e != null) {
            return b + nyu.f(5, this.f27417e.intValue());
        }
        return b;
    }

    private mcx m31784b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27413a = nyt.j();
                    continue;
                case 16:
                    this.f27414b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27415c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f27416d == null) {
                        this.f27416d = new mcy();
                    }
                    nyt.a(this.f27416d);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 201:
                        case 202:
                        case 203:
                        case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                        case 205:
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
                        case 323:
                        case 324:
                        case 325:
                        case 326:
                        case 327:
                        case 328:
                        case 329:
                        case 330:
                        case 331:
                        case 332:
                        case 333:
                        case 334:
                        case 335:
                        case 336:
                        case 337:
                        case 338:
                        case 339:
                        case 340:
                        case 341:
                        case 342:
                        case 343:
                        case 344:
                        case 345:
                        case 346:
                        case 347:
                        case 348:
                        case 349:
                        case 350:
                        case 351:
                        case 352:
                        case 353:
                        case 354:
                        case 355:
                        case 356:
                        case 357:
                        case 358:
                        case 359:
                        case 360:
                        case 361:
                        case 362:
                        case 363:
                        case 500:
                        case 501:
                        case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                        case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1100:
                        case 1101:
                            this.f27417e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
