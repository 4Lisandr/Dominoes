package net.asasha.dominoes.view;
/*
* Lisandr
* */
public interface View {

    String read();

    void write(String message);
    void write(String... messages);

    boolean confirm();
}
