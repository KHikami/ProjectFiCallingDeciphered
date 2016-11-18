package p000;

import java.util.List;

final class adq {
    final adr f348a;

    public adq(adr adr) {
        this.f348a = adr;
    }

    private void m662a(List<aaa> list, int i, aaa aaa, int i2, aaa aaa2) {
        int i3;
        aaa aaa3;
        int i4 = 0;
        if (aaa.f4b < aaa.f6d) {
            i3 = (aaa2.f4b == aaa.f4b && aaa2.f6d == aaa.f6d - aaa.f4b) ? 1 : 0;
        } else if (aaa2.f4b == aaa.f6d + 1 && aaa2.f6d == aaa.f4b - aaa.f6d) {
            i4 = 1;
            i3 = 1;
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (aaa.f6d < aaa2.f4b) {
            aaa2.f4b--;
        } else if (aaa.f6d < aaa2.f4b + aaa2.f6d) {
            aaa2.f6d--;
            aaa.f3a = 2;
            aaa.f6d = 1;
            if (aaa2.f6d == 0) {
                list.remove(i2);
                this.f348a.m668a(aaa2);
                return;
            }
            return;
        }
        if (aaa.f4b <= aaa2.f4b) {
            aaa2.f4b++;
            aaa3 = null;
        } else if (aaa.f4b < aaa2.f4b + aaa2.f6d) {
            aaa3 = this.f348a.m666a(2, aaa.f4b + 1, (aaa2.f4b + aaa2.f6d) - aaa.f4b, null);
            aaa2.f6d = aaa.f4b - aaa2.f4b;
        } else {
            aaa3 = null;
        }
        if (i3 != 0) {
            list.set(i, aaa2);
            list.remove(i2);
            this.f348a.m668a(aaa);
            return;
        }
        if (i4 != 0) {
            if (aaa3 != null) {
                if (aaa.f4b > aaa3.f4b) {
                    aaa.f4b -= aaa3.f6d;
                }
                if (aaa.f6d > aaa3.f4b) {
                    aaa.f6d -= aaa3.f6d;
                }
            }
            if (aaa.f4b > aaa2.f4b) {
                aaa.f4b -= aaa2.f6d;
            }
            if (aaa.f6d > aaa2.f4b) {
                aaa.f6d -= aaa2.f6d;
            }
        } else {
            if (aaa3 != null) {
                if (aaa.f4b >= aaa3.f4b) {
                    aaa.f4b -= aaa3.f6d;
                }
                if (aaa.f6d >= aaa3.f4b) {
                    aaa.f6d -= aaa3.f6d;
                }
            }
            if (aaa.f4b >= aaa2.f4b) {
                aaa.f4b -= aaa2.f6d;
            }
            if (aaa.f6d >= aaa2.f4b) {
                aaa.f6d -= aaa2.f6d;
            }
        }
        list.set(i, aaa2);
        if (aaa.f4b != aaa.f6d) {
            list.set(i2, aaa);
        } else {
            list.remove(i2);
        }
        if (aaa3 != null) {
            list.add(i, aaa3);
        }
    }

    private void m663b(List<aaa> list, int i, aaa aaa, int i2, aaa aaa2) {
        Object obj;
        Object obj2 = null;
        if (aaa.f6d < aaa2.f4b) {
            aaa2.f4b--;
            obj = null;
        } else if (aaa.f6d < aaa2.f4b + aaa2.f6d) {
            aaa2.f6d--;
            obj = this.f348a.m666a(4, aaa.f4b, 1, aaa2.f5c);
        } else {
            obj = null;
        }
        if (aaa.f4b <= aaa2.f4b) {
            aaa2.f4b++;
        } else if (aaa.f4b < aaa2.f4b + aaa2.f6d) {
            int i3 = (aaa2.f4b + aaa2.f6d) - aaa.f4b;
            obj2 = this.f348a.m666a(4, aaa.f4b + 1, i3, aaa2.f5c);
            aaa2.f6d -= i3;
        }
        list.set(i2, aaa);
        if (aaa2.f6d > 0) {
            list.set(i, aaa2);
        } else {
            list.remove(i);
            this.f348a.m668a(aaa2);
        }
        if (obj != null) {
            list.add(i, obj);
        }
        if (obj2 != null) {
            list.add(i, obj2);
        }
    }

    void m664a(List<aaa> list) {
        while (true) {
            int i;
            aaa aaa;
            int size = list.size() - 1;
            Object obj = null;
            while (size >= 0) {
                Object obj2;
                aaa aaa2;
                int i2;
                if (((aaa) list.get(size)).f3a != 8) {
                    obj2 = 1;
                } else if (obj == null) {
                    obj2 = obj;
                } else if (size != -1) {
                    i = size + 1;
                    aaa = (aaa) list.get(size);
                    aaa2 = (aaa) list.get(i);
                    switch (aaa2.f3a) {
                        case 1:
                            if (aaa.f6d >= aaa2.f4b) {
                                i2 = -1;
                            } else {
                                i2 = 0;
                            }
                            if (aaa.f4b < aaa2.f4b) {
                                i2++;
                            }
                            if (aaa2.f4b <= aaa.f4b) {
                                aaa.f4b += aaa2.f6d;
                            }
                            if (aaa2.f4b <= aaa.f6d) {
                                aaa.f6d += aaa2.f6d;
                            }
                            aaa2.f4b = i2 + aaa2.f4b;
                            list.set(size, aaa2);
                            list.set(i, aaa);
                            break;
                        case 2:
                            m662a(list, size, aaa, i, aaa2);
                            break;
                        case 4:
                            m663b(list, size, aaa, i, aaa2);
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
                aaa = (aaa) list.get(size);
                aaa2 = (aaa) list.get(i);
                switch (aaa2.f3a) {
                    case 1:
                        if (aaa.f6d >= aaa2.f4b) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        if (aaa.f4b < aaa2.f4b) {
                            i2++;
                        }
                        if (aaa2.f4b <= aaa.f4b) {
                            aaa.f4b += aaa2.f6d;
                        }
                        if (aaa2.f4b <= aaa.f6d) {
                            aaa.f6d += aaa2.f6d;
                        }
                        aaa2.f4b = i2 + aaa2.f4b;
                        list.set(size, aaa2);
                        list.set(i, aaa);
                        break;
                    case 2:
                        m662a(list, size, aaa, i, aaa2);
                        break;
                    case 4:
                        m663b(list, size, aaa, i, aaa2);
                        break;
                    default:
                        break;
                }
            }
            return;
        }
    }
}
