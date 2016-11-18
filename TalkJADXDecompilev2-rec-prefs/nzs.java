package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class nzs extends nyx<nzs> {
    private static volatile nzs[] f31378i;
    public int[] f31379a;
    public String f31380b;
    public String f31381c;
    public nzt f31382d;
    public obt f31383e;
    public String f31384f;
    public obm f31385g;
    public String f31386h;

    public /* synthetic */ nzf m37295a(nyt nyt) {
        return m37293b(nyt);
    }

    public static nzs[] m37294d() {
        if (f31378i == null) {
            synchronized (nzc.f31309c) {
                if (f31378i == null) {
                    f31378i = new nzs[0];
                }
            }
        }
        return f31378i;
    }

    public nzs() {
        this.f31379a = nzl.f31327a;
        this.f31380b = null;
        this.f31381c = null;
        this.f31384f = null;
        this.f31386h = null;
        this.cachedSize = -1;
    }

    public void m37296a(nyu nyu) {
        if (this.f31379a != null && this.f31379a.length > 0) {
            for (int a : this.f31379a) {
                nyu.m37168a(1, a);
            }
        }
        if (this.f31380b != null) {
            nyu.m37170a(2, this.f31380b);
        }
        if (this.f31381c != null) {
            nyu.m37170a(3, this.f31381c);
        }
        if (this.f31382d != null) {
            nyu.m37182b(4, this.f31382d);
        }
        if (this.f31383e != null) {
            nyu.m37182b(5, this.f31383e);
        }
        if (this.f31384f != null) {
            nyu.m37170a(6, this.f31384f);
        }
        if (this.f31385g != null) {
            nyu.m37182b(7, this.f31385g);
        }
        if (this.f31386h != null) {
            nyu.m37170a(8, this.f31386h);
        }
        super.a(nyu);
    }

    protected int m37297b() {
        int i = 0;
        int b = super.b();
        if (this.f31379a == null || this.f31379a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f31379a.length) {
                i2 += nyu.m37150g(this.f31379a[i]);
                i++;
            }
            i = (b + i2) + (this.f31379a.length * 1);
        }
        if (this.f31380b != null) {
            i += nyu.m37137b(2, this.f31380b);
        }
        if (this.f31381c != null) {
            i += nyu.m37137b(3, this.f31381c);
        }
        if (this.f31382d != null) {
            i += nyu.m37145d(4, this.f31382d);
        }
        if (this.f31383e != null) {
            i += nyu.m37145d(5, this.f31383e);
        }
        if (this.f31384f != null) {
            i += nyu.m37137b(6, this.f31384f);
        }
        if (this.f31385g != null) {
            i += nyu.m37145d(7, this.f31385g);
        }
        if (this.f31386h != null) {
            return i + nyu.m37137b(8, this.f31386h);
        }
        return i;
    }

    private nzs m37293b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    int b = nzl.m37265b(nyt, 8);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.m37099a();
                        }
                        int f = nyt.m37112f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
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
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case wi.ai /*79*/:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
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
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 151:
                            case 157:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case 170:
                            case 171:
                            case 172:
                            case 173:
                            case 174:
                            case 175:
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
                            case 215:
                            case 216:
                            case 217:
                            case 218:
                            case 219:
                            case 220:
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
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                            case 245:
                            case 246:
                            case 249:
                            case 250:
                            case 251:
                            case 252:
                            case 253:
                            case 254:
                            case 255:
                            case 256:
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                            case 261:
                            case 262:
                            case 263:
                            case 264:
                            case 265:
                            case 266:
                            case 267:
                            case 268:
                            case 269:
                            case 270:
                            case 271:
                            case 272:
                            case 273:
                            case 274:
                            case 275:
                            case 276:
                            case 277:
                            case 278:
                            case 279:
                            case 280:
                            case 281:
                            case 282:
                            case 283:
                            case 284:
                            case 285:
                            case 286:
                            case 287:
                            case 288:
                            case 289:
                            case 290:
                            case 291:
                            case 292:
                            case 293:
                            case 294:
                            case 295:
                            case 296:
                            case 297:
                            case 298:
                            case 299:
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
                            case 334:
                            case 335:
                            case 336:
                            case 337:
                            case 338:
                            case 339:
                            case 340:
                            case 342:
                            case 343:
                            case 344:
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
                            case 364:
                            case 365:
                            case 366:
                            case 367:
                            case 368:
                            case 369:
                            case 370:
                            case 371:
                            case 372:
                            case 373:
                            case 374:
                            case 375:
                            case 377:
                            case 378:
                            case 379:
                            case 380:
                            case 382:
                            case 383:
                            case 384:
                            case 385:
                            case 386:
                            case 387:
                            case 388:
                            case 389:
                            case 390:
                            case 391:
                            case 392:
                            case 393:
                            case 394:
                            case 395:
                            case 397:
                            case 398:
                            case 399:
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
                            case 425:
                            case 426:
                            case 427:
                            case 428:
                            case 429:
                            case 430:
                            case 431:
                            case 432:
                            case 433:
                            case 434:
                            case 435:
                            case 436:
                            case 437:
                            case 438:
                            case 439:
                            case 440:
                            case 441:
                            case 442:
                            case 443:
                            case 444:
                            case 445:
                            case 446:
                            case 447:
                            case 448:
                            case 449:
                            case 450:
                            case 451:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.f31379a == null ? 0 : this.f31379a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f31379a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f31379a = obj2;
                            break;
                        }
                        this.f31379a = obj;
                        break;
                    }
                    continue;
                case 10:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
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
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case wi.ai /*79*/:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
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
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 151:
                            case 157:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case 170:
                            case 171:
                            case 172:
                            case 173:
                            case 174:
                            case 175:
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
                            case 215:
                            case 216:
                            case 217:
                            case 218:
                            case 219:
                            case 220:
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
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                            case 245:
                            case 246:
                            case 249:
                            case 250:
                            case 251:
                            case 252:
                            case 253:
                            case 254:
                            case 255:
                            case 256:
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                            case 261:
                            case 262:
                            case 263:
                            case 264:
                            case 265:
                            case 266:
                            case 267:
                            case 268:
                            case 269:
                            case 270:
                            case 271:
                            case 272:
                            case 273:
                            case 274:
                            case 275:
                            case 276:
                            case 277:
                            case 278:
                            case 279:
                            case 280:
                            case 281:
                            case 282:
                            case 283:
                            case 284:
                            case 285:
                            case 286:
                            case 287:
                            case 288:
                            case 289:
                            case 290:
                            case 291:
                            case 292:
                            case 293:
                            case 294:
                            case 295:
                            case 296:
                            case 297:
                            case 298:
                            case 299:
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
                            case 334:
                            case 335:
                            case 336:
                            case 337:
                            case 338:
                            case 339:
                            case 340:
                            case 342:
                            case 343:
                            case 344:
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
                            case 364:
                            case 365:
                            case 366:
                            case 367:
                            case 368:
                            case 369:
                            case 370:
                            case 371:
                            case 372:
                            case 373:
                            case 374:
                            case 375:
                            case 377:
                            case 378:
                            case 379:
                            case 380:
                            case 382:
                            case 383:
                            case 384:
                            case 385:
                            case 386:
                            case 387:
                            case 388:
                            case 389:
                            case 390:
                            case 391:
                            case 392:
                            case 393:
                            case 394:
                            case 395:
                            case 397:
                            case 398:
                            case 399:
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
                            case 425:
                            case 426:
                            case 427:
                            case 428:
                            case 429:
                            case 430:
                            case 431:
                            case 432:
                            case 433:
                            case 434:
                            case 435:
                            case 436:
                            case 437:
                            case 438:
                            case 439:
                            case 440:
                            case 441:
                            case 442:
                            case 443:
                            case 444:
                            case 445:
                            case 446:
                            case 447:
                            case 448:
                            case 449:
                            case 450:
                            case 451:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.m37113f(i2);
                        if (this.f31379a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f31379a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f31379a, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            int f2 = nyt.m37112f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
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
                                case wi.dz /*25*/:
                                case wi.dx /*26*/:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                case wi.ai /*79*/:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case 96:
                                case 97:
                                case 98:
                                case 99:
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
                                case 144:
                                case 145:
                                case 146:
                                case 147:
                                case 148:
                                case 149:
                                case 151:
                                case 157:
                                case 160:
                                case 161:
                                case 162:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                case 170:
                                case 171:
                                case 172:
                                case 173:
                                case 174:
                                case 175:
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
                                case 215:
                                case 216:
                                case 217:
                                case 218:
                                case 219:
                                case 220:
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
                                case 241:
                                case 242:
                                case 243:
                                case 244:
                                case 245:
                                case 246:
                                case 249:
                                case 250:
                                case 251:
                                case 252:
                                case 253:
                                case 254:
                                case 255:
                                case 256:
                                case 257:
                                case 258:
                                case 259:
                                case 260:
                                case 261:
                                case 262:
                                case 263:
                                case 264:
                                case 265:
                                case 266:
                                case 267:
                                case 268:
                                case 269:
                                case 270:
                                case 271:
                                case 272:
                                case 273:
                                case 274:
                                case 275:
                                case 276:
                                case 277:
                                case 278:
                                case 279:
                                case 280:
                                case 281:
                                case 282:
                                case 283:
                                case 284:
                                case 285:
                                case 286:
                                case 287:
                                case 288:
                                case 289:
                                case 290:
                                case 291:
                                case 292:
                                case 293:
                                case 294:
                                case 295:
                                case 296:
                                case 297:
                                case 298:
                                case 299:
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
                                case 334:
                                case 335:
                                case 336:
                                case 337:
                                case 338:
                                case 339:
                                case 340:
                                case 342:
                                case 343:
                                case 344:
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
                                case 364:
                                case 365:
                                case 366:
                                case 367:
                                case 368:
                                case 369:
                                case 370:
                                case 371:
                                case 372:
                                case 373:
                                case 374:
                                case 375:
                                case 377:
                                case 378:
                                case 379:
                                case 380:
                                case 382:
                                case 383:
                                case 384:
                                case 385:
                                case 386:
                                case 387:
                                case 388:
                                case 389:
                                case 390:
                                case 391:
                                case 392:
                                case 393:
                                case 394:
                                case 395:
                                case 397:
                                case 398:
                                case 399:
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
                                case 425:
                                case 426:
                                case 427:
                                case 428:
                                case 429:
                                case 430:
                                case 431:
                                case 432:
                                case 433:
                                case 434:
                                case 435:
                                case 436:
                                case 437:
                                case 438:
                                case 439:
                                case 440:
                                case 441:
                                case 442:
                                case 443:
                                case 444:
                                case 445:
                                case 446:
                                case 447:
                                case 448:
                                case 449:
                                case 450:
                                case 451:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f31379a = obj3;
                    }
                    nyt.m37111e(i);
                    continue;
                case wi.dH /*18*/:
                    this.f31380b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31381c = nyt.m37117j();
                    continue;
                case 34:
                    if (this.f31382d == null) {
                        this.f31382d = new nzt();
                    }
                    nyt.m37101a(this.f31382d);
                    continue;
                case 42:
                    if (this.f31383e == null) {
                        this.f31383e = new obt();
                    }
                    nyt.m37101a(this.f31383e);
                    continue;
                case 50:
                    this.f31384f = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f31385g == null) {
                        this.f31385g = new obm();
                    }
                    nyt.m37101a(this.f31385g);
                    continue;
                case 66:
                    this.f31386h = nyt.m37117j();
                    continue;
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
