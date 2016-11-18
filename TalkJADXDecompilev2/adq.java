package defpackage;

import java.util.List;

final class adq {
    final adr a;

    public adq(adr adr) {
        this.a = adr;
    }

    private void a(List<aaa> list, int i, aaa aaa, int i2, aaa aaa2) {
        int i3;
        aaa aaa3;
        int i4 = 0;
        if (aaa.b < aaa.d) {
            i3 = (aaa2.b == aaa.b && aaa2.d == aaa.d - aaa.b) ? 1 : 0;
        } else if (aaa2.b == aaa.d + 1 && aaa2.d == aaa.b - aaa.d) {
            i4 = 1;
            i3 = 1;
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (aaa.d < aaa2.b) {
            aaa2.b--;
        } else if (aaa.d < aaa2.b + aaa2.d) {
            aaa2.d--;
            aaa.a = 2;
            aaa.d = 1;
            if (aaa2.d == 0) {
                list.remove(i2);
                this.a.a(aaa2);
                return;
            }
            return;
        }
        if (aaa.b <= aaa2.b) {
            aaa2.b++;
            aaa3 = null;
        } else if (aaa.b < aaa2.b + aaa2.d) {
            aaa3 = this.a.a(2, aaa.b + 1, (aaa2.b + aaa2.d) - aaa.b, null);
            aaa2.d = aaa.b - aaa2.b;
        } else {
            aaa3 = null;
        }
        if (i3 != 0) {
            list.set(i, aaa2);
            list.remove(i2);
            this.a.a(aaa);
            return;
        }
        if (i4 != 0) {
            if (aaa3 != null) {
                if (aaa.b > aaa3.b) {
                    aaa.b -= aaa3.d;
                }
                if (aaa.d > aaa3.b) {
                    aaa.d -= aaa3.d;
                }
            }
            if (aaa.b > aaa2.b) {
                aaa.b -= aaa2.d;
            }
            if (aaa.d > aaa2.b) {
                aaa.d -= aaa2.d;
            }
        } else {
            if (aaa3 != null) {
                if (aaa.b >= aaa3.b) {
                    aaa.b -= aaa3.d;
                }
                if (aaa.d >= aaa3.b) {
                    aaa.d -= aaa3.d;
                }
            }
            if (aaa.b >= aaa2.b) {
                aaa.b -= aaa2.d;
            }
            if (aaa.d >= aaa2.b) {
                aaa.d -= aaa2.d;
            }
        }
        list.set(i, aaa2);
        if (aaa.b != aaa.d) {
            list.set(i2, aaa);
        } else {
            list.remove(i2);
        }
        if (aaa3 != null) {
            list.add(i, aaa3);
        }
    }

    private void b(List<aaa> list, int i, aaa aaa, int i2, aaa aaa2) {
        Object obj;
        Object obj2 = null;
        if (aaa.d < aaa2.b) {
            aaa2.b--;
            obj = null;
        } else if (aaa.d < aaa2.b + aaa2.d) {
            aaa2.d--;
            obj = this.a.a(4, aaa.b, 1, aaa2.c);
        } else {
            obj = null;
        }
        if (aaa.b <= aaa2.b) {
            aaa2.b++;
        } else if (aaa.b < aaa2.b + aaa2.d) {
            int i3 = (aaa2.b + aaa2.d) - aaa.b;
            obj2 = this.a.a(4, aaa.b + 1, i3, aaa2.c);
            aaa2.d -= i3;
        }
        list.set(i2, aaa);
        if (aaa2.d > 0) {
            list.set(i, aaa2);
        } else {
            list.remove(i);
            this.a.a(aaa2);
        }
        if (obj != null) {
            list.add(i, obj);
        }
        if (obj2 != null) {
            list.add(i, obj2);
        }
    }

    void a(List<aaa> list) {
        while (true) {
            aaa aaa;
            int size = list.size() - 1;
            Object obj = null;
            while (size >= 0) {
                Object obj2;
                int i;
                aaa aaa2;
                int i2;
                if (((aaa) list.get(size)).a != 8) {
                    obj2 = 1;
                } else if (obj == null) {
                    obj2 = obj;
                } else if (size != -1) {
                    i = size + 1;
                    aaa2 = (aaa) list.get(size);
                    aaa = (aaa) list.get(i);
                    switch (aaa.a) {
                        case 1:
                            if (aaa2.d >= aaa.b) {
                                i2 = -1;
                            } else {
                                i2 = 0;
                            }
                            if (aaa2.b < aaa.b) {
                                i2++;
                            }
                            if (aaa.b <= aaa2.b) {
                                aaa2.b += aaa.d;
                            }
                            if (aaa.b <= aaa2.d) {
                                aaa2.d += aaa.d;
                            }
                            aaa.b = i2 + aaa.b;
                            list.set(size, aaa);
                            list.set(i, aaa2);
                            break;
                        case 2:
                            a(list, size, aaa2, i, aaa);
                            break;
                        case 4:
                            b(list, size, aaa2, i, aaa);
                            break;
                        default:
                            break;
                    }
                } else {
                    return;
                }
                size--;
                obj = obj2;
            }
            size = -1;
            if (size != -1) {
                i = size + 1;
                aaa2 = (aaa) list.get(size);
                aaa = (aaa) list.get(i);
                switch (aaa.a) {
                    case 1:
                        if (aaa2.d >= aaa.b) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        if (aaa2.b < aaa.b) {
                            i2++;
                        }
                        if (aaa.b <= aaa2.b) {
                            aaa2.b += aaa.d;
                        }
                        if (aaa.b <= aaa2.d) {
                            aaa2.d += aaa.d;
                        }
                        aaa.b = i2 + aaa.b;
                        list.set(size, aaa);
                        list.set(i, aaa2);
                        break;
                    case 2:
                        a(list, size, aaa2, i, aaa);
                        break;
                    case 4:
                        b(list, size, aaa2, i, aaa);
                        break;
                    default:
                        break;
                }
            }
            return;
        }
    }
}
