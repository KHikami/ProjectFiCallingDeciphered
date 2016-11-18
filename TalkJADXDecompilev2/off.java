package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class off extends nyx<off> {
    public Integer a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public off() {
        d();
    }

    private off d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.intValue());
        }
        return b;
    }

    private off b(nyt nyt) {
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
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 100:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 158:
                        case 400:
                        case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                        case 402:
                        case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                        case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                        case HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED /*405*/:
                        case 406:
                        case 407:
                        case 408:
                        case HttpStatusCodes.STATUS_CODE_CONFLICT /*409*/:
                        case 410:
                        case 411:
                        case 412:
                        case 413:
                        case 414:
                        case 415:
                        case 416:
                        case 417:
                        case 418:
                        case 419:
                        case 420:
                        case 421:
                        case 422:
                        case 423:
                        case 424:
                        case 600:
                        case 602:
                        case 603:
                        case 604:
                        case 605:
                        case 606:
                        case 607:
                        case 608:
                        case 609:
                        case 900:
                        case 901:
                        case 902:
                        case 903:
                        case 904:
                        case 905:
                        case 906:
                        case 907:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 10:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
