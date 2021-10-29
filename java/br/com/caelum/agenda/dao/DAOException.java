package br.com.caelum.agenda.dao;

/*import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.agenda.dao.ConnectorFactory;
import br.com.caelum.agenda.modelo.Contato;*/

public class DAOException extends RuntimeException {
	  public DAOException() {
	        // TODO Auto-generated constructor stub
	    }

	    public DAOException(String message) {
	        super(message);
	        // TODO Auto-generated constructor stub
	    }

	    public DAOException(Throwable cause) {
	        super(cause);
	        // TODO Auto-generated constructor stub
	    }

	    public DAOException(String message, Throwable cause) {
	        super(message, cause);
	        // TODO Auto-generated constructor stub
	    }

	    public DAOException(String message, Throwable cause,
	            boolean enableSuppression, boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	        // TODO Auto-generated constructor stub
	    }

}
