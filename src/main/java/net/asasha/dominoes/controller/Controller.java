package net.asasha.dominoes.controller;


import net.asasha.dominoes.model.database.DatabaseManager;
import net.asasha.dominoes.view.View;

/**
 * Controller of commands, singleton
 */
public final class Controller {
    private static Controller instance;
    private static View view;
    private static DatabaseManager manager;


    private Controller(View view, DatabaseManager manager) {
        Controller.view = view;
        Controller.manager = manager;
        instance = this;
    }

    public static Controller getInstance(View view, DatabaseManager manager) {
        return instance != null ?
                instance:
                new Controller(view, manager);
    }
}
