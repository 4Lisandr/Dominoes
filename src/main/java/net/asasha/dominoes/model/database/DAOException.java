package net.asasha.dominoes.model.database;

class DAOException extends RuntimeException {

    DAOException(String reason, Throwable cause) {
        super(reason, cause);
    }
}
