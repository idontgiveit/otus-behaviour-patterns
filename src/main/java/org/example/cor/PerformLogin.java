package org.example.cor;

import org.example.cor.data.AuthCtx;
import org.example.cor.data.Resource;


public class PerformLogin {
    public static void main(String[] args) {
        AuthStep authorizationStep = new AuthorizationStep(null);
        AuthStep authenticationStep = new AuthenticationStep(authorizationStep);
        AuthStep getUserStep = new GetUserStep(authenticationStep);


        AuthCtx ctx = new AuthCtx("red", "redpwd");
        ctx.setResource(new Resource("resource"));

        getUserStep.check(ctx);

        System.out.println(ctx.isGranted());
    }
}
