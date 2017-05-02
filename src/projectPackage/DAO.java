package projectPackage;

import java.sql.Connection;

public abstract class DAO<T> {
    public Connection handler = Connexion.getInstance();
    public abstract T find(long id);
    public abstract T create(T obj);
    public abstract T update(T obj);
    public abstract void delete(T obj);
    public abstract T findByLogin(String login);
}