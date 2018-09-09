package com.example;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;

@Model
public class HelloFrom {
    @Inject
    SecurityContext securityContext;

    public String say() {
        return "Hello from " + securityContext.getCallerPrincipal().getName();
    }
}
