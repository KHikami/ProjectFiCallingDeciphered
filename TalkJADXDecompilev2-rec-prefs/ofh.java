package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class ofh extends nyx<ofh> {
    public Integer f32631a;
    public Integer f32632b;
    public Integer f32633c;
    public Integer f32634d;

    public /* synthetic */ nzf m38060a(nyt nyt) {
        return m38058b(nyt);
    }

    public ofh() {
        m38059d();
    }

    private ofh m38059d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38061a(nyu nyu) {
        if (this.f32631a != null) {
            nyu.m37168a(1, this.f32631a.intValue());
        }
        if (this.f32632b != null) {
            nyu.m37168a(2, this.f32632b.intValue());
        }
        if (this.f32633c != null) {
            nyu.m37168a(3, this.f32633c.intValue());
        }
        if (this.f32634d != null) {
            nyu.m37168a(4, this.f32634d.intValue());
        }
        super.a(nyu);
    }

    protected int m38062b() {
        int b = super.b();
        if (this.f32631a != null) {
            b += nyu.m37147f(1, this.f32631a.intValue());
        }
        if (this.f32632b != null) {
            b += nyu.m37147f(2, this.f32632b.intValue());
        }
        if (this.f32633c != null) {
            b += nyu.m37147f(3, this.f32633c.intValue());
        }
        if (this.f32634d != null) {
            return b + nyu.m37147f(4, this.f32634d.intValue());
        }
        return b;
    }

    private ofh m38058b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
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
                        case 100:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 201:
                        case 202:
                        case 203:
                            this.f32631a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
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
                        case 80:
                        case 81:
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
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                        case 145:
                        case 146:
                        case 147:
                        case 148:
                        case 149:
                        case 150:
                        case 151:
                        case 152:
                        case 153:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 160:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                        case 167:
                        case 168:
                        case 169:
                        case 170:
                        case 171:
                        case 172:
                        case 173:
                        case 174:
                        case 175:
                        case 176:
                        case 177:
                        case 178:
                        case 179:
                        case 180:
                        case 181:
                        case 182:
                        case 183:
                        case 184:
                        case 185:
                        case 186:
                        case 187:
                        case 188:
                        case 189:
                        case 190:
                        case 191:
                        case 192:
                        case 193:
                        case 194:
                        case 195:
                        case 196:
                        case 197:
                        case 198:
                        case 199:
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
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                        case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
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
                        case 500:
                        case 501:
                        case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                        case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                        case 504:
                        case 505:
                        case 506:
                        case 507:
                        case 508:
                        case 509:
                        case 510:
                        case 511:
                        case 512:
                        case 513:
                        case 514:
                        case 515:
                        case 516:
                        case 517:
                        case 518:
                        case 519:
                        case 520:
                        case 521:
                        case 522:
                        case 523:
                        case 524:
                        case 525:
                        case 526:
                        case 527:
                        case 528:
                        case 529:
                        case 530:
                        case 531:
                        case 532:
                        case 533:
                        case 534:
                        case 535:
                        case 536:
                        case 537:
                        case 538:
                        case 539:
                        case 540:
                        case 541:
                        case 542:
                        case 543:
                        case 544:
                        case 545:
                        case 546:
                        case 547:
                        case 548:
                        case 549:
                        case 550:
                        case 551:
                        case 552:
                        case 553:
                        case 554:
                        case 555:
                        case 556:
                        case 557:
                        case 558:
                        case 559:
                        case 560:
                        case 561:
                        case 562:
                        case 563:
                        case 564:
                        case 565:
                        case 566:
                        case 567:
                        case 568:
                        case 569:
                        case 570:
                        case 571:
                        case 572:
                        case 573:
                        case 574:
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1007:
                        case 1008:
                        case 1009:
                        case 1010:
                            this.f32632b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 10:
                        case 20:
                            this.f32633c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                        case 90:
                        case 100:
                        case 110:
                            this.f32634d = Integer.valueOf(a);
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
