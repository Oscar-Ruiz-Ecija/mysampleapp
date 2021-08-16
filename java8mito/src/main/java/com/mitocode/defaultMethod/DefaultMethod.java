package com.mitocode.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }



    @Override
    public void caminar() {
        System.out.println("Hola coders");
    }

    @Override
    public void hablar() {
        PersonaA.super.hablar();
    }
}
