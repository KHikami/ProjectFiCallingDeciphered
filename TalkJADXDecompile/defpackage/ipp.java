package defpackage;

/* renamed from: ipp */
interface ipp<AddResponse extends nzf, ModifyResponse extends nzf, RemoveRequest extends nzf, RemoveResponse extends nzf> {
    mbp a(AddResponse addResponse);

    mbp a(RemoveRequest removeRequest, RemoveResponse removeResponse);

    mbp b(ModifyResponse modifyResponse);
}
