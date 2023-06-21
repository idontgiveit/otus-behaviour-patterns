package org.example.cor;

import org.example.cor.data.AuthCtx;
import org.example.cor.data.User;
import org.example.cor.data.UserStorage;


public class GetUserStep extends AuthStep {

    public GetUserStep(final AuthStep next) {
        super(next);
    }

    @Override
    public void check(AuthCtx ctx) {
        System.out.println("---------> Looking for user");
        User user = UserStorage.getUser(ctx.getUserName());
        if (user != null) {
            ctx.setUser(user);
            next(ctx);
        }
    }
}
