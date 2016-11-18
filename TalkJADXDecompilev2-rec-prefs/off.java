package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class off extends nyx<off> {
    public Integer f28727a;
    public Integer f28728b;
    public Integer f28729c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33466b(nyt);
    }

    public off() {
        m33467d();
    }

    private off m33467d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28727a != null) {
            nyu.a(1, this.f28727a.intValue());
        }
        if (this.f28728b != null) {
            nyu.a(2, this.f28728b.intValue());
        }
        if (this.f28729c != null) {
            nyu.a(3, this.f28729c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28727a != null) {
            b += nyu.f(1, this.f28727a.intValue());
        }
        if (this.f28728b != null) {
            b += nyu.f(2, this.f28728b.intValue());
        }
        if (this.f28729c != null) {
            return b + nyu.f(3, this.f28729c.intValue());
        }
        return b;
    }

    private off m33466b(nyt nyt) {
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
                            this.f28727a = Integer.valueOf(a);
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
                            this.f28728b = Integer.valueOf(a);
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
                            this.f28729c = Integer.valueOf(a);
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
