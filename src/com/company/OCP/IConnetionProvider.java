package com.company.OCP;

import java.sql.Connection;

public interface IConnetionProvider {
    public Connection establishconnection();
}
